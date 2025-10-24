package Punto3; // Paquete Punto3

public class EmpleadoPlanta extends Empleado { // EmpleadoPlanta hereda de Empleado
    private double sueldoMensual; // Atributo privado para el sueldo fijo mensual

    public EmpleadoPlanta(String nombre, double sueldoMensual) { // Constructor
        super(nombre); // Llama al constructor de la superclase
        this.sueldoMensual = sueldoMensual; // Inicializa el sueldo mensual
    }

    @Override // Sobrescribe el método abstracto calcularSueldo()
    public double calcularSueldo() {
        return sueldoMensual; // Retorna el sueldo mensual fijo
    }
}
