package practicas1;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alto = 0, ancho = 0;
		System.out.println("Proporciona el alto: ");
		alto = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Proporciona el ancho: ");
		ancho = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Area: " + (alto*ancho));
		System.out.println("Perimetro: " + ((alto + ancho) * 2));

	}

}
