package Punto5; // Trabaja con el paquete Punto5

public class PlacaMadre { // Crea la clase pública PlacaMadre
    private String modelo; // Crea la variable privada de tipo String llamada modelo
    private String chipset; // Crea la variable privada de tipo String llamada chipset

    public PlacaMadre(String modelo, String chipset) { // Constructor público de la clase PlacaMadre
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() { // Método público para obtener el modelo
        return modelo;
    }

    public void setModelo(String modelo) { // Método público para establecer el modelo
        this.modelo = modelo;
    }

    public String getChipset() { // Método público para obtener el chipset
        return chipset;
    }

    public void setChipset(String chipset) { // Método público para establecer el chipset
        this.chipset = chipset;
    }
}
