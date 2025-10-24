package Punto11; // Trabaja con el paquete Punto11

public class Cancion { // Crea la clase pública Cancion
    private String titulo; // Crea la variable privada de tipo String llamada titulo
    private Artista artista; // Asociación unidireccional: Cancion → Artista

    public Cancion(String titulo, Artista artista) { // Constructor público de la clase Cancion
        this.titulo = titulo; // Asigna el valor del parámetro titulo
        this.artista = artista; // Asocia el artista a la canción
    }

    public String getTitulo() { // Método público para obtener el título de la canción
        return titulo;
    }

    public void setTitulo(String titulo) { // Método público para establecer el título de la canción
        this.titulo = titulo;
    }

    public Artista getArtista() { // Método público para obtener el artista
        return artista;
    }

    public void setArtista(Artista artista) { // Método público para establecer el artista
        this.artista = artista;
    }
}
