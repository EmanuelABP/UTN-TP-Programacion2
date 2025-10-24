package Punto12; // Trabaja con el paquete Punto12

public class Calculadora { // Crea la clase pública Calculadora

    public void calcular(Impuesto impuesto) { // Dependencia de uso: Calculadora usa Impuesto como parámetro
        // Aquí se podría implementar la lógica de cálculo según el impuesto
        System.out.println("Calculando impuesto de: $" + impuesto.getMonto() 
                           + " para el contribuyente " + impuesto.getContribuyente().getNombre());
    }
}
