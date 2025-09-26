package punto5; // Se define el paquete donde estará guardado el código

// Clase principal que contiene todo el código
public class SimulacionNave {

    // Clase interna NaveEspacial
    static class NaveEspacial {
        // Atributos
        String nombre;          // nombre de la nave
        int combustible;        // nivel actual de combustible
        final int MAX_COMBUSTIBLE = 100; // límite máximo de combustible permitido

        // Método para simular el despegue
        void despegar() {
            if (combustible >= 10) { // validamos que tenga combustible suficiente
                combustible -= 10;   // consume 10 unidades para despegar
                System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
            } else {
                System.out.println(nombre + " no tiene suficiente combustible para despegar.");
            }
        }

        // Método para avanzar cierta distancia
        void avanzar(int distancia) {
            int consumo = distancia * 2; // cada unidad de distancia consume 2 de combustible
            if (combustible >= consumo) {
                combustible -= consumo;
                System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
            } else {
                System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " unidades.");
            }
        }

        // Método para recargar combustible
        void recargarCombustible(int cantidad) {
            if (combustible + cantidad <= MAX_COMBUSTIBLE) {
                combustible += cantidad; // se suma normalmente
                System.out.println(nombre + " recargó " + cantidad + " unidades. Combustible actual: " + combustible);
            } else {
                combustible = MAX_COMBUSTIBLE; // se ajusta al máximo permitido
                System.out.println(nombre + " intentó recargar demasiado. Combustible lleno al máximo (" + MAX_COMBUSTIBLE + ").");
            }
        }

        // Método para mostrar el estado actual de la nave
        void mostrarEstado() {
            System.out.println("Nave: " + nombre);
            System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
            System.out.println("-----------------------------");
        }
    }

    // Método main para probar la simulación
    public static void main(String[] args) {
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Andrómeda"; // se asigna un nombre
        nave1.combustible = 50;     // se asigna el combustible inicial

        // Mostrar estado inicial
        System.out.println("Estado inicial de la nave:");
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar lo suficiente
        System.out.println("Intentando avanzar sin recargar...");
        nave1.avanzar(30); // necesitaría 60 de combustible, pero solo tiene 50

        // Recargar combustible
        System.out.println("Recargando combustible...");
        nave1.recargarCombustible(40); // recarga hasta el máximo

        // Avanzar correctamente
        System.out.println("Avanzando correctamente...");
        nave1.avanzar(20); // consume 40, debería alcanzar

        // Mostrar estado final
        System.out.println("Estado final de la nave:");
        nave1.mostrarEstado();
    }
}
