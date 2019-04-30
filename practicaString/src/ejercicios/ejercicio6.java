package ejercicios;

import java.util.*;

public class ejercicio6 {
	/*
	 * 6. Programa que nos dice si una palabra se lee igual del derecho que del
	 * revés.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra;
		int i, k, check = 1;

		System.out.println("Introduce la palabra para determinar si se lee al reves");
		palabra = sc.nextLine();
		k = palabra.length() - 1;

		for (i = 0; i < palabra.length() / 2; i++) {
			if (palabra.charAt(i) != palabra.charAt(k)) {
				check = 0;
				break;
			}
			k--;
		}
	if(check==1)
		System.out.println("Si, se lee al reves");
	else
		System.out.println("No se lee al reves");
	}

}
