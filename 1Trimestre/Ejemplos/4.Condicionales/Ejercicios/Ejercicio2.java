public class Ejercicio2 {
    public static void main(String[] args){

        /* Calcular año bisiesto */

        int year = Integer.parseInt(args[0]);
        boolean bisiesto = false;

        // Modo 1
        if(year % 4 == 0){
            if(year % 100 != 0){
                bisiesto = true;
            }else{
                if (year % 400 == 0){
                    bisiesto = true;
                }
            }
        }
        // Modo 2
        if(year % 4 == 0 && year % 100 != 0){
            bisiesto = true;
        }else{
            if(year % 400 == 0){
                bisiesto = true;
            }
        }
        // Modo 3
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            bisiesto = true;
        }
        // Modo operador ternario
        bisiesto = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? true : false; 
        // No es necesario el if ternario
        bisiesto = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(bisiesto);
    }
}