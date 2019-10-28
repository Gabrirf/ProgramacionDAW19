import java.util.Scanner;

public class Numeros10{
    public static void main(String[] args) {

        int nulos=0;
        int negativo=0;
        int positivo=0;

        Scanner sc = new Scanner(System.in);
        

        int [] myArray = new int[10];
        System.out.println("Escribe 10 numeros: ");

        for(int i=0; i<=9; i++ ) {

            myArray[i] = sc.nextInt();
            if(myArray[i]==0){
                nulos++;
            }else if(myArray[i]<0){
                negativo++;
            }else if(myArray[i]>0){
                positivo++;
            }

        }

        if(nulos>0){
            System.out.println("Has introducido "+nulos+" ceros.");
        }
        if(negativo>0){
            System.out.println("Has introducido "+negativo+" numeros negativos.");
        }
        if(positivo>0){
            System.out.println("Has introducido "+positivo+" numeros positivos.");
        }

        sc.close();
        
    }
}