package Punto9; // Trabaja con el paquete Punto9

public class Profesional { // Crea la clase pública Profesional
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String especialidad; // Crea la variable privada de tipo String llamada especialidad

    public Profesional(String nombre, String especialidad) { // Constructor público de la clase Profesional
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { // Método público para obtener el nombre del profesional
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre del profesional
        this.nombre = nombre;
    }

    public String getEspecialidad() { // Método público para obtener la especialidad del profesional
        return especialidad;
    }

    public void setEspecialidad(String especialidad) { // Método público para establecer la especialidad del profesional
        this.especialidad = especialidad;
    }
}
