package punto3; // Se define el paquete donde estará guardado el código

// Clase principal que contiene todo el código
public class RegistroLibro {

    // Clase interna Libro
    static class Libro {
        // Atributos privados (encapsulamiento)
        private String titulo;            // título del libro
        private String autor;             // autor del libro
        private int anioPublicacion;      // año de publicación del libro

        // Getter para titulo
        public String getTitulo() {
            return titulo; // devuelve el valor del título
        }

        // Setter para titulo
        public void setTitulo(String nuevoTitulo) {
            titulo = nuevoTitulo; // asigna un nuevo título
        }

        // Getter para autor
        public String getAutor() {
            return autor; // devuelve el valor del autor
        }

        // Setter para autor
        public void setAutor(String nuevoAutor) {
            autor = nuevoAutor; // asigna un nuevo autor
        }

        // Getter para año de publicación
        public int getAnioPublicacion() {
            return anioPublicacion; // devuelve el año de publicación
        }

        // Setter para año de publicación con validación
        public void setAnioPublicacion(int nuevoAnio) {
            if (nuevoAnio > 0 && nuevoAnio <= 2025) { // validamos que sea un año válido
                anioPublicacion = nuevoAnio; 
                System.out.println("Año de publicación actualizado correctamente.");
            } else {
                System.out.println("Año inválido: " + nuevoAnio); // mensaje si el año no es válido
            }
        }

        // Método para mostrar toda la info del libro
        public void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de publicación: " + anioPublicacion);
        }
    }

    // Método main: donde probamos el funcionamiento
    public static void main(String[] args) {
        // Se crea un objeto Libro
        Libro libro1 = new Libro(); // se instancia un libro

        // Asignar valores iniciales con setters
        libro1.setTitulo("El Principito"); // se asigna el título
        libro1.setAutor("Antoine de Saint-Exupéry"); // se asigna el autor
        libro1.setAnioPublicacion(1943); // se asigna el año de publicación válido

        // Mostrar info inicial del libro
        System.out.println("Información inicial del libro:");
        libro1.mostrarInfo();

        // Intentar modificar con un año inválido
        System.out.println("\nIntentando cambiar año a un valor inválido:");
        libro1.setAnioPublicacion(-100); // año inválido → se rechaza

        // Modificar con un año válido
        System.out.println("\nCambiando año a un valor válido:");
        libro1.setAnioPublicacion(2020); // año válido → se actualiza

        // Mostrar info final del libro
        System.out.println("\nInformación final del libro:");
        libro1.mostrarInfo();
    }
}
