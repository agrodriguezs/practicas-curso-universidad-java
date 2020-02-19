package practicas1;

public class DatosPrimitivos {

	public static void main(String[] args) {
		// byte, short, int, long
		
		byte byteVar = 127;
		System.out.println("byteVar: " + byteVar);
		System.out.print("bits tipo byte: " + Byte.SIZE );
		System.out.print(", bytes tipo byte: " + Byte.BYTES);
		System.out.println(", valor maximo tipo byte: " + Byte.MAX_VALUE);
		System.out.println("..............................................." );
		short shortVar = 32767;
		System.out.println("shortVar: " + shortVar);
		System.out.print("bits tipo short: " + Short.SIZE );
		System.out.print(", bytes tipo short: " + Short.BYTES);
		System.out.println(", valor maximo tipo short: " + Short.MAX_VALUE);
		System.out.println("..............................................." );
		int intVar = 2147483647;
		System.out.println("intVar: " + intVar);
		System.out.print("bits tipo int: " + Integer.SIZE );
		System.out.print(", bytes tipo int: " + Integer.BYTES);
		System.out.println(", valor maximo tipo int: " + Integer.MAX_VALUE);
		System.out.println("..............................................." );
		long longVar = 214748364788888L;
		System.out.println("longVar: " + longVar);
		System.out.print("bits tipo long: " + Long.SIZE );
		System.out.print(", bytes tipo long: " + Long.BYTES);
		System.out.println(", valor maximo tipo long: " + Long.MAX_VALUE);
		System.out.println("..............................................." );
		float floatVar = 1000.10f;
		System.out.println("floatVar: " + floatVar);
		System.out.print("bits tipo float: " + Float.SIZE );
		System.out.print(", bytes tipo float: " + Float.BYTES);
		System.out.println(", valor maximo tipo float: " + Float.MAX_VALUE);
		System.out.println("..............................................." );
		double doubleVar = 1000.1880D;
		System.out.println("doubleVar: " + doubleVar);
		System.out.print("bits tipo double: " + Double.SIZE );
		System.out.print(", bytes tipo double: " + Double.BYTES);
		System.out.println(", valor maximo tipo double: " + Double.MAX_VALUE);
		System.out.println("..............................................." );
		
		char chartSymbol = '!';
		char chartDecimal = '\u0021';
		char chartVar = 33;
		System.out.println("chartSymbol: " + chartSymbol);
		System.out.println("chartDecimal: " + chartDecimal);
		System.out.println("chartVar: " + chartVar);
		
		System.out.print("bits tipo chart: " + Character.SIZE );
		System.out.print(", bytes tipo chart: " + Character.BYTES);
		System.out.println(", valor maximo tipo chart: " + Character.MAX_VALUE);
		System.out.println("..............................................." );
		
		// varuables tipo boolean
		System.out.println("Los booleans pueden ser: " + Boolean.TRUE + " o " +Boolean.FALSE);
		
		
		int numeroDecimal = 10;
		System.out.println("numeroDecimal: " + numeroDecimal);
		System.out.println("..............................................." );
		int numeroOctal = 012;
		System.out.println("numeroOctal: " + numeroOctal);
		System.out.println("..............................................." );
		int numeroHexadecimal = 0xA;
		System.out.println("numeroHexadecimal: " + numeroHexadecimal);
		System.out.println("..............................................." );
		int numeroBinario= 0B1010;
		System.out.println("numeroBinario: " + numeroBinario);
		System.out.println("..............................................." );
	}
	

}
