import java.util.Scanner;

public class MenuFunciones{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n0. Salir");

        System.out.print("\nElija una opcion: ");
        int elec = sc.nextInt();

        while(elec==1 || elec==2 || elec == 3 || elec==4){

            switch(elec){

                case 1:
                    System.out.print("\nIntroduzca A: ");
                    int a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    int b = sc.nextInt();
                    System.out.println("El resultado es: "+sum(a, b));
                    break;

                case 2:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    System.out.println("El resultado es: "+rest(a, b));
                    break;

                case 3:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    System.out.println("El resultado es: "+mult(a, b));
                    break;

                case 4:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    System.out.println("El resultado es: "+div(a, b));
                    break;
                    
                
            }

            System.out.println("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n0. Salir");
            System.out.print("\nElija una opcion: ");
            elec = sc.nextInt();
        }
        
        sc.close();
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int rest(int a, int b){
        return a-b;
    }

    public static int mult(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }
}