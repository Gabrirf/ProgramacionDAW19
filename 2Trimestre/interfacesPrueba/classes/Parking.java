package classes;

public class Parking {
    int numeroPlazas;
    int plazasOcupadas;

    public Parking() {
        this.numeroPlazas = 0;
        this.plazasOcupadas = 0;
    }

    public Parking(int unaParam) {
        this.numeroPlazas = 0;
        this.plazasOcupadas = 0;
    }

    public Parking(int numeroPlazas, int plazasOcupadas) {
        this.numeroPlazas = numeroPlazas;
        this.plazasOcupadas = plazasOcupadas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public int getNumeroPlazas() {
        return this.numeroPlazas;
    }

    public int getPlazasOcupadas() {
        return this.plazasOcupadas;
    }

    @Override
    public String toString() {
        return "Plazas: "+this.numeroPlazas+" | Ocupadas: "+this.plazasOcupadas;
    }
}