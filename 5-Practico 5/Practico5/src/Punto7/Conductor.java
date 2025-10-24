package Punto7; // Trabaja con el paquete Punto7

public class Conductor { // Crea la clase pública Conductor
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String licencia; // Crea la variable privada de tipo String llamada licencia
    private Vehiculo vehiculo; // Asociación bidireccional: Conductor ↔ Vehículo

    public Conductor(String nombre, String licencia) { // Constructor público de la clase Conductor
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getLicencia() { // Método público para obtener la licencia
        return licencia;
    }

    public void setLicencia(String licencia) { // Método público para establecer la licencia
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() { // Método público para obtener el vehículo asociado
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) { // Método público para establecer el vehículo asociado
        this.vehiculo = vehiculo;
    }
}
