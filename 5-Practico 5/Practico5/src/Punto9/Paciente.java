package Punto9; // Trabaja con el paquete Punto9

public class Paciente { // Crea la clase pública Paciente
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String obraSocial; // Crea la variable privada de tipo String llamada obraSocial

    public Paciente(String nombre, String obraSocial) { // Constructor público de la clase Paciente
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { // Método público para obtener el nombre del paciente
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre del paciente
        this.nombre = nombre;
    }

    public String getObraSocial() { // Método público para obtener la obra social del paciente
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) { // Método público para establecer la obra social del paciente
        this.obraSocial = obraSocial;
    }
}
