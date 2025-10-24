package Punto2; // Paquete Punto2

public abstract class Figura { // Se crea la clase abstracta Figura
    private String nombre; // Atributo privado para el nombre de la figura

    public Figura(String nombre) { // Constructor de Figura que inicializa el nombre
        this.nombre = nombre; // Asigna el nombre pasado al atributo
    }

    public String getNombre() { // Getter para acceder al nombre desde otras clases
        return nombre;
    }

    public abstract double calcularArea(); // Método abstracto que debe ser implementado por las subclases
}
