import java.util.Scanner; //Importar metodo scanner

public class Comparacion{
    
    public static void main(String[] args) {
        

        Scanner p1 = new Scanner(System.in);      //Declaracion de dato de tipo Scanner p1
        System.out.println("Introduce el valor de A: ");
        int a = p1.nextInt(); //Texto que ve el cliente y mete el valor


        Scanner p2 = new Scanner(System.in);      //Declaracion de dato de tipo Scanner p2
        System.out.println("Introduce el valor de B: ");  //Texto que ve el cliente y mete el valor
        int b = p2.nextInt();


        Scanner p3 = new Scanner(System.in);        //Declaracion de dato de tipo Scanner p3
        System.out.println("Introduce el valor de C: ");   //Texto que ve el cliente y mete el valor
        int c = p3.nextInt();

        

        if(a==b && a==c){

            System.out.println("Son iguales.");

        }else if(a>b && a>c){

            System.out.println("A es el Mayor");

        }else if(b>c){

            System.out.println("B es el Mayor");

        }else{

            System.out.println("C es el Mayor");

        }


    }
}