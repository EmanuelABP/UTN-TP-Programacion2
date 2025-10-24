package Punto3; // Paquete Punto3

public class EmpleadoTemporal extends Empleado { // EmpleadoTemporal hereda de Empleado
    private double pagoPorHora; // Atributo privado para el pago por hora
    private int horasTrabajadas; // Atributo privado para la cantidad de horas trabajadas

    public EmpleadoTemporal(String nombre, double pagoPorHora, int horasTrabajadas) { // Constructor
        super(nombre); // Llama al constructor de la superclase
        this.pagoPorHora = pagoPorHora; // Inicializa pago por hora
        this.horasTrabajadas = horasTrabajadas; // Inicializa horas trabajadas
    }

    @Override // Sobrescribe el método abstracto calcularSueldo()
    public double calcularSueldo() {
        return pagoPorHora * horasTrabajadas; // Calcula el sueldo temporal
    }
}
