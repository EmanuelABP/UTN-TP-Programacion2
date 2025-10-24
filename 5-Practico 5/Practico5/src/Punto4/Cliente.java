package Punto4; // Trabaja con el paquete Punto4

public class Cliente { // Crea la clase pública Cliente
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String dni; // Crea la variable privada de tipo String llamada dni
    private TarjetaDeCredito tarjeta; // Asociación bidireccional: Cliente ↔ TarjetaDeCrédito

    public Cliente(String nombre, String dni) { // Constructor público de Cliente
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { // Método público para obtener el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre
        this.nombre = nombre;
    }

    public String getDni() { // Método público para obtener el dni
        return dni;
    }

    public void setDni(String dni) { // Método público para establecer el dni
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjeta() { // Método público para obtener la tarjeta
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) { // Método público para establecer la tarjeta
        this.tarjeta = tarjeta;
    }
}
