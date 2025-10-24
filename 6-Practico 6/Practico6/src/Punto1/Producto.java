package Punto1; // Se trabaja en el paquete Punto1

public class Producto { // Se crea la clase pública Producto

    // Atributos de la clase Producto
    private String id; // Identificador único del producto
    private String nombre; // Nombre del producto
    private double precio; // Precio del producto
    private int cantidad; // Cantidad disponible en stock
    private CategoriaProducto categoria; // Categoría del producto (enum)

    // Constructor de la clase Producto
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id; // Se asigna el ID al producto
        this.nombre = nombre; // Se asigna el nombre
        this.precio = precio; // Se asigna el precio
        this.cantidad = cantidad; // Se asigna la cantidad
        this.categoria = categoria; // Se asigna la categoría
    }

    // Getters y Setters para acceder y modificar los atributos si es necesario

    public String getId() {
        return id; // Retorna el ID del producto
    }

    public String getNombre() {
        return nombre; // Retorna el nombre del producto
    }

    public double getPrecio() {
        return precio; // Retorna el precio del producto
    }

    public int getCantidad() {
        return cantidad; // Retorna la cantidad disponible
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; // Actualiza la cantidad del producto
    }

    public CategoriaProducto getCategoria() {
        return categoria; // Retorna la categoría del producto
    }

    // Método para mostrar la información completa del producto
    public void mostrarInfo() {
        System.out.println("ID: " + id 
                + ", Nombre: " + nombre 
                + ", Precio: $" + precio 
                + ", Cantidad: " + cantidad 
                + ", Categoría: " + categoria 
                + " (" + categoria.getDescripcion() + ")");
    }
}
