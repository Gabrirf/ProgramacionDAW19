public class Logicos{
	public static void main(String[] args) {
		
        boolean verdadero = !false;

        /* OR */
        boolean or1 = true || true; // La segunda operación nunca se comprueba
        boolean or2 = true || false;
        boolean or3 = false || true;
        boolean or4 = false || false;
         

        /* AND */
        boolean and1 = true && true;
        boolean and2 = true && false;
        boolean and3 = false && true; // La segunda operación nunca se comprueba
        boolean and4 = false && false;

		System.out.println("Verdadero:" + verdadero);

		System.out.println("OR 1:" + or1);
		System.out.println("OR 2:" + or2);
		System.out.println("OR 3:" + or3);
		System.out.println("OR 4:" + or4);

		System.out.println("AND 1:" + and1);
		System.out.println("AND 2:" + and2);
		System.out.println("AND 3:" + and3);
		System.out.println("AND 4:" + and4);

	}
}