public class Circulo {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    public double getRadio() {
        return radio;
    }
}