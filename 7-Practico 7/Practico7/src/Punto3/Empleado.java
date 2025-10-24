package Punto3; // Paquete Punto3

public abstract class Empleado { // Clase abstracta Empleado
    private String nombre; // Atributo privado para el nombre del empleado

    public Empleado(String nombre) { // Constructor de Empleado
        this.nombre = nombre; // Inicializa el nombre
    }

    public String getNombre() { // Getter para obtener el nombre
        return nombre;
    }

    public abstract double calcularSueldo(); // Método abstracto que cada subclase debe implementar
}
