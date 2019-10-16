public class Esfera {
	public static void main(String[] args) {
		final double PI = Math.PI;
		int opcion;
		double radio, diametro, area, volumen;
		if(args.length > 1){
			opcion = Integer.parseInt(args[0]);
			diametro = Double.parseDouble(args[1]);
			if (diametro >= 0 ) {
				radio = diametro / 2;

				switch (opcion) {
					case 1:
						System.out.println("El radio es: "+radio);
						break;
					case 2:
						area = 4*PI*radio*radio;
						System.out.println("El area es: "+area);
						break;
					case 3:
						volumen = (4f/3f)*PI*radio*radio*radio;
						System.out.println("El volumen es: "+volumen);
						break;
					default:
						System.out.println("No es una opcion válida");
				}

				/*if(opcion == 1){
					System.out.println("El radio es: "+radio);
				}else if(opcion == 2){
					area = 4*PI*radio*radio;
					System.out.println("El area es: "+area);
				}else if(opcion == 3){
					volumen = (4f/3f)*PI*radio*radio*radio;
					System.out.println("El volumen es: "+volumen);
				}else{
					System.out.println("No es una opcion válida");
				}*/
			}else{
				System.out.println("Ponga un diametro válido");
			}
		}else{
			System.out.println("Use el programa de la siguiente forma:");
			System.out.println("\tjava Esfera [opcion] [valor]");
			System.out.println("Opciones:");			
			System.out.println("\t1) Radio");
			System.out.println("\t2) Area");
			System.out.println("\t3) Volumen");

		}
	}
}