package Parte1; // Pertenece al paquete Parte1

// Clase Cliente que implementa Notificable
public class Cliente implements Notificable {
    private String nombre; // Nombre del cliente

    // Constructor que inicializa el nombre
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método notificar
    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + nombre + " recibido: " + mensaje);
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }
}
