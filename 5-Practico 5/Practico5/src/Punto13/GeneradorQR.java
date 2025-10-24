package Punto13; // Trabaja con el paquete Punto13

public class GeneradorQR { // Crea la clase pública GeneradorQR

    public void generar(String valor, Usuario usuario) { // Dependencia de creación: GeneradorQR crea un CodigoQR dentro del método
        CodigoQR qr = new CodigoQR(valor, usuario); // Crea un objeto CodigoQR asociado al usuario
        System.out.println("Código QR generado: " + qr.getValor() + " para el usuario " + qr.getUsuario().getNombre());
    }
}
