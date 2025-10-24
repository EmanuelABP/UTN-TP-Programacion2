package Punto12; // Trabaja con el paquete Punto12

public class Contribuyente { // Crea la clase pública Contribuyente
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String cuil; // Crea la variable privada de tipo String llamada cuil

    public Contribuyente(String nombre, String cuil) { // Constructor público
        this.nombre = nombre; // Asigna el valor del parámetro nombre
        this.cuil = cuil; // Asigna el valor del parámetro cuil
    }

    public String getNombre() { // Método para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método para establecer el nombre
        this.nombre = nombre;
    }

    public String getCuil() { // Método para obtener el cuil
        return cuil;
    }

    public void setCuil(String cuil) { // Método para establecer el cuil
        this.cuil = cuil;
    }
}
