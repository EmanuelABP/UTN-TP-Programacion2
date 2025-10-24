package Punto3; // Se trabaja en el paquete Punto3

import java.util.ArrayList;
import java.util.List;

public class Profesor { // Clase pública Profesor

    // Atributos
    private String id; // Identificador único del profesor
    private String nombre; // Nombre completo
    private String especialidad; // Área principal
    private List<Curso> cursos; // Lista de cursos que dicta

    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Inicializamos la lista de cursos vacía
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Método para agregar un curso al profesor y sincronizar la relación
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) { // Evitar duplicados
            cursos.add(c); // Agregar a la lista del profesor
        }
        if (c.getProfesor() != this) { // Sincronizar lado del curso
            c.setProfesor(this);
        }
    }

    // Método para eliminar un curso y sincronizar la relación
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c); // Quitar curso de la lista del profesor
        }
        if (c.getProfesor() == this) { // Quitar referencia del curso
            c.setProfesor(null);
        }
    }

    // Método para listar los cursos que dicta
    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println("Código: " + c.getCodigo() + ", Nombre: " + c.getNombre());
        }
    }

    // Mostrar información del profesor y cantidad de cursos
    public void mostrarInfo() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad
                + ", Cursos dictando: " + cursos.size());
    }
}
