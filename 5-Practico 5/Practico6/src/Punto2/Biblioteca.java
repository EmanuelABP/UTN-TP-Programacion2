package Punto2; // Se trabaja en el paquete Punto2

import java.util.ArrayList; // Importamos ArrayList para colecciones
import java.util.HashSet; // Para manejar autores únicos
import java.util.List;
import java.util.Set;

public class Biblioteca { // Clase pública Biblioteca

    private String nombre; // Nombre de la biblioteca
    private List<Libro> libros; // Lista de libros en la biblioteca

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre; // Asignamos nombre
        this.libros = new ArrayList<>(); // Inicializamos lista vacía
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor); // Creamos el libro
        libros.add(libro); // Lo agregamos a la lista
    }

    // Listar todos los libros con su información
    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrarInfo(); // Muestra info del libro y su autor
            System.out.println("---------------------------");
        }
    }

    // Buscar un libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l; // Retorna el libro encontrado
            }
        }
        return null; // Retorna null si no se encuentra
    }

    // Eliminar un libro por ISBN
    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn)); // Elimina si coincide el ISBN
    }

    // Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size(); // Retorna tamaño de la lista
    }

    // Filtrar libros por año de publicación
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                System.out.println("---------------------------");
            }
        }
    }

    // Mostrar todos los autores de los libros disponibles (sin repetir)
    public void mostrarAutoresDisponibles() {
        Set<Autor> autoresUnicos = new HashSet<>(); // Para evitar duplicados
        for (Libro l : libros) {
            autoresUnicos.add(l.getAutor());
        }
        for (Autor a : autoresUnicos) {
            a.mostrarInfo();
        }
    }
}
