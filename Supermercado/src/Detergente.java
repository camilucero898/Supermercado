public class Detergente {
        private String marca;
        private double precio;
        public double volumen;
        public String tipoEnvase;
        public Detergente(String marca, double precio, double volumen, String tipoEnvase) {
            this.marca = marca;
            this.precio = precio;
            this.volumen = volumen;
            this.tipoEnvase = tipoEnvase;
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

        public double getVolumen(){

            return volumen;
        }

        public void setVolumen(){

            this.volumen = volumen;
        }

        public String getTipoEnvase(){

            return tipoEnvase;
        }

        public void setTipoEnvase(){

            this.tipoEnvase = tipoEnvase;
        }

    @Override
        public String toString() {
            return "Marca: " + marca + ", Precio: " + volumen + ", volumen: " + tipoEnvase + ", tipoEnvase";
        }
}