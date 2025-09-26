package practico2;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un objeto Scanner para leer datos del usuario

        int numero; // Variable para almacenar el número ingresado por el usuario
        int sumaPares = 0; // Variable para acumular la suma de los números pares

        System.out.println("Ingrese números (0 para terminar):");

        // Ciclo que se repite mientras el número ingresado no sea 0
        while (true) {

            System.out.print("Ingrese un número: ");
            numero = scan.nextInt(); // Leo el número ingresado por el usuario

            if (numero == 0) { // Condición para terminar el ciclo
                break; // Salgo del ciclo si el número es 0
            }

            if (numero % 2 == 0) { // Verifico si el número es par
                sumaPares += numero; // Si es par, lo sumo al acumulador
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares); // Imprimo la suma total de pares

        scan.close(); // Cierro el Scanner
    }
}
