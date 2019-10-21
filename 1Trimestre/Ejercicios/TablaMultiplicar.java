import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TablaMultiplicar{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.print(n*i+", ");
        }
        sc.close();

    }
}