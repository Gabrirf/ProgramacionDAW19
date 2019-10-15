import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConversorTiempo2{

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bienvenidos!", "Conversor", JOptionPane.DEFAULT_OPTION);

        Scanner sc = new Scanner(System.in);

        System.out.println("\nELIJA TIPOS DE DATOS A INTRODUCIR: ");
        System.out.println("\n\t-Escribe 1 para introducir SEGUNDOS");
        System.out.println("\t-Escribe 2 para introducir MINUTOS");
        System.out.println("\t-Escribe 3 para introducir HORAS");
        System.out.println("\t-Escribe 4 para introducir DIAS");
        System.out.println("\t-Escribe 5 para introducir SEMANAS");
        System.out.println("\t-Escribe 6 para introducir MESES");
        System.out.println("\t-Escribe 7 para introducir ANIOS");

        int elec = sc.nextInt();

        System.out.println("\n---------------------------------------");

        switch(elec){

            case 1:
                System.out.println("Introduce cantidad de Segundos: ");
                double s1 = sc.nextDouble();

                System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
                
                System.out.println("\n\t-Escribe 1 para pasar a MINUTOS");
                System.out.println("\t-Escribe 2 para pasar a HORAS");
                System.out.println("\t-Escribe 3 para pasar a DIAS");
                System.out.println("\t-Escribe 4 para pasar a SEMANAS");
                System.out.println("\t-Escribe 5 para pasar a MESES");
                System.out.println("\t-Escribe 6 para pasar a ANIOS");

                int op1 = sc.nextInt();

                switch(op1){

                    case 1:
                        double m1 = s1/60;
                        System.out.println("Equivale a: "+m1);
                    break;
        
                    case 2:
                        double h1 = s1/3600;
                        System.out.println("Equivale a: "+h1);
                    break;
        
                    case 3:
                        double d1 = s1/86400;
                        System.out.println("Equivale a: "+d1);
                    break;
        
                    case 4:
                        double se1 = s1/604800;
                        System.out.println("Equivale a: "+se1);
                    break;
        
                    case 5:
                        double me1 = s1/2592000;
                        System.out.println("Equivale a: "+me1);
                    break;
        
                    case 6:
                        double a1 = s1/31104000;    
                        System.out.println("Equivale a: "+a1);
                    break;
        
                    default:
                        System.out.println("Opcion no valida");
        
                }
                
                break;

            case 2:
                System.out.println("Introduce cantidad de Minutos: ");
                double m2 = sc.nextDouble();

                System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
                
                System.out.println("\n\t-Escribe 1 para pasar a SEGUNDOS");
                System.out.println("\t-Escribe 2 para pasar a HORAS");
                System.out.println("\t-Escribe 3 para pasar a DIAS");
                System.out.println("\t-Escribe 4 para pasar a SEMANAS");
                System.out.println("\t-Escribe 5 para pasar a MESES");
                System.out.println("\t-Escribe 6 para pasar a ANIOS");

                int op2 = sc.nextInt();

                switch(op2){

                    case 1:
                        double s2 = m2*60;
                        System.out.println("Equivale a: "+s2);
                    break;
        
                    case 2:
                        double h2 = m2/60;
                        System.out.println("Equivale a: "+h2);
                    break;
        
                    case 3:
                        double d2 = m2/1440;
                        System.out.println("Equivale a: "+d2);
                    break;
        
                    case 4:
                        double se2 = m2/10080;
                        System.out.println("Equivale a: "+se2);
                    break;
        
                    case 5:
                        double me2 = m2/43200;
                        System.out.println("Equivale a: "+me2);
                    break;
        
                    case 6:
                        double a2 = m2/518400;    
                        System.out.println("Equivale a: "+a2);
                    break;
        
                    default:
                        System.out.println("Opcion no valida");
                
                    }
                break;

            case 3:

            System.out.println("Introduce cantidad de Horas: ");
            double h3 = sc.nextDouble();

            System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
            
            System.out.println("\n\t-Escribe 1 para pasar a SEGUNDOS");
            System.out.println("\t-Escribe 2 para pasar a MINUTOS");
            System.out.println("\t-Escribe 3 para pasar a DIAS");
            System.out.println("\t-Escribe 4 para pasar a SEMANAS");
            System.out.println("\t-Escribe 5 para pasar a MESES");
            System.out.println("\t-Escribe 6 para pasar a ANIOS");

            int op3 = sc.nextInt();

            switch(op3){

                case 1:
                    double s3 = h3*3600;
                    System.out.println("Equivale a: "+s3);
                break;
    
                case 2:
                    double m3 = h3*60;
                    System.out.println("Equivale a: "+m3);
                break;
    
                case 3:
                    double d3 = h3/24;
                    System.out.println("Equivale a: "+d3);
                break;
    
                case 4:
                    double se3 = h3/168;
                    System.out.println("Equivale a: "+se3);
                break;
    
                case 5:
                    double me3 = h3/720;
                    System.out.println("Equivale a: "+me3);
                break;
    
                case 6:
                    double a3 = h3/8640;    
                    System.out.println("Equivale a: "+a3);
                break;
    
                default:
                    System.out.println("Opcion no valida");
            
                }
                    
                break;

            case 4:

            System.out.println("Introduce cantidad de Dias: ");
            double d4 = sc.nextDouble();

            System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
            
            System.out.println("\n\t-Escribe 1 para pasar a SEGUNDOS");
            System.out.println("\t-Escribe 2 para pasar a MINUTOS");
            System.out.println("\t-Escribe 3 para pasar a HORAS");
            System.out.println("\t-Escribe 4 para pasar a SEMANAS");
            System.out.println("\t-Escribe 5 para pasar a MESES");
            System.out.println("\t-Escribe 6 para pasar a ANIOS");

            int op4 = sc.nextInt();

            switch(op4){

                case 1:
                    double s4 = d4*86400;
                    System.out.println("Equivale a: "+s4);
                break;
    
                case 2:
                    double m4 = d4*1440;
                    System.out.println("Equivale a: "+m4);
                break;
    
                case 3:
                    double h4 = d4*24;
                    System.out.println("Equivale a: "+h4);
                break;
    
                case 4:
                    double se4 = d4/7;
                    System.out.println("Equivale a: "+se4);
                break;
    
                case 5:
                    double me4 = d4/30;
                    System.out.println("Equivale a: "+me4);
                break;
    
                case 6:
                    double a4 = d4/360;    
                    System.out.println("Equivale a: "+a4);
                break;
    
                default:
                    System.out.println("Opcion no valida");
            
                }
                

                break;

            case 5:

            System.out.println("Introduce cantidad de Semanas: ");
            double se5 = sc.nextDouble();

            System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
            
            System.out.println("\n\t-Escribe 1 para pasar a SEGUNDOS");
            System.out.println("\t-Escribe 2 para pasar a MINUTOS");
            System.out.println("\t-Escribe 3 para pasar a HORAS");
            System.out.println("\t-Escribe 4 para pasar a DIAS");
            System.out.println("\t-Escribe 5 para pasar a MESES");
            System.out.println("\t-Escribe 6 para pasar a ANIOS");

            int op5 = sc.nextInt();

            switch(op5){

                case 1:
                    double s5 = se5*604800;
                    System.out.println("Equivale a: "+s5);
                break;
    
                case 2:
                    double m5 = se5*10080;
                    System.out.println("Equivale a: "+m5);
                break;
    
                case 3:
                    double h5 = se5*168;
                    System.out.println("Equivale a: "+h5);
                break;
    
                case 4:
                    double d5 = se5*7;
                    System.out.println("Equivale a: "+d5);
                break;
    
                case 5:
                    double me5 = se5/(720/168);
                    System.out.println("Equivale a: "+me5);
                break;
    
                case 6:
                    double a5 = se5/(8640/168);    
                    System.out.println("Equivale a: "+a5);
                break;
    
                default:
                    System.out.println("Opcion no valida");
            
                }

                break;

            case 6:

            System.out.println("Introduce cantidad de Meses: ");
            double me6 = sc.nextDouble();

            System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
            
            System.out.println("\n\t-Escribe 1 para pasar a SEGUNDOS");
            System.out.println("\t-Escribe 2 para pasar a MINUTOS");
            System.out.println("\t-Escribe 3 para pasar a HORAS");
            System.out.println("\t-Escribe 4 para pasar a DIAS");
            System.out.println("\t-Escribe 5 para pasar a SEMANAS");
            System.out.println("\t-Escribe 6 para pasar a ANIOS");

            int op6 = sc.nextInt();

            switch(op6){

                case 1:
                    double s6 = me6*2592000;
                    System.out.println("Equivale a: "+s6);
                break;
    
                case 2:
                    double m6 = me6*43200;
                    System.out.println("Equivale a: "+m6);
                break;
    
                case 3:
                    double h6 = me6*720;
                    System.out.println("Equivale a: "+h6);
                break;
    
                case 4:
                    double d6 = me6*30;
                    System.out.println("Equivale a: "+d6);
                break;
    
                case 5:
                    double se6 = me6*(720/168);
                    System.out.println("Equivale a: "+se6);
                break;
    
                case 6:
                    double a6 = me6/12;    
                    System.out.println("Equivale a: "+a6);
                break;
    
                default:
                    System.out.println("Opcion no valida");
            
                }

                break;

            case 7:

            System.out.println("Introduce cantidad de Anios: ");
            double a7 = sc.nextDouble();

            System.out.println("\nELIJA TIPOS DE DATOS A SALIR: ");
            
            System.out.println("\n\t-Escribe 1 para pasar a MINUTOS");
            System.out.println("\t-Escribe 2 para pasar a HORAS");
            System.out.println("\t-Escribe 3 para pasar a DIAS");
            System.out.println("\t-Escribe 4 para pasar a SEMANAS");
            System.out.println("\t-Escribe 5 para pasar a MESES");
            System.out.println("\t-Escribe 6 para pasar a ANIOS");

            int op7 = sc.nextInt();

            switch(op7){

                case 1:
                    double s7 = a7*31104000;
                    System.out.println("Equivale a: "+s7);
                break;
    
                case 2:
                    double m7 = a7*518400;
                    System.out.println("Equivale a: "+m7);
                break;
    
                case 3:
                    double h7 = a7*8640;
                    System.out.println("Equivale a: "+h7);
                break;
    
                case 4:
                    double d7 = a7*360;
                    System.out.println("Equivale a: "+d7);
                break;
    
                case 5:
                    double se7 = a7*(8640/168);
                    System.out.println("Equivale a: "+se7);
                break;
    
                case 6:
                    double me7 = a7*12;    
                    System.out.println("Equivale a: "+me7);
                break;
    
                default:
                    System.out.println("Opcion no valida");
            
                }

                break;

            default:
                System.out.println("Esta opcion no es valida.");

        }

        sc.close();

    }

}

//System.out.println("En meses equivale a: "+mes);