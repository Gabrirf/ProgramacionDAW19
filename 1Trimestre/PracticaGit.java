import java.util.Scanner;


public class PracticaGit{
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        int a = 0;
        System.out.println("inserta calificacion: ");
            a = nota.nextInt();
         if(a < 5&&a>=0){
            System.out.println("Alumno Supendido");
         }else if (a==5){
            System.out.println("Alumno Aprobado");
         }else if (a==6){
             System.out.println("Nota: Bien");
         }else if (a==7||a==8){
             System.out.println("Nota: Notable");
         }else if (a==9){
            System.out.println("Nota: Sobresaliente");
         }else if (a==10){
             System.out.println("Matricula de Honor");
         }else if (a>=10){
             System.out.println("JAJAJAJA XD");
         }
    }
}
