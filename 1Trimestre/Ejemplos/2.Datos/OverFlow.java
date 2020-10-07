public class OverFlow{
	public static void main(String[] args){
		byte b = Byte.MAX_VALUE; // 127 = 2^7-1 por complemento A2
		System.out.println(b);
		b++;
		System.out.println(b);

	}
}