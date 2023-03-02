package ejercicio16;

public class Morse {
	/**
	 * Clase Main donde se probran los casos indicades en el ejercicio
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Palabra sin espacios ni acento
		String palabra1 = "Bienvenido";
		// Oracion con espacios
		String palabra3 = "El capitan del barco no esta aqui";

		// Salida en Morse
		System.out.println("Mensaje original: " + palabra1);
		System.out.println("Mensaje traducido: " + CodigoMorse.traductor(palabra1));
		System.out.println("");


		System.out.println("Mensaje original: " + palabra3);
		System.out.println("Mensaje traducido: " + CodigoMorse.traductor(palabra3));
		System.out.println("");
	}

}
