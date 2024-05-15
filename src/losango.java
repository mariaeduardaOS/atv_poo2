public class Losango {
    private double lado;
    private double diagonal_maior;
    private double diagonal_menor;


    public Losango(String nome, double lado, double diagonal_maior, double diagonal_menor) {
        super();
        this.lado = lado;
        this.diagonal_maior = diagonal_maior;
        this.diagonal_menor = diagonal_menor;
    }

    public double calcArea() {
        return (diagonal_menor * diagonal_maior) /2;
    }

    public double calcPerimetro() {
        return 4 * lado;
    }
}
