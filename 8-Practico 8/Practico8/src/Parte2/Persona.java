package Parte2; // Pertenece al paquete Parte2

// Clase Persona que valida la edad usando EdadInvalidaException
public class Persona {
    private String nombre;
    private int edad;

    // Constructor que lanza EdadInvalidaException si la edad es inválida
    public Persona(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) { // Condición de edad inválida
            throw new EdadInvalidaException("Edad fuera de rango: " + edad);
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    // Método main para probar la excepción
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Ana", 30); // Edad válida
            System.out.println(p1.getNombre() + " tiene " + p1.getEdad() + " años.");

            Persona p2 = new Persona("Luis", -5); // Edad inválida
            System.out.println(p2.getNombre() + " tiene " + p2.getEdad() + " años.");
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
