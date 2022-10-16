
public class Estudiante {
    private String nombreCompleto;
    private String identidad;
    private String celular;
    private int nota = 0;


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

    public void setNota( int nota ){
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }
}
