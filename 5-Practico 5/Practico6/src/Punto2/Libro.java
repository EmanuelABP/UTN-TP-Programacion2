package Punto2; // Se trabaja en el paquete Punto2

public class Libro { // Clase pública Libro

    // Atributos de la clase Libro
    private String isbn; // Identificador único del libro
    private String titulo; // Título del libro
    private int anioPublicacion; // Año de publicación
    private Autor autor; // Autor del libro

    // Constructor de la clase Libro
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn; // Asignamos ISBN
        this.titulo = titulo; // Asignamos título
        this.anioPublicacion = anioPublicacion; // Asignamos año de publicación
        this.autor = autor; // Asignamos autor
    }

    // Getters
    public String getIsbn() {
        return isbn; // Retorna ISBN
    }

    public String getTitulo() {
        return titulo; // Retorna título
    }

    public int getAnioPublicacion() {
        return anioPublicacion; // Retorna año
    }

    public Autor getAutor() {
        return autor; // Retorna autor
    }

    // Método para mostrar información del libro junto con su autor
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn 
                + ", Título: " + titulo 
                + ", Año: " + anioPublicacion);
        System.out.print("Autor -> ");
        autor.mostrarInfo(); // Llama al método mostrarInfo del autor
    }
}
