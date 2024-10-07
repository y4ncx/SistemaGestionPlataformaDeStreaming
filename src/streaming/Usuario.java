package streaming;

public class Usuario {
    private String nombreUsuario;
    private int edadUsuario;
    private String suscripcion;

    public Usuario (){
        this.nombreUsuario = "Nombre Por Defecto";
        this.edadUsuario = 0;
        this.suscripcion = "Suscripción Por Defecto";

    }

    public Usuario(String nombreUsuario, int edadUsuario, String suscripcion){
        this.nombreUsuario = nombreUsuario;
        this.edadUsuario = edadUsuario;
        this.suscripcion = suscripcion;


    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    @Override
    public String toString() {
        return "Usuario= " + nombreUsuario + " , Edad= " + edadUsuario + " , Suscripción= " + suscripcion;
    }
}
