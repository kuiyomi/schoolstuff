public class Atleta {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double notaPartida;
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double n5;
    private double n6;


    /**
     * Construtor para objetos da classe Atlta
     */
    public Atleta(){
        notaPartida=0;
        n1=0;
        n2=0;
        n3=0;
        n4=0;
        n5=0;
        n6=0;
    }
    
    public void setNotaPartida(double novaNota){
        notaPartida = novaNota;
    }
    
    public double getNotaPartida(){ return notaPartida;
    }
    
    public void setNota1(double novaNota){
        n1 = novaNota;
    }
    
    public double getNota1(){
        return n1;
    }
    
    public void setNota2(double novaNota){
        n2 = novaNota;
    }
    
    public double getNota2(){
        return n2;
    }
    
        public void setNota3(double novaNota){
        n3 = novaNota;
    }
    
    public double getNota3(){
        return n3;
    }
    
        public void setNota4(double novaNota){
        n4 = novaNota;
    }
    
    public double getNota4(){
        return n4;
    }
    
        public void setNota5(double novaNota){
        n5 = novaNota;
    }
    
    public double getNota5(){
        return n5;
    }
    
        public void setNota6(double novaNota){
        n6 = novaNota;
    }
    
    public double getNota6(){
        return n6;
    }
    
    public double buscaNotaMaisBaixa(){
        double baixa =10;
        if (n1<baixa)
            baixa = n1;
        if (n2<baixa)
            baixa = n2;
        if (n3<baixa)
            baixa = n3;
        if (n4<baixa)
            baixa = n4;
        if (n5<baixa)
            baixa = n5;
        if (n6<baixa)
            baixa = n6;
        return baixa;
    }
    
    public double buscaNotaMaisAlta(){
        double alta =0;
        if (n1>alta)
            alta = n1;
        if (n2>alta)
            alta = n2;
        if (n3>alta)
            alta = n3;
        if (n4>alta)
            alta = n4;
        if (n5>alta)
            alta = n5;
        if (n6>alta)
            alta = n6;
        return alta;
    }
    
    public double calculaMediaNotas(){
        double media =(n1+n2+n3+n4+n5+n6-buscaNotaMaisBaixa()-buscaNotaMaisAlta())/4;
        return media;
    }
    
    public double calculaNotaFinal(){
        return calculaMediaNotas()+notaPartida;
    }
    
    public String toString(){
        String saida = "Nota de Partida: "+ notaPartida + "\nNota1:" + n1+ "\nNota2:" + n2+ "\nNota3:" + n3;
        saida = saida + "\nNota4:" + n4+ "\nNota5:" + n5+ "\nNota6:" + n6;
        saida = saida + "\nMedia das Notas do Juiz b:" + calculaMediaNotas()+ "\nNota final:" + calculaNotaFinal();
        return saida;
    }
    
}
