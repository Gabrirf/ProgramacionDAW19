public class MainBotella{
	public static void main(String[] args) {
		Botella cocacola = new Botella("Coca Cola", 2000, 0, (byte)50);
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.llenar();
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.servirCopa(10000);
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.servirCopa(100);
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.servirCopa(100);
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.vaciar();
		System.out.println(cocacola.getPorcentajeLlenado());
		cocacola.servirCopa(100);
		System.out.println(cocacola.getPorcentajeLlenado());

	}
}

class Botella{
	String marca; 
	int capacidad;
	float graduacion;
	byte porcentajeLlenado;

	public Botella(){
		this("Desconocido", 1000, 0, (byte)100);
	}
	public Botella(String marca,int capacidad,float graduacion){ // !!!
		this(marca, capacidad, graduacion, (byte)100);
	}
	public Botella(String marca,int capacidad,float graduacion,byte porcentajeLlenado){
		this.marca=marca;
		this.capacidad=capacidad;
		this.graduacion=graduacion;
		this.porcentajeLlenado=porcentajeLlenado;
	}

	public byte getPorcentajeLlenado(){
		return this.porcentajeLlenado;
	}

	public void llenar(){
		this.porcentajeLlenado = 100;
	}

	public void vaciar(){
		this.porcentajeLlenado = 0;
	}

	public boolean servirCopa(int ml){
		int mlLlenado = this.porcentajeLlenado*this.capacidad/100;

		if( ml > mlLlenado ){
			System.out.println("No se ha podido servir");
			return false;
		}

		this.porcentajeLlenado = (byte)(this.porcentajeLlenado - 100*ml/this.capacidad);
		return true;
	}
}