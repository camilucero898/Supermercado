public class Cereales {
        private String marca;
        private double precio;
        private String tipoDeCereal;

    public void Cereal (String marca, double precio, String tipoDeCereal ) {
        this.marca = marca;
        this. precio = precio;
        this.tipoDeCereal = tipoDeCereal;
    }

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

    public String getTipoDeCereal (){
        return tipoDeCereal;
    }

    public void setTipoDeCereal(){

        this.tipoDeCereal = tipoDeCereal;
    }

    public static int calorias(String cereal) {
        switch (cereal) {
            case "espelta":
                return 5;
            case "maíz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }
    public String toString() {
        return "Marca: " + marca + ", Precio: " + precio + ", Tipo de Cereal: " + tipoDeCereal;
    }

}


