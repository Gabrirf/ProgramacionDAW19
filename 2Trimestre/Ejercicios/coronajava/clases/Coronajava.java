package clases;

public class Coronajava {

	public Coronajava(){

	}

	public void start(){
		Paciente paciente1 = new Paciente("Paciente1",0,'H');
		Paciente paciente2 = new Paciente("paciente2",0,'M');
		Sanitario sanitario = new Sanitario("Sanitario",0,'H', "categoria");
		Joven joven = new Joven("Joven",10,'H');
		Adulto adulto = new Adulto("Adulto",20,'H');
		Anciano anciano = new Anciano("Anciano",30,'H');

		Enfermedad gripe = new Gripe("gripe");

		/*paciente2.enfermar(gripe);
		System.out.println(paciente2.getEnfermedades());
		
		paciente2.saludar(sanitario);
		//System.out.println("Sanitario: "+sanitario);

		System.out.println("Paciente 1 antes de saludar: "+paciente1.getEnfermedades());
		paciente2.saludar(paciente1);
		System.out.println("Paciente 1 despues de saludar: "+paciente1.getEnfermedades());*/

		while(adulto.getEnfermedades().size() == 0){
			adulto.enfermar(gripe);
			System.out.println("Adulto tras enfermar: "+adulto.getEnfermedades());
		}

		joven.saludar(adulto);
		System.out.println("Joven tras saluar: "+joven.getEnfermedades());

		anciano.saludar(adulto);
		System.out.println("Anciano tras saluar: "+anciano.getEnfermedades());

	}
}