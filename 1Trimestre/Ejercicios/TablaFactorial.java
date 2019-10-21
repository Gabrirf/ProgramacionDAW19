public class TablaFactorial{

    public static void main(String[] args) {

        for(int n = 1; n<=10; n++){
            
            int res = n;
            
            for(int i = n-1; i>=1; i--){
                res = res*i;
            }

            System.out.print("El resultado es: "+res);
            System.out.println(" ");

        }
    }

}
