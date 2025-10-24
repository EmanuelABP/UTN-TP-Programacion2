package Punto1; // Se trabaja en el paquete Punto1

public class Main { // Clase principal para ejecutar las tareas

    public static void main(String[] args) {
        
        // 1. Crear el inventario y al menos cinco productos con diferentes categorías
        Inventario inventario = new Inventario(); // Creamos el inventario
        
        Producto p1 = new Producto("P001", "Arroz", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 25000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1500.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Cafetera", 3000.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 800.0, 60, CategoriaProducto.ALIMENTOS);

        // Agregamos los productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("---- 2. Listar todos los productos ----");
        inventario.listarProductos(); // Muestra la info de todos los productos

        System.out.println("\n---- 3. Buscar producto por ID (P003) ----");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }

        System.out.println("\n---- 4. Filtrar productos por categoría ALIMENTOS ----");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n---- 5. Eliminar producto por ID (P002) y listar restantes ----");
        inventario.eliminarProducto("P002"); // Eliminamos el televisor
        inventario.listarProductos(); // Listamos el inventario actualizado

        System.out.println("\n---- 6. Actualizar stock del producto P004 ----");
        inventario.actualizarStock("P004", 25); // Cambiamos stock de la cafetera
        Producto actualizado = inventario.buscarProductoPorId("P004");
        if (actualizado != null) {
            actualizado.mostrarInfo();
        }

        System.out.println("\n---- 7. Mostrar total de stock disponible ----");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades en stock: " + totalStock);

        System.out.println("\n---- 8. Obtener y mostrar producto con mayor stock ----");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        System.out.println("\n---- 9. Filtrar productos con precios entre $1000 y $3000 ----");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        System.out.println("\n---- 10. Mostrar categorías disponibles con sus descripciones ----");
        inventario.mostrarCategoriasDisponibles();
    }
}
