public abstract class Shape {
    protected String nome;

    public Shape(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcArea();

    public abstract double calcPerimetro();
}
