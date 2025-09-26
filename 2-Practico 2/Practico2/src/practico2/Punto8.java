package practico2;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un Scanner para leer los datos del usuario

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble(); // Leo el precio base

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scan.nextDouble(); // Leo el porcentaje de impuesto

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scan.nextDouble(); // Leo el porcentaje de descuento

        // Llamo al método calcularPrecioFinal y guardo el resultado en precioFinal
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal); // Imprimo el precio final

        scan.close(); // Cierro el Scanner
    }

    // Método que calcula el precio final aplicando impuesto y descuento
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {

        // Calcula el impuesto sobre el precio base
        double montoImpuesto = precioBase * (impuesto / 100);

        // Calcula el descuento sobre el precio base
        double montoDescuento = precioBase * (descuento / 100);

        // Calcula el precio final sumando impuesto y restando descuento
        double precioFinal = precioBase + montoImpuesto - montoDescuento;

        return precioFinal; // Retorno el precio final calculado
    }
}

