package Parte1; // Pertenece al paquete Parte1

// Clase que implementa PagoConDescuento
public class TarjetaCredito implements PagoConDescuento {

    // Implementación del método procesarPago de Pago
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta: " + monto);
    }

    // Implementación del método aplicarDescuento de PagoConDescuento
    @Override
    public double aplicarDescuento(double porcentaje) {
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        return porcentaje;
    }
}
