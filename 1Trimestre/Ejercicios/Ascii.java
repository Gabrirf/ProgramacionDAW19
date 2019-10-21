public class Ascii{
    public static void main(String[] args) {
       
        //minusculas en ascii del 97 al 122.
      int i = -1;
        for(char u=0;u<=255;u++){
            i++;
            System.out.print(u+" = "+i);
            System.out.println(" ");    // este syso para saltar a la siguiente linea como si fuese un enter.     
        }
    }
} 