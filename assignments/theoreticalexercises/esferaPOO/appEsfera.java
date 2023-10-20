import java.util.Scanner;

public class AppEsfera
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Esfera  esfera1 = new Esfera();
        System.out.println("Digite um novo raio:");
        double raio = in.nextDouble();
        esfera1.setRaio(raio);
        System.out.println(esfera1.getRaio());
        System.out.println(esfera1.toString());
        
    }
}
