package practico2; // asegúrate de que el proyecto se llame Practico2

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = scan.nextInt();

        // Lógica para determinar si es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

        scan.close();
    }
}
