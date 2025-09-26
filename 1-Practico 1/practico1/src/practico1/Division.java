// Clase Division punto 8
package practico1;

import java.util.Scanner;

public class Division {

    // Método público o privado según diseño
    public static void divisionEntera() {
        
        System.out.println("\nPunto 8.a.:");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPunto 8a: División entera");
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = sc.nextInt();
        int resultado = num1 / num2;
        System.out.println("Resultado de la división entera: " + resultado);
    }

    public static void divisionDouble() {
        
        System.out.println("\nPunto 8.b.:");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPunto 8b: División con decimales");
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        double resultado = num1 / num2;
        System.out.println("Resultado de la división con decimales: " + resultado);
    }
}
