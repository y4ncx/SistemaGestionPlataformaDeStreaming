package streaming;

public class Suscripcion {
    float Precio;
    String Nombre;

    public Suscripcion(){
        this.Precio = 0;
        this.Nombre = "NombrePorDefecto";

    }

    public Suscripcion(Float Precio, String Nombre){
        this.Nombre = Nombre;
        this.Precio = Precio;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + " , Precio= " + Precio;
    }
}
