package Punto4; // Paquete Punto4

public class Perro extends Animal { // Perro hereda de Animal

    public Perro(String nombre) { // Constructor de Perro
        super(nombre); // Llama al constructor de Animal
    }

    @Override // Sobrescribe el método hacerSonido()
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }
}
