package Punto12; // Trabaja con el paquete Punto12

public class Impuesto { // Crea la clase pública Impuesto
    private double monto; // Crea la variable privada de tipo double llamada monto
    private Contribuyente contribuyente; // Asociación unidireccional: Impuesto → Contribuyente

    public Impuesto(double monto, Contribuyente contribuyente) { // Constructor público
        this.monto = monto; // Asigna el valor del parámetro monto
        this.contribuyente = contribuyente; // Asigna el contribuyente asociado
    }

    public double getMonto() { // Método para obtener el monto
        return monto;
    }

    public void setMonto(double monto) { // Método para establecer el monto
        this.monto = monto;
    }

    public Contribuyente getContribuyente() { // Método para obtener el contribuyente asociado
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) { // Método para establecer el contribuyente asociado
        this.contribuyente = contribuyente;
    }
}
