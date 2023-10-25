public class Aluno {
    private double p1,p2,p3,me,g2;
    private int frequencia=0;
    
    
    public Aluno(){
        p1=0;
        p2=0;
        p3=0;
        me=0;
        frequencia=0;
        g2=0;
    }
    
    public void setP1(double novaP1){
        p1 = novaP1;
    }
    
    public double getP1(){return p1;
    }
    
    public void setP2(double novaP2){
        p2 = novaP2;
    }
    
    public double getP2(){return p2;
    }
    
    public void setP3(double novaP3){
        p3 = novaP3;
    }
    
    public double getP3(){return p3;
    }
    
    public void setMe(double novaMe){
        me = novaMe;
    }
    
    public double getMe(){return me;
    }
    
    public void setFrequencia(int novaFrequencia){
        frequencia = novaFrequencia;
    }
    
    public void setG2(double novaG2){
        g2 = novaG2;;
    }
    
    public double calculaG1(){
        return (p1+p2+p3+me)/4;
    }
    
    public double calculaG2(){
        return (calculaG1()+g2)/2;
    }
    
    public String mostraResultadoG1(){
        if (calculaG1()>=7 && frequencia>=75) return "Aprovado em G1";
        else if (calculaG1()>=4 && frequencia>=75) return "Em g2";
        else
            return "Reprovado";
    }
    
    public String mostraResultadoG2(){
        if (calculaG2()>=5  && frequencia>=75) return "Aprovado em G2";
        else
            return "Reprovado";
    }
    
    public String toString(){
        return "Resultado do G1:"+ calculaG1() + "\nResultado do G2:" + mostraResultadoG2();
    }
}
