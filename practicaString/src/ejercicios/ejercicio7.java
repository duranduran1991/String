package ejercicios;

import java.util.*;

public class ejercicio7 {
	/*
	 * 7. Programa que lee una cadena y un carácter y cuenta el número de veces
	 * que aparece dicho carácter en la cadena.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena;
		char caracter;

		System.out.println("Escribe la cadena");
		cadena = sc.nextLine();
		System.out.println("Escribe el caracter");
		caracter = sc.nextLine().charAt(0);
		System.out.println(compararCadenas(cadena,caracter));
	}

	public static int compararCadenas(String cadena, char caracter) {
		int cont = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==caracter) {
				cont++;
			}
		}
		return cont;

	}
}