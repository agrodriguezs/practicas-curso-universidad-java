package practicas1;
import java.util.Scanner;
public class NumeroMayor {
	public static void main(String[] args) {
		int numero1, numero2, mayor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Proporciona el numero1: ");
		numero1 = Integer.parseInt(scanner.nextLine());
		System.out.println("Proporciona el numero2: ");
		numero2 = Integer.parseInt(scanner.nextLine());
		mayor=(numero1>numero2)?numero1:numero2;
		System.out.println("El número mayor es: " + mayor );
	}
}
