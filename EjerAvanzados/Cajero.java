import java.util.Scanner;

public class Cajero{
    public static void main(String[] args) {

        double dev;
        boolean posible = true;

        //Declarando tipos de billetes

        int bquinientos = 0;
        int bdosci = 0;
        int bcien = 0;
        int bcincu = 0;
        int bveint = 0;
        int bdiez = 0;
        int bcinco = 0;

        //Declarando tipos de monedas

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;
        int m5 = 0;
        int m6 = 0;
        int m7 = 0;
        int m8 = 0;

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce importe a pagar: ");
        double imp = sc.nextDouble();

        System.out.print("Introduce cantidad pagada por el cliente: ");
        double cant = sc.nextDouble();

        sc.close();

        dev = cant-imp;

        if(cant>imp){
            System.out.println("Importe a devolver: "+dev);
        }else{
            System.out.println("No es posible!");
            posible=false;
        }

        while(posible){

            //Primero Billetes

            while((dev-500)>=0){

                dev=dev-500;
                bquinientos++;

            }

            while((dev-200)>=0){

                dev=dev-200;
                bdosci++;

            }

            while((dev-100)>=0){

                dev=dev-100;
                bcien++;

            }

            while((dev-50)>=0){

                dev=dev-50;
                bcincu++;

            }

            while((dev-20)>=0){

                dev=dev-20;
                bveint++;

            }

            while((dev-10)>=0){

                dev=dev-10;
                bdiez++;

            }

            while((dev-5)>=0){

                dev=dev-5;
                bcinco++;

            }

        /***************************/ // Ahora con monedas

            while((dev-2)>=0){

                dev=dev-2;
                m1++;

            }

            while((dev-1)>=0){

                dev=dev-1;
                m2++;

            }

            while((dev-0.5)>=0){

                dev=dev-0.5;
                m3++;

            }

            while((dev-0.2)>=0){

                dev=dev-0.2;
                m4++;

            }

            while((dev-0.1)>=0){

                dev=dev-0.1;
                m5++;

            }

            while((dev-0.05)>=0){

                dev=dev-0.05;
                m6++;

            }

            while((dev-0.02)>=0){

                dev=dev-0.02;
                m7++;

            }

            while((dev-0.01)>=0){

                dev=dev-0.01;
                m8++;

            }
        

        /**************************/ // Ahora imprimir numero de billetes y monedas
            
            posible=false;

        }

        if(bquinientos>0){

            System.out.println(bquinientos+" billetes de 500 euros.");

        }
        if(bdosci>0){

            System.out.println(bdosci+" billetes de 200 euros.");

        }
        if(bcien>0){

            System.out.println(bcien+" billetes de 100 euros.");

        }
        if(bcincu>0){

            System.out.println(bcincu+" billetes de 50 euros.");

        }
        if(bveint>0){

            System.out.println(bveint+" billetes de 20 euros.");

        }
        if(bdiez>0){

            System.out.println(bdiez+" billetes de 10 euros.");

        }
        if(bcinco>0){

            System.out.println(bcinco+" billetes de 5 euros.");

        }
        if(m1>0){

            System.out.println(m1+" monedas de 2 euros.");

        } 
        
        if(m2>0){

            System.out.println(m2+" monedas de 1 euros.");

        }
        if(m3>0){

            System.out.println(m3+" monedas de 50 centimos.");

        }
        if(m4>0){

            System.out.println(m4+" monedas de 20 centimos.");

        }
        if(m5>0){

            System.out.println(m5+" monedas de 10 centimos.");

        }
        if(m6>0){

            System.out.println(m6+" monedas de 5 centimos.");

        }
        if(m7>0){

            System.out.println(m7+" monedas de 2 centimos.");

        }
        if(m8>0){

            System.out.println(m8+" monedas de 1 centimos.");

        }


    }
}