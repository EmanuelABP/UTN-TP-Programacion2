package Parte2; // Pertenece al paquete Parte2

// Clase de excepción personalizada para edades inválidas
public class EdadInvalidaException extends Exception {

    // Constructor que recibe mensaje de error
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // Llama al constructor de Exception
    }
}
