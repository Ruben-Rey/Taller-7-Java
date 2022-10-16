public class Persona {
    private String nombre;
    private String identidad;
    private String celular;
    private String direccion;
    private String modelo;
    private String placa;
    private String problema;
    
    public void setNombre( String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setIdentidad( String identidad ){
        this.identidad = identidad;
    }

    public String getIdentidad(){
        return identidad;
    }

    public void setCelular( String celular ){
        this.celular = celular;
    }

    public String getCelular(){
        return celular;
    }

    public void setDireccion( String direccion ){
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setModelo( String modelo ){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setPlaca( String placa ){ 
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void setProblema( String problema ){
        this.problema = problema;
    }

    public String getProblema(){
        return problema;
    }

    @Override
    public String toString() {
        return this.nombre + " + " + this.celular + "i";
    }
}
