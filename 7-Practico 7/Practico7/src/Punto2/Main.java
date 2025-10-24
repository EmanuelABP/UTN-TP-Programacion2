package Punto2; // Paquete Punto2

public class Main { // Clase principal

    public static void main(String[] args) {
        // Creamos un array de figuras usando polimorfismo
        Figura[] figuras = new Figura[2]; // Array de Figura que puede contener cualquier subclase
        figuras[0] = new Circulo("Círculo 1", 5.0); // Asignamos un Circulo
        figuras[1] = new Rectangulo("Rectángulo 1", 4.0, 6.0); // Asignamos un Rectangulo

        // Recorremos el array y mostramos el área de cada figura
        for (Figura f : figuras) { // Polimorfismo: f puede ser Circulo o Rectangulo
            System.out.println(f.getNombre() + " tiene área: " + f.calcularArea()); // Llama al método sobrescrito de cada subclase
        }
    }
}
