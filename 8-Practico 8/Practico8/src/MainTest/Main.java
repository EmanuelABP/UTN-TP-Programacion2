package MainTest;

import Parte1.*;
import Parte2.*;
import java.io.*; // Para BufferedReader y FileReader
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PARTE 1: E-COMMERCE ===");

        // Crear cliente
        Cliente cliente = new Cliente("Juan");

        // Crear productos
        Producto prod1 = new Producto("Laptop", 1500);
        Producto prod2 = new Producto("Mouse", 50);
        Producto prod3 = new Producto("Teclado", 120);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);
        pedido.agregarProducto(prod3);

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Probar medios de pago
        TarjetaCredito tarjeta = new TarjetaCredito();
        tarjeta.procesarPago(pedido.calcularTotal());
        tarjeta.aplicarDescuento(10); // 10% de descuento

        PayPal paypal = new PayPal();
        paypal.procesarPago(pedido.calcularTotal());

        System.out.println("\n=== PARTE 2: EXCEPCIONES ===");

        Scanner scanner = new Scanner(System.in);

        // 1️⃣ División segura
        System.out.println("\n-- División Segura --");
        try {
            System.out.print("Ingrese numerador: ");
            int num = scanner.nextInt();
            System.out.print("Ingrese denominador: ");
            int den = scanner.nextInt();
            System.out.println("Resultado: " + (num / den));
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }

        scanner.nextLine(); // Limpiar buffer

        // 2️⃣ Conversión de cadena
        System.out.println("\n-- Conversión de Cadena --");
        System.out.print("Ingrese un número: ");
        String texto = scanner.nextLine();
        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }

        // 3️⃣ Lectura de archivo (archivo.txt debe existir)
        System.out.println("\n-- Lectura de Archivo --");
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }

        // 4️⃣ Excepción personalizada
        System.out.println("\n-- Excepción Personalizada --");
        try {
            Persona personaValida = new Persona("Ana", 30);
            System.out.println(personaValida.getNombre() + " tiene " + personaValida.getEdad() + " años.");

            Persona personaInvalida = new Persona("Luis", -5);
            System.out.println(personaInvalida.getNombre() + " tiene " + personaInvalida.getEdad() + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // 5️⃣ Try-with-resources
        System.out.println("\n-- Try-With-Resources --");
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        System.out.println("\n=== FIN DE LA PRUEBA ===");

        scanner.close(); // cerrar scanner
    }
}
