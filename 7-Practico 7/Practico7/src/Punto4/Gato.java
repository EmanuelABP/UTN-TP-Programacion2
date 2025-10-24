package Punto4; // Paquete Punto4

public class Gato extends Animal { // Gato hereda de Animal

    public Gato(String nombre) { // Constructor de Gato
        super(nombre); // Llama al constructor de Animal
    }

    @Override // Sobrescribe el método hacerSonido()
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}
