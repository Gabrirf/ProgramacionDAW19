import java.util.*;

public class CajaDeCambio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double precio = 0;
        double pagar = 0;
        double vuelta = 0;
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int m2 = 0;
        int m1 = 0;
        int c50 = 0;
        int c20 = 0;
        int c10 = 0;
        int c5 = 0;
        int c2 = 0;
        int c1 = 0;

        System.out.println("Hola bienvenido a la tienda de Rayman pase por caja para pagar el producto.");
        System.out.println("Porfavor introduzca el precio del articulo.");
        precio = sc.nextDouble();
        System.out.println("Introduzca la cantidad con la que va a pagar.");
        pagar = sc.nextDouble();
        vuelta = pagar - precio;        
        System.out.println("La vuelta es "+vuelta+" euros.");

        while(vuelta >= 500){
            b500++;
            vuelta = vuelta - 500;
        }if(b500 != 0){
            System.out.println("Son "+b500+" billetes de 500 euros.");
        }while(vuelta >=200){
            b200++;
            vuelta = vuelta - 200;
        }if(b200 != 0){
            System.out.println("Son "+b200+" billetes de 200 euros.");
        }while(vuelta >=100){
            b100++;
            vuelta = vuelta - 100;
        }if(b100 != 0){
            System.out.println("Son "+b100+" billetes de 100 euros.");
        }while(vuelta >= 50){
            b50++;
            vuelta = vuelta - 50;
        }if(b50 != 0){
            System.out.println("Son "+b50+" billetes de 50 euros.");            
        }while(vuelta >= 20){
            b20++;
            vuelta = vuelta - 20;
        }if(b20 != 0){
            System.out.println("Son "+b20+" billetes de 20 euros.");
        }while(vuelta >= 10){
            b10++;
            vuelta = vuelta - 10;
        }if(b10 != 0){
            System.out.println("Son "+b10+" billetes de 10 euros.");
        }while(vuelta >= 5){
            b5++;
            vuelta = vuelta - 5;
        }if(b5 != 0){
            System.out.println("Son "+b5+" billetes de 5 euros.");
        }while(vuelta >= 2){
            m2++;
            vuelta = vuelta - 2;
        }if(m2 != 0){
            System.out.println("Son "+m2+" monedas de 2 euros.");
        }while(vuelta >= 1){
            m1++;
            vuelta = vuelta -1;
        }if(m1 != 0){
            System.out.println("Son "+m1+" monedas de 1 euros.");
        }while(vuelta >= 0.50){
            c50++;
            vuelta = vuelta - 0.50;
        }if(c50 != 0){
            System.out.println("Son "+c50+" monedas de 50 centimos");
        }while(vuelta >= 0.20){
            c20++;
            vuelta = vuelta - 0.20;
        }if(c20 != 0){
            System.out.println("Son "+c20+" monedas de 20 centimos.");
        }while(vuelta >= 0.10){
            c10++;
            vuelta = vuelta - 0.10;
        }if(c10 != 0){
            System.out.println("Son "+c10+" monedas de 10 centimos.");
        }while(vuelta >= 0.05 || vuelta >= 0.04){
            c5++;
            vuelta = vuelta - 0.05;
        }if(c5 != 0){
            System.out.println("Son "+c5+" monedas de 5 centimos.");
        }while(vuelta >= 0.02 || vuelta >= 0.01){
            c2++;
            vuelta = vuelta - 0.02;
        }if(c2 != 0){
            System.out.println("Son "+c2+" monedas de 2 centimos.");
        }while(vuelta >= 0.01 || vuelta >= 0.009){
            c1++;
            vuelta = vuelta - 0.01;
        }if(c1 != 0){
            System.out.println("Son "+c1+" monedas de 1 centimo.");
        }
        System.out.println("Muchas gracias por su compra ;)");
    }
}