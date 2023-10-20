public class esfera
{
    private double raio;
        
    public Esfera(){
        raio = 0;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double novoRaio){
        raio = novoRaio;
    }
    
    public double calculaVolume(){
        double volume = 4/3*Math.PI*Math.pow(raio,3);
        return volume;        
    }
    
    public double calculaArea(){
        double area = 4*Math.PI * Math.pow(raio,2);
        return area;
    }
    
    
    public String toString(){
        return "\nO raio da esfera é: "+ getRaio() + "\nArea: "+ calculaArea() + "\nVolume: "+ calculaVolume();
    }
}
