package punto4; // Se define el paquete donde estará guardado el código

// Clase principal que contiene todo el código
public class RegistroGallinas {

    // Clase interna Gallina
    static class Gallina {
        // Atributos de la gallina
        int idGallina;       // identificador de la gallina
        int edad;            // edad de la gallina
        int huevosPuestos;   // cantidad de huevos puestos

        // Método para simular que la gallina pone un huevo
        void ponerHuevo() {
            huevosPuestos++; // aumenta en 1 la cantidad de huevos
            System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
        }

        // Método para simular que la gallina envejece un año
        void envejecer() {
            edad++; // aumenta en 1 la edad
            System.out.println("La gallina " + idGallina + " ahora tiene " + edad + " años.");
        }

        // Método para mostrar el estado de la gallina
        void mostrarEstado() {
            System.out.println("ID: " + idGallina);
            System.out.println("Edad: " + edad);
            System.out.println("Huevos puestos: " + huevosPuestos);
            System.out.println("------------------------");
        }
    }

    // Método main: donde probamos el funcionamiento
    public static void main(String[] args) {
        // Crear primera gallina
        Gallina gallina1 = new Gallina(); // se instancia gallina1
        gallina1.idGallina = 1;           // se asigna ID
        gallina1.edad = 2;                // se asigna edad inicial
        gallina1.huevosPuestos = 5;       // se asigna huevos iniciales

        // Crear segunda gallina
        Gallina gallina2 = new Gallina(); // se instancia gallina2
        gallina2.idGallina = 2;           // se asigna ID
        gallina2.edad = 1;                // se asigna edad inicial
        gallina2.huevosPuestos = 3;       // se asigna huevos iniciales

        // Mostrar estado inicial de ambas
        System.out.println("Estado inicial de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        // Simular acciones
        System.out.println("Simulación de acciones:\n");
        gallina1.ponerHuevo();  // gallina1 pone un huevo
        gallina1.envejecer();   // gallina1 envejece un año

        gallina2.ponerHuevo();  // gallina2 pone un huevo
        gallina2.ponerHuevo();  // gallina2 pone otro huevo
        gallina2.envejecer();   // gallina2 envejece un año

        // Mostrar estado final de ambas
        System.out.println("\nEstado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
