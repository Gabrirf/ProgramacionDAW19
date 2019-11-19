import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potencia\n6. Factorial\n7. Salir");
        System.out.print("\nElija una opcion: ");
        int elec = sc.nextInt();
        while(elec!=7){

            switch(elec){

                case 1:
                    System.out.print("\nIntroduzca A: ");
                    int a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    int b = sc.nextInt();
                    int sol = a+b;
                    System.out.println("El resultado es: "+sol);
                    break;

                case 2:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    sol = a-b;
                    System.out.println("El resultado es: "+sol);
                    break;

                case 3:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    sol = a*b;
                    System.out.println("El resultado es: "+sol);
                    break;

                case 4:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    double sol1 = a/b;
                    System.out.println("El resultado es: "+sol1);
                    break;

                case 5:
                    System.out.print("\nIntroduzca A: ");
                    a = sc.nextInt();
                    System.out.print("Introduzca B: ");
                    b = sc.nextInt();
                    sol1 = Math.pow(a, b);
                    System.out.println("El resultado es: "+sol1);
                    break;

                case 6:
                    System.out.println("Introduzca un numero: ");
                    int n = sc.nextInt();
            
                    int res = 1;
            
                    while(n!=0){
                        res = res*n;
                        n--;
                    }
                    System.out.println("El resultado es: "+res);
                    break;
                
            }

            System.out.println("\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Potencia\n6. Factorial\n7. Salir");
            System.out.print("\nElija una opcion: ");
            elec = sc.nextInt();
        }
        sc.close();
    }
}