import java.util.*;

public class amigoInvisible{
    public static void main(String[] args){
        
        System.out.println("Bienvenidos al amigo invisible, vamos a repartir");
        System.out.println("la forma de regalar entre 4 amigos.");
        String[] participantes = {"Ana", "Javier", "Pepe", "Maria"};  // {"Ana" , "Javier", "Maria","Pepe"}
        //String[] original = participantes.clone();
        System.out.println(Arrays.toString(participantes));
        
        for(int i = 0; i <= 100; i++){
            int n = (int)Math.floor(Math.random()*3);
            int m = (int)Math.floor(Math.random()*3);
            String save;
            save = participantes[n];
            participantes[n] = participantes[m];
            participantes[m] = save; 

        }
        //System.out.println(Arrays.toString(participantes));

        Scanner sc = new Scanner(System.in);
        int q = 0; 
        System.out.println("Si quieres saber quien regala a quien selecciona una opcion.");
        System.out.println("1. "+participantes[0]);
        System.out.println("2. "+participantes[1]);
        System.out.println("3. "+participantes[2]);
        System.out.println("4. "+participantes[3]);
        q = sc.nextInt();
        if(q == 1){
            System.out.println(participantes[0]+" le tendra que regalar a "+participantes[1]);
        }else if(q == 2){
            System.out.println(participantes[1]+" le tendra que regalar a "+participantes[2]);
        }else if(q == 3){
            System.out.println(participantes[2]+" le tendra que regalar a "+participantes[3]);
        }else if(q == 4){
            System.out.println(participantes[3]+" le tendra que regalar a "+participantes[0]);
        }else{
            System.out.println("No has elegido ninguna opcion asi que muchas gracias y hasta la proxima :)");
        }

        //easy using Arrays.random();

        //master
        // for (1000 veces)
            // n = Math.random --> [0, ar.length]
            // m = Math.random --> [0, ar.length]
            // intercambiar ar[n] por ar[m]

        // logica del regalo
    }
}