package Punto2; // Paquete Punto2

public class Rectangulo extends Figura { // Rectangulo hereda de Figura
    private double base; // Atributo privado para la base del rectángulo
    private double altura; // Atributo privado para la altura del rectángulo

    public Rectangulo(String nombre, double base, double altura) { // Constructor de Rectangulo
        super(nombre); // Llama al constructor de la superclase Figura
        this.base = base; // Inicializa la base
        this.altura = altura; // Inicializa la altura
    }

    @Override // Sobrescribe el método abstracto calcularArea()
    public double calcularArea() {
        return base * altura; // Calcula y retorna el área del rectángulo
    }
}
