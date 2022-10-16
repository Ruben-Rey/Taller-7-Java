public class Peliculas {
    public String nombre;
    public String genero;
    public String pais;
    public int cantidad;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }

    public void setCantidad( int cantidad ){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void increCantidad(){
        this.cantidad++;
    }

    public void decreCantidad(){
        this.cantidad--;
    }

    public static void add(Peliculas pelicula) {
    }
}   