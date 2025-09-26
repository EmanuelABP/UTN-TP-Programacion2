package practico2;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un objeto Scanner para leer la nota del usuario
        int nota; // Variable para almacenar la nota ingresada

        // Uso de do-while para asegurarnos de que se pida la nota al menos una vez
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scan.nextInt(); // Leo la nota ingresada

            // Verifico si la nota está fuera del rango válido
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10); // Mientras la nota esté fuera del rango, se repite el ciclo

        // Si llega acá, la nota es válida
        System.out.println("Nota guardada correctamente.");

        scan.close(); // Cierro el Scanner
    }
}
