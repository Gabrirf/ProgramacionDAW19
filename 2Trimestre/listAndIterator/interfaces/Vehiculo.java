package interfaces;

public interface Vehiculo {
    double factura();
    boolean hayPlaza(int numeroPLazas, int plazasOcupadas);
    void aparca(int numeroPlaza);
    void setTiempo(int numeroPeriodos);
}