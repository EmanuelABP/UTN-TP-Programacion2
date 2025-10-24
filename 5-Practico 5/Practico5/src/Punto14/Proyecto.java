package Punto14; // Trabaja con el paquete Punto14

public class Proyecto { // Crea la clase pública Proyecto
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private int duracionMin; // Crea la variable privada de tipo int llamada duracionMin

    public Proyecto(String nombre, int duracionMin) { // Constructor público
        this.nombre = nombre; // Asigna el valor del parámetro nombre
        this.duracionMin = duracionMin; // Asigna el valor del parámetro duracionMin
    }

    public String getNombre() { // Método para obtener el nombre del proyecto
        return nombre;
    }

    public void setNombre(String nombre) { // Método para establecer el nombre del proyecto
        this.nombre = nombre;
    }

    public int getDuracionMin() { // Método para obtener la duración del proyecto
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) { // Método para establecer la duración del proyecto
        this.duracionMin = duracionMin;
    }
}
