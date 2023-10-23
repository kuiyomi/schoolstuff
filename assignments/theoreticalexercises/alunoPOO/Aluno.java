public class Aluno {
    private double p1, p2, p3, me, frq, g2;
    private int mat;
    private String nome;

    public Aluno() {
        p1 = 0;
        p2 = 0;
        p3 = 0;
        me = 0;
        g2 = 0;
        frq = 0;
        mat = 0;
        nome = "";
    }

    public double getP1() {
        return p1;
    }
    
    public double getP2() {
        return p2;
    }
    
    public double getP3() {
        return p3;
    }

    public double getME() {
        return me;
    }

    public double getG2() {
        return g2;
    }

    public double getFrq() {
        return frq;
    }

    public int getMat() {
        return mat;
    }

    public String getNome() {
        return nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public void setME(double me) {
        this.me = me;
    }

    public void setG2(double g2) {
        this.g2 = g2;
    }

    public void setFrq(double frq) {
        this.frq = frq;
    }

    public double calculaG1() {
        return (p1 + p2 + p3 + me) / 4;
    }

    public double calculaG2() {
        return (calculaG1() + g2) / 2;
    }

    public String showG1() {
        if (calculaG1() >= 7 && frq >= 75)
            return "Aluno aprovado";
        else if (calculaG1() < 7 && frq >= 75)
            return "Aluno em G2";
        else 
            return "Aluno reprovado";
    }

    public String showG2() {
        if (calculaG2() >= 5)
            return "Aluno aprovado";
        else 
            return "Aluno reprovado";
    }
}
