package ejercicios;
import java.util.*;
public class ejercicio2 {
	/*2. Programa que lee nombres de ciudades europeas y cuenta cuantas empiezan
	por una letra introducida por teclado*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ciudades;
		int cont = 0;
		char letra;
		System.out.println("Introduce la inicial");
		letra=sc.nextLine().charAt(0);
		do{
		System.out.println("Anota las ciudades");
		ciudades=sc.nextLine();
		if(ciudades.charAt(0)==letra){
		cont++;
		}
		}while(!ciudades.equalsIgnoreCase("fin"));
		System.out.println(cont);
	}

}
