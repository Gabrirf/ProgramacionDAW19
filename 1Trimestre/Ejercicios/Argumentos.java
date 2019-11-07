public class Argumentos{
    public static void main(String[] args) {
        //length = longitud en ingles. , //aqui lo que estamos haciendo es recorrer el bucle del reves con arg.length-1.
        // el primer for(bucle es para darle la vuelta a la frase completa). el primero para la palabras.
        int numArgs= args.length; // numero de parametros del argumento.

        for (int i=numArgs-1; i>=0; i--){   
            //System.out.println(args[i]+" ");
            int numLetras = args[i].length(); 

            // el segundo for (bucle) va a ser para centrarnos en las letras.
            for (int j=numLetras-1; j>=0 ; j-- ){
                char letra = args[i].charAt(j); // charAt metodo de texto
                System.out.print(letra);
            }
            System.out.print(" ");
        }
    }
}