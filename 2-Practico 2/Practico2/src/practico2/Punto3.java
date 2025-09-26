package practico2;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        // Clasificación de edad
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }

        scan.close();
    }
}
