package practicas1;

public class Expresion {

	public static void main(String[] args) {	
		
		
		
		int a = 2;
		int b = 3;
	
		int operacion1, operacion2, operacion3, operacion4, operacion5;
		operacion1 = 6 / ++a;
		System.out.println(" " + operacion1);
		
		operacion2 =  operacion1*4;
		System.out.println(" " + operacion2);
		
		operacion3 =  -3 - b--;
		System.out.println(" " + operacion3);
		
		operacion4 =  operacion2 + b;
		System.out.println(" " + operacion4);
		
		operacion5 =  operacion3 + operacion4;
		System.out.println(" " + operacion5);
	}

}
