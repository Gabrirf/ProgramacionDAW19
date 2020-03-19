package classes;

public class Jugador {

    // ATRIBUTOS
        // Generales \\
    private String nombre;
    private String posicion;
    private int dorsal;
    private double altura;
    private double peso;
    private int edad;
        // Habilidades \\
    private int velocidad;
    private int fuerza;
    private int tiro;
    private int pase;
    private int salto;
    private int resistencia;

    // CONSTRUCTORES
    public Jugador () {}
    public Jugador (String nombre, String posicion, int dorsal, double altura, 
        double peso, int edad, int velocidad, int fuerza, int tiro, int pase, int salto, 
        int resistencia){

            this.nombre = nombre;
            this.posicion = posicion;
            this.dorsal = dorsal;
            this.altura = altura;
            this.peso = peso;
            this.edad = edad;
            this.velocidad = velocidad;
            this.fuerza = fuerza;
            this.tiro = tiro;
            this.pase = pase;
            this.salto = salto;
            this.resistencia = resistencia;

    }

    // GET y SET
    public String getNombre(){return this.nombre;}
    public String getPosicion(){return this.posicion;}
    public int getDorsal(){return this.dorsal;}
    public int getEdad(){return this.edad;}
    public int getVelocidad(){return this.velocidad;}
    public int getFuerza(){return this.fuerza;}
    public int getTiro(){return this.tiro;}
    public int getPase(){return this.pase;}
    public int getSalto(){return this.salto;}
    public int getResistencia(){return this.resistencia;}
    public double getAltura(){return this.altura;}
    public double getPeso(){return this.peso;}

    public void setNombre(String nombre){this.nombre=nombre;}
    public void setPosicion(String posicion){this.posicion=posicion;}
    public void setDorsal(int dorsal){this.dorsal=dorsal;}
    public void setEdad(int edad){this.edad=edad;}
    public void setVelocidad(int velocidad){this.velocidad=velocidad;}
    public void setFuerza(int fuerza){this.fuerza=fuerza;}
    public void setTiro(int tiro){this.tiro=tiro;}
    public void setPase(int pase){this.pase=pase;}
    public void setSalto(int salto){this.salto=salto;}
    public void setResistencia(int resistencia){this.resistencia=resistencia;}
    public void setAltura(double altura){this.altura=altura;}
    public void setPeso(double peso){this.peso=peso;}



}