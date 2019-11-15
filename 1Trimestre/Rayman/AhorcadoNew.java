import java.util.*;

public class AhorcadoNew{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean juego = true;
        while(juego){

            String [] palabras = {"Conejo", "Ornitorrinco", "Mutante", "Ordenador", "Almeja", "Veigar", "Ezreal", "Cerveza", "Bugatti", "Lamborgini"}; //Creamos un array de palabras
            int posicionAleatoria = (int)Math.floor(Math.random() * palabras.length); //Con esta ecuacion sacamos un valor de la posicion 0 a la 9 para elegir una palabra al azar
            String secreta = palabras[posicionAleatoria]; //Esto nos sirve para coger una palabra aleatoria de nuesto array de palabras      
            int vidas = 7;
            int retry = 0;
            char letra;
            int point = 0;
            String fallos = "";
            // n = secreta.length(); Esto nos serviria para guardar el largo de la palabra en una variable, pero como tenemos el secreta.length no nos hace falta 
        String oculta = "";
        
        for(int i = 0; i < secreta.length(); i++){
            oculta = oculta + "_";
        }
        
        while(!oculta.equals(secreta) && vidas >= 0){ //Esto significa que entrara cuando oculta y secreta no sean iguales, cuando sean iguales saldra
            
            
            System.out.println(oculta);
            fallos = oculta;
                System.out.println("Te quedan "+vidas+" vidas.");
                System.out.println("Introduce una letra: ");
                letra = sc.next().charAt(0); // Nos sirve para coger la letra introducida leerla y guardarla como variable por eso posicion 0 porque sera la primera
                
                for(int i = 0; i < secreta.length(); i++){
                    if(letra == secreta.charAt(i)){
                        oculta = oculta.substring(0,i)+letra+oculta.substring(i+1);
                    }
                }if(fallos == oculta){
                    vidas--;
                }else{
                    System.out.println("Te llevas 10 puntos por acertar");
                    point= point + 10;
                }
                
                
        }if(oculta.equals(secreta)){
            
            System.out.println("Enhorabuena has completado la palabra secreta que es "+oculta);
            System.out.println("Has conseguido "+point+" puntos.");
        }else{
            System.out.println("Lo siento no has acertado la palabra.");
        }System.out.println("Quieres reintentarlo? 1 para volver a jugar y 2 para salir.");
        retry = sc.nextInt();
        if(retry == 1){
            juego = true;
        }else if(retry == 2){
            juego = false;
        }
        }
               
    }
    
    
}