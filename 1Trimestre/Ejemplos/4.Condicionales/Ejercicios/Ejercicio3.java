public class Ejercicio3 {
    public static void main(String[] args){

        char caracter = args[0].charAt(0);
        String texto = "";

        if(caracter >= '0' && caracter <= '9'){
            texto = "numero";
        }else if((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')){
            texto = "letra";
        }else{
            texto = "otro";
        }

        System.out.println("El caracter '"+caracter+"' es "+texto);

    }
}