package streaming;

public class Plataforma {
    String nombrePlataforma;
    String tipoContenido;
    int numeroUsuarios;


    public Plataforma (){
        this.nombrePlataforma = "Nombre Por Defecto";
        this.tipoContenido = "Contenido Por Defecto";
        this.numeroUsuarios = 0;
    }

    public Plataforma (String nombrePlataforma, String tipoContenido, int numeroUsuarios){
        this.nombrePlataforma = nombrePlataforma;
        this.tipoContenido = tipoContenido;
        this.numeroUsuarios = numeroUsuarios;

    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public void setNumeroUsuarios(int numeroUsuarios) {
        this.numeroUsuarios = numeroUsuarios;
    }

    @Override
    public String toString() {
        return "Nombre de la plataforma= " + nombrePlataforma + " , Tipo de contenido=  " + tipoContenido +" , Numero de usuarios= " + numeroUsuarios;
    }
}
