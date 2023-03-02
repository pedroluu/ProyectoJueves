package ejercicio22;

import java.util.Scanner;

public class MetodosAhorcado {

	static void Ahorcado() {
		String arrayPalabras[]=new String[4];
		arrayPalabras[0]="sol";
		arrayPalabras[1]="casa";
		arrayPalabras[2]="luz";
		arrayPalabras[3]="Eladio Carrion";
		int random;
		random = (int) (Math.random() * 4);

		

		// Hago un array de letras para contar las letras de la palabra y mediante un
		// bucle for cambio esas letras por guiones.
		char[] letras = arrayPalabras[random].toCharArray();
		char[] letrasGuiones = new char[letras.length];
		for (int i = 0; i < letras.length; i++) {
			letrasGuiones[i] = '_';
		}

		// Hago un bucle do/while para que mientras no se haya acertado se repita la
		// pregunta durante el numero de intentos establecido que serian 7. La letra se
		// pide por teclado.
		boolean ganar = false;
		Scanner teclado = new Scanner(System.in);
		int intentos = 3;

		System.out.println("BIENVENIDO AL AHORCADO . Tienes " + intentos + " intentos");
		System.out.println("Aqui abajo veras los guiones para ver el tamaño de la palabra");
		do {

			System.out.println(letrasGuiones);
			System.out.print("Elige 1 para resolverlo letra a letra o 2 para resolverlo directamente: ");
			int op = 0;
			op = teclado.nextInt();
			if (op == 1) {
				System.out.print("Escribe una letra que pueda pertenecer a la palabra: ");

				// Se va comparando la letra introducida por teclado con la letra
				// correspondiente de la palabra que intentamos adivinar.
				char letra = teclado.next().charAt(0);
				boolean letraAcertada = false;

				for (int i = 0; i < arrayPalabras[random].length(); i++) {
					if (arrayPalabras[random].charAt(i) == letra) {
						letrasGuiones[i] = letra;
						letraAcertada = true;
					}
				}

				// Si la letra no es acertada se resta un intento y se va pintando el muñeco,
				// por cada fallo cometido se le añade una parte al muñeco y te da un mensaje
				// para que sepas que has fallado hasta que te quedas sin intentos.
				if (!letraAcertada) {
					System.out.println("Has fallado ");
					--intentos;
					muñecofacil(intentos);

					if (intentos == 0) {
						System.out.println("Te has quedado sin intentos.");
						ganar = true;
					}

					// Con este else comprobamos si hemos acertado la palabra. conGuiones explicado
					// mas abajo.
				} else {
					boolean acertado = !conGuiones(letrasGuiones);
					if (acertado) {
						System.out.println("Has acertado la palabra " + arrayPalabras[random]);
						ganar = true;
					}
				}
			}
			if (op == 2) {
				System.out.print("Introduce la palabra que creas que es la correcta: ");
				String palabrar = teclado.next();
				if (palabrar.equals(arrayPalabras[random])) {
					System.out.println("Has acertado la palabra ");
					ganar = true;
				}
				if (!palabrar.equals(arrayPalabras[random])) {
					System.out.println("Has fallado.");
					--intentos;
					muñecofacil(intentos);

				}
				if (intentos == 0) {
					System.out.println("Te has quedado sin intentos.");
					ganar = true;
				}
			}

		} while (!ganar);
	}

	// conGuiones sirve para comprobar que hemos acertado la palabra y lo comprueba
	// viendo si quedan o no guiones en la palabra. Si no quedan hemos acertado.
	static boolean conGuiones(char[] array) {
		{
			for (char letra : array) {
				if (letra == '_') {
					return true;
				}
			}
			return false;
		}
	}

	// Con muñeco lo que se hace es ir imprimiendo el cuerpo del muñeco segun el
	// numero de intentos que le quedan al jugador hasta que agota los intentos y
	// pierde.
	private static void muñecofacil(int intentos) {
		if (intentos == 2) {
			System.out.println("----------");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|          ");
			System.out.println("|            ");
			System.out.println("|            ");
		}

		if (intentos == 1) {
			System.out.println("----------");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|\\");
			System.out.println("|         |  ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
		}

		if (intentos == 0) {
			System.out.println("----------");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("|         0");
			System.out.println("|        /|\\");
			System.out.println("|         |  ");
			System.out.println("|        / \\");
			System.out.println("|            ");
			System.out.println("|            ");
			System.out.println("|            ");
		}

		{
		}

	}
}
