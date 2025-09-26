package punto2; // Se define el paquete donde está guardada la clase

// Clase principal que contiene todo el código
public class RegistroMascotas {

    // Clase interna Mascota
    static class Mascota {
        // Atributos (estado de la mascota)
        String nombre;   // se crea la variable nombre
        String especie;  // se crea la variable especie
        int edad;        // se crea la variable edad

        // Método para mostrar toda la información de la mascota
        void mostrarInfo() {
            System.out.println("Nombre: " + nombre);   // muestra el nombre
            System.out.println("Especie: " + especie); // muestra la especie
            System.out.println("Edad: " + edad);       // muestra la edad
        }

        // Método para cumplir años (aumenta la edad en 1)
        void cumplirAnios() {
            edad++; // se incrementa la edad en 1
            System.out.println(nombre + " ha cumplido años. Ahora tiene: " + edad); 
        }
    }

    // Método main: aquí empieza la ejecución del programa
    public static void main(String[] args) {
        // Se crea un objeto Mascota y se asignan valores a sus atributos
        Mascota mascota1 = new Mascota(); // se crea el objeto mascota1
        mascota1.nombre = "Firulais";     // se asigna el nombre
        mascota1.especie = "Perro";       // se asigna la especie
        mascota1.edad = 3;                // se asigna la edad inicial

        // Mostrar info inicial de la mascota
        System.out.println("Información de la mascota:");
        mascota1.mostrarInfo(); // se llama al método mostrarInfo

        // Simular el paso del tiempo (cumplir años)
        mascota1.cumplirAnios(); // la mascota cumple un año más

        // Mostrar info final de la mascota
        System.out.println("Información final de la mascota:");
        mascota1.mostrarInfo(); // se vuelve a mostrar la info actualizada
    }
}
