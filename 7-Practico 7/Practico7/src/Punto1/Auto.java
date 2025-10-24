package Punto1; // Se declara el paquete Punto1

public class Auto extends Vehiculo { // Se crea la subclase Auto que hereda de Vehiculo
    private int cantidadPuertas; // Variable privada para almacenar la cantidad de puertas

    public Auto(String marca, String modelo, int cantidadPuertas) { // Constructor de Auto
        super(marca, modelo); // Llama al constructor de la superclase Vehiculo para inicializar marca y modelo
        this.cantidadPuertas = cantidadPuertas; // Inicializa la cantidad de puertas específica del Auto
    }

    @Override // Indica que se está sobrescribiendo un método heredado de la superclase
    public void mostrarInfo() { 
        super.mostrarInfo(); // Llama al método mostrarInfo() de Vehiculo para mostrar marca y modelo
        System.out.println("Cantidad de puertas: " + cantidadPuertas); // Muestra la cantidad de puertas del auto
    }

    public static void main(String[] args) { // Método main para probar la clase Auto
        Auto miAuto = new Auto("Toyota", "Corolla", 4); // Crea un objeto Auto con marca, modelo y puertas
        miAuto.mostrarInfo(); // Llama al método mostrarInfo() que imprime toda la información
    }
}
