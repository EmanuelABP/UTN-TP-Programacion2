package Punto4; // Trabaja con el paquete Punto4

public class TarjetaDeCredito { // Crea la clase pública TarjetaDeCredito
    private String numero; // Crea la variable privada de tipo String llamada numero
    private String fechaVencimiento; // Crea la variable privada de tipo String llamada fechaVencimiento
    private Cliente cliente; // Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
    private Banco banco; // Agregación: TarjetaDeCrédito → Banco

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) { // Constructor público de TarjetaDeCredito
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente; // Relación bidireccional: Tarjeta conoce a Cliente
        cliente.setTarjeta(this); // Establece la relación bidireccional en Cliente
        this.banco = banco; // Relación de agregación: Tarjeta tiene un Banco
    }

    public String getNumero() { // Método público para obtener el número
        return numero;
    }

    public void setNumero(String numero) { // Método público para establecer el número
        this.numero = numero;
    }

    public String getFechaVencimiento() { // Método público para obtener la fecha de vencimiento
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) { // Método público para establecer la fecha de vencimiento
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() { // Método público para obtener el cliente
        return cliente;
    }

    public void setCliente(Cliente cliente) { // Método público para establecer el cliente
        this.cliente = cliente;
    }

    public Banco getBanco() { // Método público para obtener el banco
        return banco;
    }

    public void setBanco(Banco banco) { // Método público para establecer el banco
        this.banco = banco;
    }
}
