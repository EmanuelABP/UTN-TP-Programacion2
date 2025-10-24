package Parte1; // Pertenece al paquete Parte1

// Interfaz que hereda de Pago y agrega funcionalidad de descuento
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double porcentaje); // Método para aplicar un descuento
}
