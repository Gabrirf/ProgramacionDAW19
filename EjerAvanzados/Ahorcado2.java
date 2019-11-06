import java.util.Scanner;

public class Ahorcado2{
    public static void main(String[] args) {

        int vidas = 7;

        Scanner sc = new Scanner(System.in);

        boolean repetirJuego = true;
        

        while(repetirJuego==true){

            int aciertos = 0;

            boolean finJuego = false;

            System.out.println("\n\nIntroduzca una palabra a adivinar: ");
            String palabra = sc.nextLine();
            

            /*

            *Esto seria para sacar una palabra aleatoria de un array:*
            (Primero import libreria de random)
            
            String [] palabras = {"manzana", "casa", "suelo", "rascacielos"};
            String palabraAleatoria = (palabras[new Random().nextInt(palabras.length)]);
            char [] letras = palabraAleatoria.toCharArray();

            */

            
            char [] desguezada = palabra.toCharArray(); //Convertir palabra en un array de char
            char [] oculta = new char[desguezada.length]; //Creamos un array oculto con la longitud de la palabra

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n "); //Para separar pregunta de respuesta


            //La palabra oculta la convertimos en _ que luego iran modificandose con las letras acertadas
            for(int i = 0; i < oculta.length; i++){
                oculta[i] = '_';
            }

            System.out.println("Adivina la palabra!");
            System.out.println("Tienes 7 VIDAS");
            System.out.println(" ");
                    

            while(vidas != 0 && finJuego==false){

                
                //Bucle para ir imprimiendo la palabra oculta y que se modificara dependiendo de si aciertas o no las letras
                for(int i = 0; i<oculta.length; i++){
                    System.out.print(oculta[i]+" ");
                }
                
                System.out.print("\n\nIntroduzca una letra: ");
                char letraIntroducida = sc.next().toLowerCase().charAt(0);
    
                boolean coinciden = false;
                
                //Bucle para saber si letraIntroducida coincide con algun caracter de desguezada
                for(int i = 0; i<=desguezada.length-1; i++){
    
                    if(letraIntroducida==desguezada[i]){
    
                        oculta[i] = desguezada[i];
                        desguezada[i] = ' ';
                        coinciden = true;
                        aciertos++;
    
                    }
    
                }
    
                if(aciertos==desguezada.length){
                    finJuego=true;
                }
    
                if(coinciden==false){
                        vidas--;
                        System.out.println("Te quedan "+vidas+" VIDAS.");
                }
    
            }
                
            if(aciertos==desguezada.length){
                System.out.println("\nHAS GANADO!");
            }else{
                System.out.println("\nHAS PERDIDO! La palabra era: "+palabra);
            }

            System.out.println("\n¿Quieres jugar otra vez S/n?");
            char resp = sc.next().toLowerCase().charAt(0);
            
            if(resp=='n'){
                 repetirJuego=false;
            }else{
                palabra = sc.nextLine();
            }
            
        }

        sc.close();
        
    }
}