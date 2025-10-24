package Punto10; // Trabaja con el paquete Punto10

public class Titular { // Crea la clase pública Titular
    private String nombre; // Crea la variable privada de tipo String llamada nombre
    private String dni; // Crea la variable privada de tipo String llamada dni

    private CuentaBancaria cuenta; // Asociación bidireccional: Titular ↔ CuentaBancaria

    public Titular(String nombre, String dni) { // Constructor público de la clase Titular
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre
        this.dni = dni; // Asigna el valor del parámetro dni al atributo dni
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

    public CuentaBancaria getCuenta() { // Método para obtener la cuenta asociada
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) { // Método para establecer la cuenta asociada
        this.cuenta = cuenta;
    }
}
