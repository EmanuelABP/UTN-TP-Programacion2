package Punto5; // Trabaja con el paquete Punto5

public class Computadora { // Crea la clase pública Computadora
    private String marca; // Crea la variable privada de tipo String llamada marca
    private String numeroSerie; // Crea la variable privada de tipo String llamada numeroSerie
    private PlacaMadre placaMadre; // Composición: Computadora → PlacaMadre (la PlacaMadre depende de la Computadora)
    private Propietario propietario; // Asociación bidireccional: Computadora ↔ Propietario

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset, Propietario propietario) { 
        // Constructor público de la clase Computadora
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset); // Crea una nueva PlacaMadre dentro de la Computadora (composición)
        this.propietario = propietario; // Asigna el propietario
        propietario.setComputadora(this); // Establece la relación bidireccional con el Propietario
    }

    public String getMarca() { // Método público para obtener la marca
        return marca;
    }

    public void setMarca(String marca) { // Método público para establecer la marca
        this.marca = marca;
    }

    public String getNumeroSerie() { // Método público para obtener el número de serie
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) { // Método público para establecer el número de serie
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() { // Método público para obtener la PlacaMadre
        return placaMadre;
    }

    public Propietario getPropietario() { // Método público para obtener el propietario
        return propietario;
    }

    public void setPropietario(Propietario propietario) { // Método público para establecer el propietario
        this.propietario = propietario;
    }
}
