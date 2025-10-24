package Punto3; // Trabaja con el paquete Punto3

public class Autor { // Crea la clase pública Autor
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String nacionalidad; // Crea la variable privada de tipo String llamada nacionalidad

    public Autor(String nombre, String nacionalidad) { // Constructor público de la clase Autor
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getNacionalidad() { // Método público para obtener la nacionalidad
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) { // Método público para establecer la nacionalidad
        this.nacionalidad = nacionalidad;
    }
}
