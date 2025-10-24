package Punto4; // Paquete Punto4

public class Main { // Clase principal

    public static void main(String[] args) {
        // Creamos un array de animales usando polimorfismo
        Animal[] animales = new Animal[3]; // Array de Animal que puede contener cualquier subclase
        animales[0] = new Perro("Fido"); // Asignamos un Perro
        animales[1] = new Gato("Michi"); // Asignamos un Gato
        animales[2] = new Vaca("Lola"); // Asignamos una Vaca

        // Recorremos el array y mostramos los sonidos de cada animal
        for (Animal a : animales) { // Polimorfismo: a puede ser Perro, Gato o Vaca
            a.describirAnimal(); // Llama al método describirAnimal() de la clase base
            a.hacerSonido(); // Llama al método sobrescrito correspondiente a cada subclase
        }
    }
}
