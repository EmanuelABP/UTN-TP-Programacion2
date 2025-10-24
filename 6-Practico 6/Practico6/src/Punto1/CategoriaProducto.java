package Punto1; // Se trabaja en el paquete Punto1

// Se define un enum público llamado CategoriaProducto
public enum CategoriaProducto {

    // Definición de los valores posibles del enum con su descripción
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    // Atributo privado final que guarda la descripción de cada categoría
    private final String descripcion;

    // Constructor del enum, siempre privado, que inicializa la descripción
    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método público para obtener la descripción de la categoría
    public String getDescripcion() {
        return descripcion;
    }
}
