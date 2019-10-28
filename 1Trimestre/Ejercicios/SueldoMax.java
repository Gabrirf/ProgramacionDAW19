import java.util.Scanner;
public class SueldoMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de salarios a introducir: ");
        int n = sc.nextInt();
        int salMax = 0;

        for(int i = 0; i<n; i++){

            System.out.print("\nIntroduce salario: ");
            int sal = sc.nextInt();

            if(sal>salMax){
                salMax = sal;
            }
        }
        System.out.println("El salario maximo es el de "+salMax+" euros.");
        sc.close();
    }
}