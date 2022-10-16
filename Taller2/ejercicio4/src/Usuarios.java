import java.util.ArrayList;

public class Usuarios {
    public String nombreCompleto;
    public String identificacion;
    public String direccion;
    public int celular;

    public Usuarios( String nombreCompleto, String identificacion, String direccion, int celular ){
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

    @Override
    public String toString() {
        return "Usuarios {Nombre: " + nombreCompleto + ", Identificacion: " + identificacion + ", direccion: " + direccion + " }\n";
    }
}