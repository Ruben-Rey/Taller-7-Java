public class Cuenta {
    
    private String nombreCompleto;
    private String identificacion;
    private String direccion;
    private String celular;
    private String contraseña;
    private Double saldo;

    public Cuenta(){
        this.saldo = 0.0;
    }

    public void setNombre( String nombre ){
        this.nombreCompleto = nombre;
    }

    public String getNombre(){
        return nombreCompleto;
    }

    public void setIdentificacion( String identificacion ){
        this.identificacion = identificacion;
    }
    
    public String getIdentificacion(){
        return identificacion;
    }

    public void setDireccion( String direccion ){
        this.direccion = direccion;
    }

    public void setCelular( String celular ){
        this.celular = celular;
    }

    public void setContraseña( String contraseña ){
        this.contraseña = contraseña;
    }

    public String getContraseña(){
        return contraseña;
    }

    public void depositar( Double dinero ){
        this.saldo = this.saldo + dinero;
    }

    public void retirar( Double dinero ){
        this.saldo = this.saldo - dinero;
    }

    public Double consulta(){
        return saldo;
    }
}
