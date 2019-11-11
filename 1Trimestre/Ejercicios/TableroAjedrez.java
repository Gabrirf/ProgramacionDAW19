public class TableroAjedrez{
    public static void main(String[] args) {
        for(int i = 0 ; i<=8; i++){
            System.out.print(i+" ");
        }

        System.out.println(" ");

        
        for(int u = 0; u<8; u++){
            System.out.print((char)('A'+u)+" ");
            for(int j = 0; j <8;j++){
        
                if(u%2!=0){
                    if(j%2!=0){
                        System.out.print(" "+" ");
                    }
                    if(j%2==0){
                        System.out.print('#'+" ");
                    }
                }

                if(u%2==0){
                    if(j%2!=0){
                        System.out.print('#'+" ");
                    }
                    if(j%2==0){
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}