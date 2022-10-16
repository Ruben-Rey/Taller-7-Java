
public class Usuarios {
    private String nombreCompleto;
    private String identificacion;
    private String direccion;
    private String celular;

    public Usuarios( String nombreCompleto, String identificacion, String direccion, String celular ){
        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getNombre(){
        return nombreCompleto;
    }

    public String getIdentidad(){
        return identificacion;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getCelular(){
        return celular;
    }

    @Override
    public String toString() {
        return "Usuarios {Nombre: " + nombreCompleto + ", Identificacion: " + identificacion + ", direccion: " + direccion + " }\n";
    }
}