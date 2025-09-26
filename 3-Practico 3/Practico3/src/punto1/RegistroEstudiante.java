package punto1; // Se define el paquete donde está guardada la clase

// Clase principal que contiene todo el código
public class RegistroEstudiante {

    // Clase interna Estudiante
    static class Estudiante {
        // Atributos (estado del objeto)
        String nombre;   // se crea la variable nombre
        String apellido; // se crea la variable apellido
        String curso;    // se crea la variable curso
        double calificacion; // se crea la variable calificación

        // Método para mostrar toda la información del estudiante
        void mostrarInfo() {
            System.out.println("Nombre: " + nombre);    // muestra el nombre
            System.out.println("Apellido: " + apellido); // muestra el apellido
            System.out.println("Curso: " + curso);       // muestra el curso
            System.out.println("Calificación: " + calificacion); // muestra la calificación
        }

        // Método para subir la calificación
        void subirCalificacion(double puntos) {
            calificacion += puntos; // se suma la nota
            System.out.println("Calificación aumentada a: " + calificacion); // muestra el nuevo valor
        }

        // Método para bajar la calificación
        void bajarCalificacion(double puntos) {
            calificacion -= puntos; // se resta la nota
            System.out.println("Calificación disminuida a: " + calificacion); // muestra el nuevo valor
        }
    }

    // Método main: aquí empieza la ejecución del programa
    public static void main(String[] args) {
        // Se crea un objeto Estudiante y se asignan valores a sus atributos
        Estudiante estudiante1 = new Estudiante(); // se crea el objeto estudiante1
        estudiante1.nombre = "Martín";    // se asigna el nombre
        estudiante1.apellido = "Pérez";   // se asigna el apellido
        estudiante1.curso = "Programación II"; // se asigna el curso
        estudiante1.calificacion = 7.5;   // se asigna la calificación inicial

        // Mostrar info inicial del estudiante
        System.out.println("Información del estudiante:");
        estudiante1.mostrarInfo(); // se llama al método mostrarInfo

        // Cambiar calificaciones
        estudiante1.subirCalificacion(1.5); // se sube la nota en 1.5
        estudiante1.bajarCalificacion(2.0); // se baja la nota en 2.0

        // Mostrar info final del estudiante
        System.out.println("Información final del estudiante:");
        estudiante1.mostrarInfo(); // se vuelve a mostrar la info actualizada
    }
}
