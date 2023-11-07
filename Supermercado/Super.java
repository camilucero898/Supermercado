import java.time.LocalDate;

interface EsLiquido {
    void setVolumen(double v);
    double getVolumen();
    void setTipoEnvase(String env);
    String getTipoEnvase();
}

interface EsAlimento {
    void setCaducidad(LocalDate fc);
    LocalDate getCaducidad();
    int getCalorias();
}

interface ConDescuento {
    void setDescuento(double des);
    double getDescuento();
    double getPrecioDescuento();
}

class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    } 

    public void setVolumen(double v) {
        this.volumen = v;
    }

    public double getVolumen() {
        return volumen;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public double getDescuento() {
        return descuento;
    }
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}