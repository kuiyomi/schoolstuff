public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo() {
        base = 0;
        altura = 0;
    }
  
    public double getBase(){
        return base;
    }
  
    public double getAltura(){
        return altura;
    }
  
    public void setBase(double base){
        this.base = base;
    }
  
    public void setAltura(double altura){
        this.altura = altura;
    }
  
    public double calculaArea(){
        double area = base*altura;
        return area;
    }
  
    public double calculaPerimetro(){
        double perimetro = 2*base + 2*altura;
        return perimetro;
    } 
  
    public double calculaDiagonal(){
        double diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
        return diagonal;
    }
  
    public String toString(){
        return "A área é: " +calculaArea() +". O perímetro é: " + calculaPerimetro() + ". A diagonal é: " + calculaDiagonal() + ".";
    }
}
