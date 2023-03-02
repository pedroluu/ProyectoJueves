package ejercicio16;

public class CodigoMorse {

	/**
	 * Metodo que comprueba caracter a caracter el String palabra y el resultado se
	 * almacena en otra varialble String que se retornara para ver el resultado por
	 * consola
	 * 
	 * @param palabra
	 * @return mensaje Morse
	 */
	public static String traductor(String palabra) {

		String mensaje = "";

		// Constantes de letras a Morse
		final String A = " .-";
		final String B = " -...";
		final String C = " -.-.";
		final String D = " -..";
		final String E = " .";
		final String F = " ..-.";
		final String G = " --.";
		final String H = " ....";
		final String I = " ..";
		final String J = " .---";
		final String K = " -.-";
		final String L = " .-..";
		final String M = " --";
		final String N = " -.";
		final String O = " ---";
		final String P = " .--.";
		final String Q = " --.-";
		final String R = " .-.";
		final String S = " ...";
		final String T = " -";
		final String U = " ..-";
		final String V = " ...-";
		final String W = " .--";
		final String X = " -..-";
		final String Y = " -.--";
		final String Z = " --..";

		// Constantes de numeros a Morse
		final String uno = ".----";
		final String dos = "..---";
		final String tres = "...--";
		final String cuatro = "....-";
		final String cinco = ".....";
		final String seis = "-....";
		final String siete = "--...";
		final String ocho = "---..";
		final String nueve = "----.";
		final String cero = "-----";

		/*
		 * En el switch se contemplan los siguientes caracateres:
		 * 
		 * - minusculas (vocales)
		 * 
		 * - mayusculas (vocales y consonantes)
		 * 
		 * - Espacios en blanco
		 * 
		 * Todos los caracteres especiales que no se englobne en lo anterior, se tratara
		 * como error y saldra un mensaje en consola de ERROR
		 */
		for (int i = 0; i < palabra.length(); i++) {

			switch (palabra.charAt(i)) {
			case 'a',  'A':
				mensaje = mensaje + A;
				break;
			case 'b', 'B':
				mensaje = mensaje + B;
				break;
			case 'c', 'C':
				mensaje = mensaje + C;
				break;
			case 'd', 'D':
				mensaje = mensaje + D;
				break;
			case 'e', 'E':
				mensaje = mensaje + E;
				break;
			case 'f', 'F':
				mensaje = mensaje + F;
				break;
			case 'g', 'G':
				mensaje = mensaje + G;
				break;
			case 'h', 'H':
				mensaje = mensaje + H;
				break;
			case 'i',  'I':
				mensaje = mensaje + I;
				break;
			case 'j', 'J':
				mensaje = mensaje + J;
				break;
			case 'k', 'K':
				mensaje = mensaje + K;
				break;
			case 'l', 'L':
				mensaje = mensaje + L;
				break;
			case 'm', 'M':
				mensaje = mensaje + M;
				break;
			case 'n', 'N':
				mensaje = mensaje + N;
				break;
			case 'o',  'O':
				mensaje = mensaje + O;
				break;
			case 'p', 'P':
				mensaje = mensaje + P;
				break;
			case 'q', 'Q':
				mensaje = mensaje + Q;
				break;
			case 'r', 'R':
				mensaje = mensaje + R;
				break;
			case 's', 'S':
				mensaje = mensaje + S;
				break;
			case 't', 'T':
				mensaje = mensaje + T;
				break;
			case 'u', 'U':
				mensaje = mensaje + U;
				break;
			case 'v', 'V':
				mensaje = mensaje + V;
				break;
			case 'w', 'W':
				mensaje = mensaje + W;
				break;
			case 'x', 'X':
				mensaje = mensaje + X;
				break;
			case 'y', 'Y':
				mensaje = mensaje + Y;
				break;
			case 'z', 'Z':
				mensaje = mensaje + Z;
				break;
			case 1:
				mensaje = mensaje + uno;
				break;
			case 2:
				mensaje = mensaje + dos;
				break;
			case 3:
				mensaje = mensaje + tres;
				break;
			case 4:
				mensaje = mensaje + cuatro;
				break;
			case 5:
				mensaje = mensaje + cinco;
				break;
			case 6:
				mensaje = mensaje + seis;
				break;
			case 7:
				mensaje = mensaje + siete;
				break;
			case 8:
				mensaje = mensaje + ocho;
				break;
			case 9:
				mensaje = mensaje + nueve;
				break;
			case 0:
				mensaje = mensaje + cero;
				break;
			case ' ':
				mensaje = mensaje + " ";
				break;
			default:
				System.out.println("Se ha encontrado un caracter que no es alfanumérico...");
				System.out.println("Reescriba el mensaje...");
				break;
			}
		}
		// Retorna el manesaje traducido a Morse
		return mensaje;

	}

}
