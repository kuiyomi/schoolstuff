public class Quadrado {
    
    private double lado;
    private String cor;

    public Quadrado () {
        lado = 0;
        cor = " ";
    }

    public double getLado () {
        return lado;
    }

    public String getCor () {
        return cor;
    }

    public void setLado (double novoLado) {
        lado = novoLado;
    }
    public void setCor (String novaCor) {
        cor = novaCor;
    }
    public double calculaArea() {
        return lado * lado;
    }
    public double calculaPerimetro() {
        return lado * 4;
    }
}
