import java.util.Scanner;

public class AppRetangulo {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        double altura,base;
        
        Retangulo retangulo1 = new Retangulo();
        
        System.out.println("\fDigite a altura: ");
        altura = in.nextDouble();
        retangulo1.setAltura(altura);
        
        System.out.println("Digite a base: ");
        base = in.nextDouble();
        retangulo1.setBase(base);
    
        System.out.println(retangulo1.toString());
          
    }
}
