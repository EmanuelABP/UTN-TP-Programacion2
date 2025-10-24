package Parte2; // Pertenece al paquete Parte2

import java.io.*; // Para FileReader, BufferedReader, IOException

// Clase para leer un archivo de texto
public class LecturaArchivo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { // Lee línea por línea
                System.out.println(line);
            }
        } catch (FileNotFoundException e) { // Si el archivo no existe
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) { // Otros errores de lectura
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
