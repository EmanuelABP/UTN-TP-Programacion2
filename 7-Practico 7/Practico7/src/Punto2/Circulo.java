package Punto2; // Paquete Punto2

public class Circulo extends Figura { // Circulo hereda de Figura
    private double radio; // Atributo privado para el radio del círculo

    public Circulo(String nombre, double radio) { // Constructor de Circulo
        super(nombre); // Llama al constructor de la superclase Figura
        this.radio = radio; // Inicializa el radio del círculo
    }

    @Override // Sobrescribe el método abstracto calcularArea()
    public double calcularArea() {
        return Math.PI * radio * radio; // Calcula y retorna el área del círculo
    }
}
