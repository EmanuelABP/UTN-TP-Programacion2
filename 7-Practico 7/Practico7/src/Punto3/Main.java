package Punto3; // Paquete Punto3

public class Main { // Clase principal

    public static void main(String[] args) {
        // Creamos un array de empleados usando polimorfismo
        Empleado[] empleados = new Empleado[3]; // Array de Empleado que puede contener cualquier subclase
        empleados[0] = new EmpleadoPlanta("Ana", 50000); // Empleado de planta
        empleados[1] = new EmpleadoTemporal("Luis", 2000, 15); // Empleado temporal
        empleados[2] = new EmpleadoPlanta("Marta", 60000); // Otro empleado de planta

        // Recorremos el array y mostramos el sueldo de cada empleado
        for (Empleado e : empleados) { // Polimorfismo: e puede ser EmpleadoPlanta o EmpleadoTemporal
            System.out.print(e.getNombre() + " - Sueldo: " + e.calcularSueldo());

            // Clasificamos el tipo de empleado usando instanceof
            if (e instanceof EmpleadoPlanta) { 
                System.out.println(" (Empleado de Planta)");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" (Empleado Temporal)");
            }
        }
    }
}
