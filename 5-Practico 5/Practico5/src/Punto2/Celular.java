package Punto2; // Trabaja con el paquete Punto2

public class Celular { // Crea la clase pública Celular
    private String imei; // Crea la variable privada de tipo String llamada imei
    private String marca; // Crea la variable privada de tipo String llamada marca
    private String modelo; // Crea la variable privada de tipo String llamada modelo
    private Bateria bateria; // Agregación: Celular → Bateria
    private Usuario usuario; // Asociación bidireccional: Celular ↔ Usuario

    public Celular(String imei, String marca, String modelo, Bateria bateria) { // Constructor público de la clase Celular
        this.imei = imei; // Inicializa el atributo imei
        this.marca = marca; // Inicializa el atributo marca
        this.modelo = modelo; // Inicializa el atributo modelo
        this.bateria = bateria; // Inicializa la batería (agregación)
    }

    public String getImei() { // Método público para obtener el imei
        return imei;
    }

    public void setImei(String imei) { // Método público para asignar el imei
        this.imei = imei;
    }

    public String getMarca() { // Método público para obtener la marca
        return marca;
    }

    public void setMarca(String marca) { // Método público para asignar la marca
        this.marca = marca;
    }

    public String getModelo() { // Método público para obtener el modelo
        return modelo;
    }

    public void setModelo(String modelo) { // Método público para asignar el modelo
        this.modelo = modelo;
    }

    public Bateria getBateria() { // Método público para obtener la batería
        return bateria;
    }

    public void setBateria(Bateria bateria) { // Método público para asignar la batería
        this.bateria = bateria;
    }

    public Usuario getUsuario() { // Método público para obtener el usuario (bidireccional)
        return usuario;
    }

    public void setUsuario(Usuario usuario) { // Método público para asignar el usuario (bidireccional)
        this.usuario = usuario;
        if (usuario.getCelular() != this) { // Mantener la asociación bidireccional
            usuario.setCelular(this);
        }
    }
}
