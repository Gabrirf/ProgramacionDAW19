package clases;

import java.util.ArrayList;

public class Paciente extends Persona {
	ArrayList<Enfermedad> enfermedades;

	public Paciente(String nombre, int edad, char sexo){
		super(nombre, edad, sexo);
		this.enfermedades = new ArrayList<Enfermedad>();
	}

	public ArrayList<Enfermedad> getEnfermedades(){
		return this.enfermedades;
	}

	public boolean enfermar(Enfermedad enfermedad){
		enfermedades.add(enfermedad);
		return true;
	}

	public boolean curarse(){
		return false;
	}

	public void saludar(Persona persona){
		switch (persona.getClass().getSimpleName()) {
			case "Paciente":
				saludar((Paciente) persona);
				break;
			case "Sanitario":
				saludar((Sanitario) persona);
				break;
			default:
				System.out.println("Es otro");
				break;
		}

	}

	public void saludar(Paciente paciente){
		System.out.println(this.nombre+" saluda a " + paciente.getNombre());
		if(this.enfermedades.size() > 0){
			Enfermedad enf = this.enfermedades.get(0);
			enf.contagiar(paciente);
		}else if(paciente.getEnfermedades().size() > 0){
			Enfermedad enf = paciente.getEnfermedades().get(0);
			enf.contagiar(this);
		}
	}

	public void saludar(Sanitario sanitario){
		System.out.println(this.nombre+" saluda a " + sanitario.getNombre());
	}

	/*public Person greet(Patient patient){
        System.out.println(this.getName() + ": Hola! cof cof\n"); 
        if (patient.diseases.size() != 0) {
            for (Disease disease : patient.diseases) {
                if (Math.random() <= disease.spreadRate) {
                    this.diseases.add(disease);
                }
            }
        }
        if (this.diseases.size() != 0) {
            for (Disease disease : this.diseases) {
                if (Math.random() <= disease.spreadRate) {
                    patient.add(disease);
                }
            }
        }
    }

    public Person contact(Person emitor, Person recipient) {
        if (emitor.diseases.size() != 0) {
            for (Disease disease : emitor.diseases) {
                if (Math.random() <= disease.spreadRate + recipient.age / 100) {
                    disease.transmit(recipient);
                }
            }
        }
        return recipient;
    }*/

}