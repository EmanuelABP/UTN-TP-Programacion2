package practico2;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un objeto Scanner para leer datos del usuario

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble(); // Leo el precio ingresado por el usuario

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0); // Leo la categoría y la convierto a mayúscula

        double descuento = 0; // Inicializo la variable descuento

        // Evaluo la categoría y asigno el descuento correspondiente
        switch (categoria) {
            case 'A':
                descuento = 0.10; // Calculo el 10% de descuento
                break;
            case 'B':
                descuento = 0.15; // Calculo el 15% de descuento
                break;
            case 'C':
                descuento = 0.20; // Calculo el 20% de descuento
                break;
            default:
                // No hago nada si la categoría no es válida
                break;
        }

        double precioFinal = precio * (1 - descuento); // Calculo el precio final restando el descuento

        // Imprimo el resultado solo si hubo descuento
        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%"); // Muestro el % de descuento
            System.out.println("Precio final: " + precioFinal); // Muestro el precio final
        }

        scan.close(); // Cierro el Scanner
    }
}
