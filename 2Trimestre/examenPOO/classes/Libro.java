package classes;

public class Libro {
    String nombre;
    String autor;
    String categoria;
    double precio;
    int cantidad;

    //----------------------------------------------------------------

    public Libro() {}
    public Libro(String nombre, String autor,String categoria, double precio, int cantidad){
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //------------------------------------------------------------------

    public String getNombre(){
        return this.nombre;
    }
    public String getAutor(){
        return this.autor;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    //--------------------------------------------------------------------

    @Override
    public String toString(){
        return this.nombre+" - "+this.autor+" - "+this.categoria;
    }

    //-------------------------------------------------------------------

    public Libro comprar(int cantidadAComprar){
        if(cantidadAComprar<=this.cantidad){
            this.cantidad -= cantidadAComprar;
            return this;
        }else{
            return null;
        }
    }

    public Libro comprar(){
        if(this.cantidad>0){
            this.cantidad --;
            return this;
        }else{
            return null;
        }
    }
}