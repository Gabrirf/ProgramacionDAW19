import java.util.Arrays;

public class Arrays3{
    public static void main(String[] args) {
        
        int [] ar1 = {1, 2, 3, 4, 5, 6};
        int [] ar2 = {10, 20, 30, 40, 50, 60};

        int [] arF = new int[ar1.length + ar2.length];

        for(int i = 0; i<1; i++){

            for(int u = i; u<ar1.length/2; u++){
                arF[u] = ar1[u];
            }

            for(int j = i+3; j<ar2.length; j++){
                arF[j] = ar2[j-3];
            }

        }

        for(int i = 3; i<5; i++){

            for(int u = i; u<ar1.length; u++){
                arF[u+3] = ar1[u];
            }

            for(int j = i+6; j<ar2.length*2; j++){
                arF[j] = ar2[j-6];
            }

        }

        System.out.println(Arrays.toString(arF));
    }
}