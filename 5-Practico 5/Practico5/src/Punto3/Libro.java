package Punto3; // Trabaja con el paquete Punto3

public class Libro { // Crea la clase pública Libro
    private String titulo; // Crea la variable privada de tipo String llamada titulo
    private String isbn; // Crea la variable privada de tipo String llamada isbn
    private Autor autor; // Asociación unidireccional: Libro → Autor
    private Editorial editorial; // Agregación: Libro → Editorial

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) { // Constructor público de Libro
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor; // Relación unidireccional: Libro conoce al Autor
        this.editorial = editorial; // Relación de agregación: Libro tiene una Editorial
    }

    public String getTitulo() { // Método público para obtener el título
        return titulo;
    }

    public void setTitulo(String titulo) { // Método público para establecer el título
        this.titulo = titulo;
    }

    public String getIsbn() { // Método público para obtener el ISBN
        return isbn;
    }

    public void setIsbn(String isbn) { // Método público para establecer el ISBN
        this.isbn = isbn;
    }

    public Autor getAutor() { // Método público para obtener el Autor
        return autor;
    }

    public void setAutor(Autor autor) { // Método público para establecer el Autor
        this.autor = autor;
    }

    public Editorial getEditorial() { // Método público para obtener la Editorial
        return editorial;
    }

    public void setEditorial(Editorial editorial) { // Método público para establecer la Editorial
        this.editorial = editorial;
    }
}
