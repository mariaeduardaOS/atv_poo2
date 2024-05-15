public class Retangulo extends Shape {
    private double ladoA;
    private double ladoB;

    public Retangulo(String nome, double ladoA, double ladoB) {
        super(nome);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcArea() {
        return ladoA * ladoB;
    }

    @Override
    public double calcPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
