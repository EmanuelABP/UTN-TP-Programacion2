package practico4; // Se define el paquete donde está guardada la clase
// Clase de prueba con metodo main
public class Main {

    public static void main(String[] args) {

        // Creacion de objetos usando constructor con todos los parametros
        Empleado e1 = new Empleado(1001, "Ana Perez", "Administrativa", 35000);
        Empleado e2 = new Empleado(1002, "Luis Gomez", "Programador", 50000);

        // Creacion de objetos usando constructor con nombre y puesto solo
        Empleado e3 = new Empleado("Carla Ruiz", "Analista");
        Empleado e4 = new Empleado("Pedro Diaz", "Disenador");

        // Aplicando actualizacion de salario por porcentaje
        e2.actualizarSalario(10); // Aumenta 10% del salario de e2

        // Aplicando actualizacion de salario con cantidad fija
        e3.actualizarSalario(5000, true); // Aumenta $5000 a e3

        // Imprimir informacion de cada empleado
        System.out.println(e1); // Muestra datos de e1
        System.out.println(e2); // Muestra datos de e2
        System.out.println(e3); // Muestra datos de e3
        System.out.println(e4); // Muestra datos de e4

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados()); // Muestra total de empleados
    }
}
