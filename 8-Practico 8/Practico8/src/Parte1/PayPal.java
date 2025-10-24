package Parte1; // Pertenece al paquete Parte1

// Clase que implementa Pago
public class PayPal implements Pago {

    // Implementación del método procesarPago
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal: " + monto);
    }
}
