package Punto2; // Se trabaja en el paquete Punto2

public class Autor { // Clase pública Autor
    
    // Atributos de la clase
    private String id; // Identificador único del autor
    private String nombre; // Nombre completo del autor
    private String nacionalidad; // Nacionalidad del autor

    // Constructor de la clase Autor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id; // Asignamos el ID
        this.nombre = nombre; // Asignamos el nombre
        this.nacionalidad = nacionalidad; // Asignamos la nacionalidad
    }

    // Getters
    public String getId() {
        return id; // Retorna el ID
    }

    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    public String getNacionalidad() {
        return nacionalidad; // Retorna la nacionalidad
    }

    // Método para mostrar la información del autor en consola
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
}
