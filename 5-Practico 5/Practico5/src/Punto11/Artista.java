package Punto11; // Trabaja con el paquete Punto11

public class Artista { // Crea la clase pública Artista
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String genero; // Crea la variable privada de tipo String llamada genero

    public Artista(String nombre, String genero) { // Constructor público de la clase Artista
        this.nombre = nombre; // Asigna el valor del parámetro nombre
        this.genero = genero; // Asigna el valor del parámetro genero
    }

    public String getNombre() { // Método público para obtener el nombre del artista
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre del artista
        this.nombre = nombre;
    }

    public String getGenero() { // Método público para obtener el género
        return genero;
    }

    public void setGenero(String genero) { // Método público para establecer el género
        this.genero = genero;
    }
}
