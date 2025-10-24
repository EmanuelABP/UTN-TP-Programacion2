package Parte2; // Pertenece al paquete Parte2

import java.util.Scanner; // Para leer datos desde consola

// Clase para convertir texto a número de forma segura
public class ConversionCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea Scanner
        System.out.print("Introduce un número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto); // Conversión a int
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) { // Captura error de conversión
            System.out.println("Error: Entrada inválida. Debe ser un número entero.");
        } finally {
            scanner.close(); // Siempre cerrar el Scanner
        }
    }
}
