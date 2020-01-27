package clases;

public class Parking{
	int capacidad;
	ArrayList<Coche> plazasOcupadas;

	public Parking(){}
	public Parking(int capacidad){
		this.capacidad = capacidad;
		this.plazasOcupadas = new ArrayList<Coche>();
	}

	public int getCapacidad(){
		return this.capacidad;
	}
	public void setCapacidad(){
		this.capacidad = capacidad;
	}

	public void addCoche(Coche coche){
		if(plazasOcupadas.size() < this.capacidad){
			this.plazasOcupadas.add(coche);
		}else{
			System.out.println("Error: No hay espacio");
		}
	}
	public void removeCoche(Coche coche){
		if(plazasOcupadas.size() > 0){
			int i = plazasOcupadas.indexOf(coche);
			this.plazasOcupadas.remove(i);
		}else{
			System.out.println("Error: No hay espacio");
		}
	}

	public boolean hayPlaza(){
		if(plazasOcupadas.size() < this.capacidad){
			return true;
		}
		return false;
	}
}