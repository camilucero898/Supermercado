public class Vino {

        private String marca;
        private String tipo;
        private double gradosAlcohol;
        private double precio;

        public Vino(String marca, String tipo, double gradosAlcohol, double precio) {
            this.marca = marca;
            this.tipo = tipo;
            this.gradosAlcohol = gradosAlcohol;
            this.precio = precio;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getGradosAlcohol() {
            return gradosAlcohol;
        }

        public void setGradosAlcohol(double gradosAlcohol) {
            this.gradosAlcohol = gradosAlcohol;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public double calcularCalorias() {
            return gradosAlcohol * 10;
        }


        @Override
        public String toString() {
            return "Vino [marca=" + marca + ", tipo=" + tipo + ", gradosAlcohol=" + gradosAlcohol + ", precio=" + precio + "]";
        }
        public double calcularDescuento() {
            return 0.0;
        }
}

