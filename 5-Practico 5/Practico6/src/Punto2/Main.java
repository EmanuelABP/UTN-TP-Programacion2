package Punto2; // Se trabaja en el paquete Punto2

public class Main { // Clase principal para ejecutar el punto 2

    public static void main(String[] args) {

        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "George Orwell", "Británico");

        // 3. Agregar 5 libros asociados a los autores
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("L002", "El coronel no tiene quien le escriba", 1961, autor1);
        biblioteca.agregarLibro("L003", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("L004", "1984", 1949, autor3);
        biblioteca.agregarLibro("L005", "Animal Farm", 1945, autor3);

        // 4. Listar todos los libros con información del autor
        System.out.println("---- Listado de libros ----");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN
        System.out.println("---- Buscar libro por ISBN L003 ----");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }

        // 6. Filtrar libros por año de publicación
        System.out.println("---- Filtrar libros publicados en 1949 ----");
        biblioteca.filtrarLibrosPorAnio(1949);

        // 7. Eliminar un libro por ISBN y listar restantes
        System.out.println("---- Eliminar libro L002 y listar restantes ----");
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles
        System.out.println("---- Autores disponibles ----");
        biblioteca.mostrarAutoresDisponibles();
    }
}
