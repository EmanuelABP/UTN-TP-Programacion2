package Punto10; // Trabaja con el paquete Punto10

public class CuentaBancaria { // Crea la clase pública CuentaBancaria
    private String cbu; // Crea la variable privada de tipo String llamada cbu
    private double saldo; // Crea la variable privada de tipo double llamada saldo

    private ClaveSeguridad clave; // Composición: CuentaBancaria → ClaveSeguridad
    private Titular titular; // Asociación bidireccional: CuentaBancaria ↔ Titular

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) { // Constructor público
        this.cbu = cbu; // Asigna el valor del parámetro cbu
        this.saldo = saldo; // Asigna el valor del parámetro saldo
        this.clave = clave; // Asigna el objeto ClaveSeguridad (composición)
        this.titular = titular; // Asocia el titular (bidireccional)
        this.titular.setCuenta(this); // Actualiza la referencia en Titular para mantener la bidireccionalidad
    }

    public String getCbu() { // Método para obtener el cbu
        return cbu;
    }

    public void setCbu(String cbu) { // Método para establecer el cbu
        this.cbu = cbu;
    }

    public double getSaldo() { // Método para obtener el saldo
        return saldo;
    }

    public void setSaldo(double saldo) { // Método para establecer el saldo
        this.saldo = saldo;
    }

    public ClaveSeguridad getClave() { // Método para obtener la clave de seguridad
        return clave;
    }

    public void setClave(ClaveSeguridad clave) { // Método para establecer la clave de seguridad
        this.clave = clave;
    }

    public Titular getTitular() { // Método para obtener el titular
        return titular;
    }

    public void setTitular(Titular titular) { // Método para establecer el titular
        this.titular = titular;
        this.titular.setCuenta(this); // Mantiene la asociación bidireccional
    }
}
