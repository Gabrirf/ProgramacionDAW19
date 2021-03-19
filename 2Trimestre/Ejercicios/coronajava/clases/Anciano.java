package clases;

public class Anciano extends Paciente {

	public Anciano(String nombre, int edad, char sexo){
		super(nombre, edad, sexo);
	}

	public boolean enfermar(Enfermedad enfermedad){
		if(Math.random() < 0.85){
			return super.enfermar(enfermedad);
		}
		return false;
	}
}