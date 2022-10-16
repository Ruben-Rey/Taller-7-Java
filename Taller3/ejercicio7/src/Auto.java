public class Auto {
    private String nombreCompleto;
    private String identidad;
    private String celular;
    private String marca;
    private String placa;

    public void setNombreCompleto( String nombre ){
        this.nombreCompleto = nombre;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
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

    public void setMarca( String marca ){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setPlaca( String placa ){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

}
