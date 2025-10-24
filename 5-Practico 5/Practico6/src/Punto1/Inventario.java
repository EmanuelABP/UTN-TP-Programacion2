package Punto1; // Se trabaja en el paquete Punto1

import java.util.ArrayList; // Se importa ArrayList para manejar colecciones dinámicas

public class Inventario { // Se crea la clase pública Inventario

    private ArrayList<Producto> productos; // Lista dinámica de productos

    // Constructor de Inventario
    public Inventario() {
        this.productos = new ArrayList<>(); // Se inicializa la lista vacía de productos
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p); // Se agrega el producto a la lista
    }

    // Método para listar todos los productos del inventario
    public void listarProductos() {
        for (Producto p : productos) { // Se recorre la lista con for-each
            p.mostrarInfo(); // Se muestra la información de cada producto
        }
    }

    // Método para buscar un producto por su ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) { // Se compara el ID
                return p; // Se retorna el producto encontrado
            }
        }
        return null; // Si no se encuentra, retorna null
    }

    // Método para eliminar un producto por ID
    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id)); // Se elimina si coincide el ID
    }

    // Método para actualizar la cantidad en stock de un producto
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id); // Se busca el producto
        if (p != null) {
            p.setCantidad(nuevaCantidad); // Se actualiza la cantidad si existe
        }
    }

    // Método para filtrar productos por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) { // Se compara la categoría
                p.mostrarInfo(); // Se muestra la info del producto
            }
        }
    }

    // Método para obtener el total de stock disponible
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad(); // Se suma la cantidad de cada producto
        }
        return total; // Se retorna el total
    }

    // Método para obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null; // Retorna null si no hay productos
        Producto max = productos.get(0); // Se toma el primero como referencia
        for (Producto p : productos) {
            if (p.getCantidad() > max.getCantidad()) {
                max = p; // Se actualiza si se encuentra uno con mayor cantidad
            }
        }
        return max; // Retorna el producto con mayor stock
    }

    // Método para filtrar productos por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo(); // Muestra los productos que cumplen el rango
            }
        }
    }

    // Método para mostrar todas las categorías disponibles con sus descripciones
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) { // Se recorren todos los valores del enum
            System.out.println(c + " - " + c.getDescripcion()); // Muestra el nombre y la descripción
        }
    }
}
