public class FuncionesParametros {

    public static void main(String[] args){
        /* No enviar nada */
        mostrar();
        /* Enviar un solo numero */
        mostrar(7);
        /* Enviar array de numeros */
        int[] numeros = {1,2,3,4,5,6,7};
        mostrar(numeros);
        /* Enviar sueltos y tratar como array */
        mostrarSueltos(1,2,3,4,5,6,7);
    }

    public static void mostrar(){
        System.out.println("Hola Mundo!");
    }

    public static void mostrar(int numero){
        System.out.println("El numero es:" + numero);
    }

    public static void mostrar(int[] numeros){
        System.out.print("[ ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] +" ");
        }
        System.out.println("]");
    }

    public static void mostrarSueltos(int a, int... numeros){
        System.out.print("[ ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i] +" ");
        }
        System.out.println("]");
    }
}