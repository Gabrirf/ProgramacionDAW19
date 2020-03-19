package interfaces;
import classes.*;

public interface Enfermedad {
    void contagiar(Paciente paciente);
    void setCodigo(String codigo);
    String getCodigo();
}