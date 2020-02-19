package practicas1;

import java.util.Scanner;

public class Libros {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Proporciona el titulo: ");
		
		String titulo= entrada.nextLine();
		
		System.out.println("Proporciona el autor: ");
		
		String autor = entrada.nextLine();
		
		System.out.println(titulo+ " fue escrito por " + autor);
	}
}

