package ejercicios;

import java.util.*;

public class ejercicio3 {
	/*
	 * 3. Programa que lee nombre y primer apellido de personas. Para cada una
	 * de ellas genera un c�digo con la primera letra del nombre y las tres
	 * primeras del apellido. Si dicho apellido tiene una longitud inferior a 3,
	 * se le pide el segundo apellido y se cogen sus tres primeras letras. Si
	 * �ste, tambi�n tiene menos longitud se genera el c�digo con la primera del
	 * nombre y el apellido completo que sea m�s largo de los dos. El c�digo se
	 * genera en una funci�n.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido, apellido2;

		System.out.println("Bienvenido al programa");
		System.out.println("-------------------------------------------");
		do {
			System.out.println("Introduce tu nombre para generar el codigo");
			nombre = sc.nextLine();
			System.out.println("Introduce tu primer apellido para generar el codigo");
			apellido = sc.nextLine();
			System.out.println("Introduce tu segundo apellido para generar el codigo");
			apellido2 = sc.nextLine();
			System.out.println(validarCodigo(nombre, apellido, apellido2).toUpperCase());
		} while (!nombre.equals("."));
	}

	public static String validarCodigo(String nombre, String apellido, String apellido2) {
		String codigo="";
		if (apellido.length() >= 3) {
			return codigo = nombre.substring(0, 1) + apellido.substring(0, 3);
		}
		if (apellido.length() < 3) {
			return codigo = nombre.substring(0, 1) + apellido2.substring(0, 3);
		}
		if (apellido.length() < 3 && apellido2.length() < 3 
				&& apellido.length() > apellido2.length()){
				return codigo = nombre.substring(0, 1) + apellido;
		}else{
				return codigo = nombre.substring(0, 1) + apellido2;
		}
	
	}

}
