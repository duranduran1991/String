package ejercicios;

import java.util.*;

public class ejercicio5 {
	/*
	 * 5. Programa que lee tres cadenas y las escribe por orden alfabético,
	 * ignorando mayúsculas y minúsculas.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1, cadena2, cadena3;

		System.out.println("Escribe la cadena 1");
		cadena1 = sc.nextLine();
		System.out.println("Escribe la cadena 2");
		cadena2 = sc.nextLine();
		System.out.println("Escribe la cadena 3");
		cadena3 = sc.nextLine();

		if (cadena1.compareToIgnoreCase(cadena2) < 0 
				&& cadena1.compareToIgnoreCase(cadena3) < 0) {
				if (cadena2.compareToIgnoreCase(cadena3) < 0)
			System.out.println(cadena1 + ", " + cadena2 + ", " + cadena3);
		else
			System.out.println(cadena1 + ", " + cadena3 +  ", " + cadena2);
		}
		if (cadena2.compareToIgnoreCase(cadena1) < 0 
				&& cadena2.compareToIgnoreCase(cadena3) < 0){
				if (cadena1.compareToIgnoreCase(cadena3) < 0)
			System.out.println(cadena2 + ", " + cadena1 + ", " + cadena3);
		else
			 System.out.println(cadena2 + ", " + cadena3 + ", " + cadena1); 
		}
		if (cadena3.compareToIgnoreCase(cadena1) < 0 
				&& cadena3.compareToIgnoreCase(cadena2) < 0){
				if (cadena2.compareToIgnoreCase(cadena1) < 0)
			System.out.println(cadena3 + ", " + cadena2 + ", " + cadena1);
		else
			System.out.println(cadena3 + ", " + cadena1 + ", " + cadena2);
		}

	}

}
