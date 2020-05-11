public class EjercicioMix1 {
    public static void main(String[] args){

        int numero = Integer.parseInt(args[0]);

        System.out.println("*** While ***");
        int cont = 1;
        while(cont <= 10){
            System.out.println(numero+" x "+cont+"\t= "+(numero*cont));
            cont++;
        }

        System.out.println("*** Do while ***");
        cont = 1;
        do{
            System.out.println(numero+" x "+cont+"\t= "+(numero*cont));
            cont++;
        }while(cont <= 10);

        System.out.println("*** For ***");
        for(int i=1; i<=10; i++){
            System.out.println(numero+" x "+i+"\t= "+(numero*i));
        }

    }
}