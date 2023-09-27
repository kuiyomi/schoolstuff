import java.util.Scanner;

public class exercicio5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double n;

        System.out.println("Informe um numero qualquer: ");
        n = in.nextDouble();

        System.out.println("O numero ao quadrado é: " + Math.pow(n, 2));

        System.out.println("O numero ao cubo é: " + Math.pow(n, 3));

        System.out.println("O numero na potencia de 4 é: " + Math.pow(n, 4));
        
        in.close();
    }
}