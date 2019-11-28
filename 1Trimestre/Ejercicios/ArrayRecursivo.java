public class ArrayRecursivo{
    public static void main(String[] args) {
        int[] ar={1, 2, 3, 4, 5};
        int cont = 0;
        array(ar, cont);
    }

    public static void array(int[] ar, int cont){

        if(cont!=ar.length){
            
            System.out.println(ar[cont]);
            array(ar, cont+1);
        }
    }

}