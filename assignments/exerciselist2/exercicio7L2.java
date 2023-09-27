import java.util.Scanner;

public class exercicio7L2 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        double precoCusto;

        System.out.println("Informe o preço de custo do produto: ");
        precoCusto = in.nextDouble();

        if (precoCusto < 10) {
           System.out.println("O lucro será de 70%");
        } else if (precoCusto > 10 && precoCusto < 30) {
            System.out.println("O lucro será de 50%");
        } else if (precoCusto > 30 && precoCusto < 50) {
            System.out.println("O lucro será de 40%");
        } else if (precoCusto > 50) {
        System.out.println("O lucro será de 30%");
        }
        in.close();
    }
}
