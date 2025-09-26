package practico2;

import java.util.Scanner;

public class Punto11 {

    // Variable global que representa el porcentaje de descuento especial (10%)
    static double descuentoGlobal = 0.10;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un Scanner para leer datos del usuario

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble(); // Leo el precio del producto ingresado

        // Llamo al método calcularDescuentoEspecial para calcular y mostrar el descuento
        calcularDescuentoEspecial(precio);

        scan.close(); // Cierro el Scanner
    }

    // Método que calcula el descuento especial usando la variable global
    public static void calcularDescuentoEspecial(double precio) {

        // Calculo el monto de descuento aplicado
        double descuentoAplicado = precio * descuentoGlobal;

        // Muestro el descuento aplicado
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);

        // Muestro el precio final después de aplicar el descuento
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
    }
}
