package ejercicios;
import java.util.*;
public class ejercicio1 {
	/*1. Programa que lee cadenas hasta anotar “fin” y las muestra en mayúsculas.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cadena;
		do{
		System.out.println("Escribe las palabras");
		cadena=sc.nextLine();
		System.out.println(cadena.toUpperCase());
		}while(!cadena.equalsIgnoreCase("fin"));
		
	}

}
