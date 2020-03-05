import classes.*;

public class Main {
    public static void main(String[] args) {
        Adulto adult1 = new Adulto("Luis");
        Estudiante estud1 = new Estudiante("Pedro");
        Anciano anc1 = new Anciano("Fernando");

        Bus bus1 = new Bus("Reanault");

        //System.out.println(adult1.toString());
        //System.out.println(estud1.toString());
        //System.out.println(anc1.toString());

        //System.out.println(bus1.toString());

        adult1.saludar();
        estud1.saludar();
        anc1.saludar();

        Parking p1 = new Parking(12, 8);

        if(p1.getNumeroPlazas() == 0) {
            System.out.println("No existe Parking");
        }else{

            boolean hayPlaza = bus1.hayPlaza(p1.getNumeroPlazas(), p1.getPlazasOcupadas());

            if(hayPlaza) {
                int numeroPlaza = p1.getPlazasOcupadas() + 1;

                bus1.setTiempo(26);

                System.out.println("Debe pagar: "+bus1.factura()+" euros.");

                bus1.aparca(numeroPlaza);
            }else {
                System.out.println("Parking Ocupado!");
            }

        }

    }
}