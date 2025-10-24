package Punto7; // Trabaja con el paquete Punto7

public class Vehiculo { // Crea la clase pública Vehiculo
    private String patente; // Crea la variable privada de tipo String llamada patente
    private String modelo; // Crea la variable privada de tipo String llamada modelo
    private Motor motor; // Agregación: Vehículo → Motor (el Motor puede existir independientemente)
    private Conductor conductor; // Asociación bidireccional: Vehículo ↔ Conductor

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) { 
        // Constructor público de la clase Vehiculo con sus relaciones
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Se establece la relación de agregación con Motor
        this.conductor = conductor; // Se establece la relación bidireccional con Conductor
        conductor.setVehiculo(this); // Vincula al Conductor con este Vehículo (bidireccional)
    }

    public String getPatente() { // Método público para obtener la patente
        return patente;
    }

    public void setPatente(String patente) { // Método público para establecer la patente
        this.patente = patente;
    }

    public String getModelo() { // Método público para obtener el modelo
        return modelo;
    }

    public void setModelo(String modelo) { // Método público para establecer el modelo
        this.modelo = modelo;
    }

    public Motor getMotor() { // Método público para obtener el motor asociado
        return motor;
    }

    public void setMotor(Motor motor) { // Método público para establecer el motor asociado
        this.motor = motor;
    }

    public Conductor getConductor() { // Método público para obtener el conductor asociado
        return conductor;
    }

    public void setConductor(Conductor conductor) { // Método público para establecer el conductor asociado
        this.conductor = conductor;
    }
}
