package Parte2; // Pertenece al paquete Parte2

import java.util.Scanner; // Para leer datos desde consola

// Clase para realizar divisiones seguras
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea Scanner para leer números
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador; // División
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) { // Captura división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            scanner.close(); // Siempre cierra el Scanner
        }
    }
}
