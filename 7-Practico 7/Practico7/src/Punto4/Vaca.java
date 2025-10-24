package Punto4; // Paquete Punto4

public class Vaca extends Animal { // Vaca hereda de Animal

    public Vaca(String nombre) { // Constructor de Vaca
        super(nombre); // Llama al constructor de Animal
    }

    @Override // Sobrescribe el método hacerSonido()
    public void hacerSonido() {
        System.out.println("¡Muuu!");
    }
}
