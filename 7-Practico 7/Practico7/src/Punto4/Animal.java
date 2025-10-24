package Punto4; // Paquete Punto4

public class Animal { // Clase base Animal
    private String nombre; // Atributo privado para el nombre del animal

    public Animal(String nombre) { // Constructor de Animal
        this.nombre = nombre; // Inicializa el nombre
    }

    public String getNombre() { // Getter para obtener el nombre
        return nombre;
    }

    public void hacerSonido() { // Método base que puede ser sobrescrito
        System.out.println("Sonido genérico de animal");
    }

    public void describirAnimal() { // Método concreto para describir al animal
        System.out.println("Soy un animal llamado " + nombre);
    }
}
