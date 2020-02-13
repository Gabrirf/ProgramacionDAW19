package clases;

public class Vehiculo{
	Persona[] personas;

	public Vehiculo(){}
	public Vehiculo(Persona[] personas){
		this.personas = personas;
	}

	public Persona[] getPersonas(){
		return this.personas;
	}
	public void setPersonas(Persona[] personas){
		this.personas = personas;
	}

	@Override
	public String toString(){
		String personasStr = "";
		for (int i=0; i<this.personas.length; i++) {
			personasStr += this.personas[i].toString()+"\n";
		}
		return personasStr;
	}

}