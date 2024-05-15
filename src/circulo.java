public class Circulo extends Shape {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcPerimetro() {
        return 2 * Math.PI * raio;
    }
}
