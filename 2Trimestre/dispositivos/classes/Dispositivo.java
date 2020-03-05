package classes;

public abstract class Dispositivo {
    //ARIBUTOS
    String procesador;
    int ram;
    int rom;
    String sistOper;

    //CONSTRUCTORES
    public Dispositivo(){}
    public Dispositivo(String procesador, int ram, int rom, String sistOper){
        this.procesador = procesador;
        this.ram = ram;
        this.rom = rom;
        this.sistOper = sistOper;
    }

    //METODOS GET Y SET
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setRom(int rom){
        this.rom = rom;
    }
    public void setSistOper(String sistOper){
        this.sistOper = sistOper;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    //------------------------------------------\\
    public int getRam(){
        return this.ram;
    }
    public int getRom(){
        return this.rom;
    }
    public String getProcesador(){
        return this.procesador;
    }
    public String getsistOper(){
        return this.sistOper;
    }

    //METODOS DE DISPOSITIVOS
    protected abstract void off();

    protected abstract void on();

    protected abstract void restart();


    @Override
    public String toString(){
        return "Procesador: "+this.procesador+" | RAM: "+this.ram+" | ROM: "+this.rom+" | Sistema Operativo: "+this.sistOper;
    }

}