public class Contacto {
    private String nombreCompleto;
    private String telefono;
    private String organizacion;
    private int numeroContacto = 0;

    public void setNombreCompleto(  String nombre ){
            this.nombreCompleto = nombre;
    }

    public String getNombre(){
        return nombreCompleto;
    }

    public void setTelefono( String telefono ){
            this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setOrganizacion( String organizacion ){
            this.organizacion = organizacion;
    }

    public String getOrganizacion(){
        return organizacion;
    }

    public void contactoRemove(){
        this.numeroContacto--;
    }
}
