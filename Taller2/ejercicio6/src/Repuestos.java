public class Repuestos {
    String repuesto;
    int cantidad;
    double precio; 
    
    public Repuestos(){

    }

    public Repuestos( String repuesto, int cantidad, Double precio ){
        this.repuesto = repuesto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public void setRepuesto( String repuesto ){
        this.repuesto = repuesto;
    }

    public String getRepuesto(){
        return repuesto;
    }

    public void setCantidad( int cantidad ){
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void decreCantidad( int cantidad ){
        this.cantidad = this.cantidad - cantidad;
    }

    public void setPrecio( double precio ){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return this.repuesto + " + " + this.cantidad + "i\n";
    }
}
