public class Medicamentos {

    private String nombre;
    private String descripcion;
    private String formula;
    private String masaMolar;
    private String vidaMedia;
    private String metabolismo;
    private int cantidad;
    private double precio;

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDescripcion( String descripcion ) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setFormula( String formula ){
        this.formula = formula;
    }

    public String getFormula(){
        return formula;
    }

    public void setMasaMolar( String masa ){
        this.masaMolar = masa;
    }

    public String getMasaMolar(){
        return masaMolar;
    }

    public void setVidaMedia( String vida ){
        this.vidaMedia = vida;
    }
    
    public String getVidaMedia(){
        return vidaMedia;
    }

    public void setMetabolismo( String metabolismo ){
        this.metabolismo = metabolismo;
    }

    public String getMetabolismo(){
        return metabolismo;
    }

    public void setCantidad( int cantidad ){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void decreCantidad( int cantidad ){
        this.cantidad = this.cantidad -cantidad;
    }

    public void setPrecio( double precio ){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }
}   
