package clases;

public class Joven extends Paciente {

	public Joven(String nombre, int edad, char sexo){
		super(nombre, edad, sexo);
	}

	public boolean enfermar(Enfermedad enfermedad){
		if(Math.random() < 0.15){
			return super.enfermar(enfermedad);
		}
		return false;
	}
}