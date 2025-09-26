package practico4; // Se define el paquete donde está guardada la clase
// Se define la clase Empleado
public class Empleado {

    // Atributos privados de la clase para encapsulamiento
    private int id; // Identificador unico del empleado
    private String nombre; // Nombre completo del empleado
    private String puesto; // Cargo que desempeña el empleado
    private double salario; // Salario actual del empleado

    // Atributos estaticos compartidos por todas las instancias
    private static int totalEmpleados = 0; // Contador total de empleados creados
    private static int siguienteId = 1; // Contador para asignar id automatico

    // Constructor que recibe todos los atributos como parametros
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id; // Se asigna el id pasado como parametro
        this.nombre = nombre; // Se asigna el nombre pasado como parametro
        this.puesto = puesto; // Se asigna el puesto pasado como parametro
        this.salario = salario; // Se asigna el salario pasado como parametro
        totalEmpleados++; // Incrementa el contador de empleados
    }

    // Constructor sobrecargado que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++; // Se asigna un id automatico
        this.nombre = nombre; // Se asigna el nombre pasado como parametro
        this.puesto = puesto; // Se asigna el puesto pasado como parametro
        this.salario = 30000; // Se asigna un salario por defecto
        totalEmpleados++; // Incrementa el contador de empleados
    }

    // Metodo sobrecargado actualizarSalario con porcentaje
    public void actualizarSalario(double porcentaje) {
        salario += salario * porcentaje / 100; // Aumenta salario segun porcentaje
    }

    // Metodo sobrecargado actualizarSalario con cantidad fija
    public void actualizarSalario(double cantidad, boolean esCantidadFija) {
        salario += cantidad; // Aumenta salario en cantidad fija
    }

    // Getters y setters para encapsulamiento de atributos
    public int getId() {
        return id; // Retorna el id del empleado
    }

    public void setId(int id) {
        this.id = id; // Asigna un nuevo id al empleado
    }

    public String getNombre() {
        return nombre; // Retorna el nombre del empleado
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo nombre al empleado
    }

    public String getPuesto() {
        return puesto; // Retorna el puesto del empleado
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto; // Asigna un nuevo puesto al empleado
    }

    public double getSalario() {
        return salario; // Retorna el salario del empleado
    }

    public void setSalario(double salario) {
        this.salario = salario; // Asigna un nuevo salario al empleado
    }

    // Metodo toString para mostrar informacion legible del empleado
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }

    // Metodo estatico para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados; // Retorna el total de empleados
    }
}
