import java.util.Scanner;

public class appQuadrado {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        double lado;
        String cor;
        
        Quadrado quad1 = new Quadrado();
        System.out.println("O lado do quadrado é " + quad1.getLado());

        System.out.println("Informe o valor do novo lado: ");
        lado = in.nextDouble();
        quad1.setLado(lado);
        System.out.println("Agora, o lado do quadrado é " + quad1.getLado());

        System.out.println("Informe a nova cor para o quadrado: ");
        in.nextLine();
        cor = in.nextLine();
        quad1.setCor(cor);
        System.out.println("A cor do quadrado é " + quad1.getCor());

        System.out.println("A área do quadrado é " + quad1.calculaArea());
        System.out.println("O perímetro do quadrado é " + quad1.calculaPerimetro());

        System.out.println("quad1.toString()");
    }
}
