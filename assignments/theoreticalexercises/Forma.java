public class Forma {

    private String nome;
    private String cor;
    private double lado;
    private double area;

    public Forma(String nome, String cor, double lado, double area) {
        this.nome = nome;
        this.cor = cor;
        this.lado = lado;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "Nome: " + nome  + "\nCor: " + cor + "\nLado: " + lado + "\nArea: " + area;
    }
}
