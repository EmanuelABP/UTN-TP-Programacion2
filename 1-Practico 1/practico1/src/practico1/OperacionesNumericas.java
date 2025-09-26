package practico1; //punto 5

import java.util.Scanner;

public class OperacionesNumericas {
    public static void ejecutarOperaciones() {
        
        System.out.println("\nPunto 5:");
        
        Scanner sc = new Scanner(System.in);

        // Solicitar primer número
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = Integer.parseInt(sc.nextLine().trim());

        // Solicitar segundo número
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = Integer.parseInt(sc.nextLine().trim());

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0.0;
        if (num2 != 0) {
            division = (double) num1 / num2; // casting para obtener decimal
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        }
    }
}
