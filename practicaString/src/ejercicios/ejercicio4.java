package ejercicios;

import java.util.*;

public class ejercicio4 {
	/*
	 * 4. Programa que valida un DNI introducido por teclado. Utilizar una
	 * función para validarlo
	 */
	private final static String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	private final static String letrasnie= "XYZ";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dni,nie;
		System.out.println("Validacion del DNI y NIE");
		System.out.println("------------------");
		System.out.println("Introduce tu DNI");
		dni = sc.nextLine();
		System.out.println(validarDni(dni.toUpperCase()));
		System.out.println("Introduce tu NIE");
		nie = sc.nextLine();
		System.out.println(validarNie(nie.toUpperCase()));
	}

	public static String validarDni(String dni) {
		int numDNI;
		char letraDNI = dni.charAt(dni.length() - 1);
		numDNI = Integer.parseInt(dni.substring(0, dni.length() - 1));
		if (letras.charAt(numDNI % 23) == letraDNI) {
			return dni;
		} else {
			return "No valido";
		}
		
	}
	public static String validarNie(String nie) {
		/*Para el siguiente NIE: Z1234567 se sustituye la Z por 2 quedando: 
		21234567 dividido entre 23 tiene como resto 1 por lo que la letra
		de este NIE sería la R. El NIE sería Z1234567R.*/
		int numNIE;
		String nuevaLetra="";
		char Primeraletra=nie.charAt(0);
		if (Primeraletra=='X'){
			nuevaLetra="0";	
			}
		if (Primeraletra=='Y'){
			nuevaLetra="1";
			}
		if (Primeraletra=='Z'){
			nuevaLetra="2";
			}
		char letraNIE = nie.charAt(nie.length() - 1);
		numNIE = Integer.parseInt(nuevaLetra + nie.substring(1, nie.length() - 1));
		
		if (letras.charAt((numNIE) % 23) == letraNIE) {
			return nie;
		} else {
			return "No valido";
		}
		
	}
	
}