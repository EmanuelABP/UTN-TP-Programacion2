package practico2;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un Scanner para leer los datos del usuario

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble(); // Leo el precio del producto

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble(); // Leo el peso del paquete

        scan.nextLine(); // Limpio el buffer del Scanner
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.nextLine(); // Leo la zona de envío

        // Llamo al método calcularCostoEnvio para obtener el costo según peso y zona
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio); // Imprimo el costo de envío

        // Llamo al método calcularTotalCompra para obtener el total a pagar
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra); // Imprimo el total

        scan.close(); // Cierro el Scanner
    }

    // Método que calcula el costo de envío según peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equalsIgnoreCase("Nacional")) { // Si la zona es Nacional
            costo = peso * 5; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) { // Si la zona es Internacional
            costo = peso * 10; // $10 por kg
        } else { // Si la zona ingresada no es válida
            System.out.println("Zona no válida. Se considerará Nacional por defecto.");
            costo = peso * 5;
        }

        return costo; // Retorno el costo calculado
    }

    // Método que calcula el total de la compra sumando precio del producto y costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double total = precioProducto + costoEnvio; // Sumo precio y costo de envío
        return total; // Retorno el total
    }
}
