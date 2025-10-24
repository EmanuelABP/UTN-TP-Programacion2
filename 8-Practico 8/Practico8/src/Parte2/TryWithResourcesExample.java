package Parte2; // Pertenece al paquete Parte2

import java.io.*; // Para FileReader, BufferedReader, IOException

// Clase para demostrar try-with-resources
public class TryWithResourcesExample {
    public static void main(String[] args) {
        String filePath = "archivo.txt"; // Archivo a leer

        // El recurso BufferedReader se cierra automáticamente al finalizar el bloque
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Imprime cada línea del archivo
            }
        } catch (IOException e) { // Captura errores de lectura
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
