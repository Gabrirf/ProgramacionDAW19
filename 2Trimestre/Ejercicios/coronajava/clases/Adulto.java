package clases;

public class Adulto extends Paciente {

	public Adulto(String nombre, int edad, char sexo){
		super(nombre, edad, sexo);
	}

	public boolean enfermar(Enfermedad enfermedad){
		if(Math.random() > 0.5){
			return super.enfermar(enfermedad);
		}
		return false;
	}

}