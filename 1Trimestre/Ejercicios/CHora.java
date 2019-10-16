import java.util.Scanner;

public class CHora{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("H: ");
        int h = sc.nextInt();

        System.out.println("M: ");
        int m = sc.nextInt();

        System.out.println("s: ");
        int s = sc.nextInt();

        if(h>=0 && h<=23 && m>=0 && m<=59 && s>=0 && s<=59){

            System.out.println("Correct");

        }else{

            System.out.println("Incorrect");

        }
        
    }

}