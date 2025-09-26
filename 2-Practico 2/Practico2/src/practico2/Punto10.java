package practico2;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un Scanner para leer los datos del usuario

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt(); // Leo el stock actual del producto

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt(); // Leo la cantidad vendida

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt(); // Leo la cantidad recibida

        // Llamo al método actualizarStock para calcular el nuevo stock
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock); // Imprimo el stock actualizado

        scan.close(); // Cierro el Scanner
    }

    // Método que calcula el nuevo stock después de venta y recepción de productos
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {

        // Calculo el nuevo stock restando lo vendido y sumando lo recibido
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;

        return nuevoStock; // Retorno el stock actualizado
    }
}
