public class Numeros{
	public static void main(String[] args){
		/* Tipos de numeros enteros */
		byte b = Byte.MAX_VALUE; // 127 
		short s = Short.MAX_VALUE; // 32767
		int i = Integer.MAX_VALUE; // 2147483647
		long l = Long.MAX_VALUE; // 9223372036854775807

		/* Tipos de datos reales */
		float f = Float.MAX_VALUE; // 3.4028235E38
		double d = Double.MAX_VALUE; // 1.7976931348623157E308

		System.out.println("byte: " + b);
		System.out.println("short" + s);
		System.out.println("int:" + i);
		System.out.println("long:" + l);
		System.out.println("float:" + f);
		System.out.println("double:" + d);
	}
}