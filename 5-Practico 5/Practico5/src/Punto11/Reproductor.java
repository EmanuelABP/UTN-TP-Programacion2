package Punto11; // Trabaja con el paquete Punto11

public class Reproductor { // Crea la clase pública Reproductor

    public void reproducir(Cancion cancion) { // Dependencia de uso: Reproductor usa Cancion como parámetro
        System.out.println("Reproduciendo la canción: " + cancion.getTitulo() +
                           " del artista: " + cancion.getArtista().getNombre());
    }
}
