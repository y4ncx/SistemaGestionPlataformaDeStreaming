package streaming;

public class Pelicula {
    private String Titulo;
    private String Tipo;
    private int Duracion;
    private float Calificacion;

    public Pelicula(){
        this.Titulo = "Titulo Por Defecto";
        this.Duracion = 0;
        this.Calificacion = 0;
        this.Tipo = "Tipo Por Defecto";
    }

    public Pelicula(String Titulo, String Tipo, int Duracion, float Calificación){
        this.Titulo = Titulo;
        this.Tipo = Tipo;
        this.Duracion = Duracion;
        this.Calificacion = Calificación;
    }

    public String getTitulo(){
        return Titulo;
    }

    public void setTitulo(){
        this.Titulo = Titulo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(){
        Duracion = Duracion;
    }

    public float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(float calificacion) {
        Calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Titulo= " + Titulo + " , Tipo= " + Tipo + " , Duración= " + Duracion + " , Calificación= " + Calificacion;
    }
}
