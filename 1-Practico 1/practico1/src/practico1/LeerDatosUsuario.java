package practico1; //punto 4

import java.util.Scanner;

public class LeerDatosUsuario {
    public static void imprimirDatosUsuario() {
        
        System.out.println("\nPunto 4:");
        
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine().trim());

        // Mostrar los datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
