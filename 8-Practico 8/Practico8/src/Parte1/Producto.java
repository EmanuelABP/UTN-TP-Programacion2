package Parte1; // Pertenece al paquete Parte1

// Clase Producto que implementa la interfaz Pagable
public class Producto implements Pagable {
    private String nombre; // Atributo para el nombre del producto
    private double precio; // Atributo para el precio del producto

    // Constructor que inicializa nombre y precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter para precio
    public double getPrecio() {
        return precio;
    }

    // Implementación del método calcularTotal de la interfaz Pagable
    @Override
    public double calcularTotal() {
        return precio; // El total de un producto es su precio
    }
}
