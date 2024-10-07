package streaming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Código= 7502410016");
        System.out.println("YANCES SALGADO JASSIR SAID");
        System.out.println("*********************************************");

        System.out.println();

        Plataforma plataformaDefecto = new Plataforma();
        System.out.println(plataformaDefecto);
        Plataforma plataformaPersonalizada = new Plataforma( "CineTodo", "Terror y aventura",10000);
        System.out.println(plataformaPersonalizada);

        System.out.println();


        Usuario usuarioDefecto = new Usuario();
        System.out.println(usuarioDefecto);
        Usuario usuarioPersonalizado = new Usuario("y4ncx", 17, "Premium");
        System.out.println(usuarioPersonalizado);

        System.out.println();


        Pelicula peliculaDefecto = new Pelicula();
        System.out.println(peliculaDefecto);
        Pelicula peliculaPersonalizada = new Pelicula("Batman", "Sci-Fi", 70, 4.5f);
        System.out.println(peliculaPersonalizada);

        System.out.println();


        Suscripcion suscripcionDefecto = new Suscripcion();
        System.out.println(suscripcionDefecto);
        Suscripcion suscripcionPersonalizada = new Suscripcion(2500f, "PREMIUM");
        System.out.println(suscripcionPersonalizada);









        }
    }