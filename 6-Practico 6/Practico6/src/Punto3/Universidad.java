package Punto3; // Se trabaja en el paquete Punto3

import java.util.ArrayList;
import java.util.List;

public class Universidad { // Clase pública Universidad

    private String nombre; // Nombre de la universidad
    private List<Profesor> profesores; // Lista de profesores
    private List<Curso> cursos; // Lista de cursos

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Agregar profesor
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    // Agregar curso
    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    // Asignar profesor a un curso usando código de curso e ID de profesor
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor prof = buscarProfesorPorId(idProfesor);
        if (curso != null && prof != null) {
            curso.setProfesor(prof); // Usamos setProfesor del curso
        }
    }

    // Listar todos los profesores
    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    // Listar todos los cursos
    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    // Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // Eliminar curso por código
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().eliminarCurso(c); // Rompe la relación con el profesor
            }
            cursos.remove(c); // Remueve de la lista de cursos
        }
    }

    // Eliminar profesor por ID
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Dejar null en todos los cursos que dictaba
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            profesores.remove(p); // Remover al profesor
        }
    }
}
