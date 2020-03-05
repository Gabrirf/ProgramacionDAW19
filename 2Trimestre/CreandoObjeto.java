public class CreandoObjeto{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Mario";
        persona.dni = "29533046B";
        persona.edad = 20;
        persona.altura = 193;

        Persona.edad(persona.edad);

        Persona.validacionDni(persona.dni);
    }
}

    
    class Persona {
        String nombre;
        String dni;
        int edad;
        int altura;

        public static void edad(int edad) {
            if (edad >= 18) {
                System.out.println("La persona es mayor de edad.");
            }else {
                System.out.println("No es mayor de edad");
            }
        }

        public static void validacionDni(String dni) {
            char [] fragmentado = dni.toCharArray();

            String letras="TRWAGMYFPDXBNJZSQVHLCKE";
            
            int numero = Integer.parseInt(dni.substring(0, 8));
            char letra = fragmentado[8];

            int resto = numero %23;

            char letraCorr = letras.charAt(resto);

            if(letra == letraCorr){
                System.out.println("DNI valido");
            }else {
                System.out.println("DNI no Valido!");
            }

            if (dni.length()!=9) {
                System.out.println("DNI no Valido!");
            }

        }
    }
