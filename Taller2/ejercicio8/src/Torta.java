public class Torta {
    private String nombre;
    private String sabor;
    private String relleno;
    private String decoracion;
    private String porciones;
    private Double precio;
    private int cantidad;

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setSabor( String sabor ){
        this.sabor = sabor;
    }

    public String getSabor(){
        return sabor;
    }

    public void setRelleno( String relleno ){
        this.relleno = relleno;
    }

    public String getRelleno(){
        return relleno;
    }

    public void setDecoracion( String decoracion ){
        this.decoracion = decoracion;
    }

    public String getDecoracion(){
        return decoracion;
    }

    public void setPorciones( String porciones ){
        this.porciones = porciones;
    }

    public String getPorciones(){
        return porciones;
    }

    public void setPrecio( Double precio ){
        this.precio = precio;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setCantidad( int cantidad ){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setDescontar( int descontar ){
        this.cantidad = this.cantidad - descontar;
    }
}
