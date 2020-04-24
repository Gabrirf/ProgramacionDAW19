package clases;

public class Persona{
	public String nombre;
	public int edad;
	public float altura;
	public String dni;

	public boolean esMayorEdad(){
		return edad >= 18;
	}

	public boolean dniValido(){
        if (dni.length()!=9){
            return false;
        }
        String secuenciaLetrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE"; 
        dni = dni.toUpperCase();

        String numeroDNI = dni.substring(0, dni.length()-1);
        char letraDNI = dni.charAt(8);
        int i = Integer.parseInt(numeroDNI) % 23;

        return letraDNI == secuenciaLetrasDNI.charAt(i);
	}
}