package practicas1;

import java.util.Scanner;

public class TiendadeLibros {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Proporciona el nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Proporciona el id: ");
		int idLibro = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Proporciona el precio: ");
		double precio = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Proporciona el simbolo: ");
		char simbolo = scanner.nextLine().charAt(0);
		
		System.out.println("Proporciona el envio gratuito: ");
		boolean envio = Boolean.parseBoolean(scanner.nextLine());
		
		System.out.println(nombre + " #" + idLibro);
		System.out.println("Precio: " + simbolo + precio);
		System.out.println("Envio Gratuito: " + envio);
		
	}

}
