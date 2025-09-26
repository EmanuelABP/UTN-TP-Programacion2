package practico2;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Creo un objeto Scanner para leer los números del usuario

        int positivos = 0; // Contador de números positivos
        int negativos = 0; // Contador de números negativos
        int ceros = 0;     // Contador de ceros
        int numero;        // Variable para almacenar el número ingresado por el usuario

        // Ciclo que se repite 10 veces para pedir los 10 números
        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese el número " + i + ": ");
            numero = scan.nextInt(); // Leo el número ingresado

            // Clasifico el número y aumento el contador correspondiente
            if (numero > 0) {
                positivos++; // Incremento el contador de positivos
            } else if (numero < 0) {
                negativos++; // Incremento el contador de negativos
            } else {
                ceros++; // Incremento el contador de ceros
            }
        }

        // Imprimo los resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos); 
        System.out.println("Negativos: " + negativos); 
        System.out.println("Ceros: " + ceros); 

        scan.close(); // Cierro el Scanner
    }
}
