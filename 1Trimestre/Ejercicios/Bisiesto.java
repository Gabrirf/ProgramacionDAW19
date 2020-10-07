public class Bisiesto {
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Indique un año");
            return;
        }

        int year = Integer.parseInt(args[0]);
        boolean bisiesto = year%400 == 0 || (year%4 == 0 && year%100 != 0) ? true : false; 
        System.out.println(bisiesto);
    }
}