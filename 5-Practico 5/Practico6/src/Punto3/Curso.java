package Punto3; // Se trabaja en el paquete Punto3

public class Curso { // Clase pública Curso

    // Atributos
    private String codigo; // Código único
    private String nombre; // Nombre del curso
    private Profesor profesor; // Profesor responsable

    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Setter de profesor con sincronización bidireccional
    public void setProfesor(Profesor p) {
        // Si ya tenía profesor, remover el curso de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p; // Asignar nuevo profesor
        // Agregar este curso a la lista del profesor si no estaba
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    // Método para mostrar información del curso
    public void mostrarInfo() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre
                + ", Profesor: " + (profesor != null ? profesor.getNombre() : "Sin profesor"));
    }
}
