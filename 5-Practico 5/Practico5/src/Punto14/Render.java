package Punto14; // Trabaja con el paquete Punto14

public class Render { // Crea la clase pública Render
    private String formato; // Crea la variable privada de tipo String llamada formato
    private Proyecto proyecto; // Asociación unidireccional: Render → Proyecto

    public Render(String formato, Proyecto proyecto) { // Constructor público
        this.formato = formato; // Asigna el valor del parámetro formato
        this.proyecto = proyecto; // Asocia el proyecto al Render
    }

    public String getFormato() { // Método para obtener el formato del render
        return formato;
    }

    public void setFormato(String formato) { // Método para establecer el formato del render
        this.formato = formato;
    }

    public Proyecto getProyecto() { // Método para obtener el proyecto asociado
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) { // Método para establecer el proyecto asociado
        this.proyecto = proyecto;
    }
}
