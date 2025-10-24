package Parte1; // Pertenece al paquete Parte1

import java.util.ArrayList; // Importa ArrayList para manejar listas
import java.util.List;      // Importa la interfaz List

// Clase Pedido que implementa Pagable
public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>(); // Lista de productos
    private Cliente cliente; // Cliente asociado al pedido

    // Constructor que inicializa el cliente
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para agregar un producto al pedido
    public void agregarProducto(Producto p) {
        productos.add(p); // Agrega el producto a la lista
        cliente.notificar("Producto agregado: " + p.getPrecio()); // Notifica al cliente
    }

    // Implementación del método calcularTotal de Pagable
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal(); // Suma el precio de todos los productos
        }
        return total; // Devuelve el total del pedido
    }
}
