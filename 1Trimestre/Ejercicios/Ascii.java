public class Ascii{
    public static void main(String[] args) {
        int i = -1;
        for(char j=0;j<=255;j++){
            i++;
            System.out.print(j+" - "+i);
            System.out.println(" ");
        }
    }
}