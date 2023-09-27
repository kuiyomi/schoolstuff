import java.util.Scanner;

public class exercicio9L3 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        int a, b, B=0, S=0, sP=0;

        do {
            System.out.println("Informe o primeiro valor positivo inteiro: ");
            a = in.nextInt();
        } while (a < 0);

        do {
            System.out.println("Informe o segundo valor positivo inteiro: ");
            b = in.nextInt();
        } while (b < 0);

        if (a > b) {
            B = a;
            S = b;
        } else if (b > a) {
            B = b;
            S = a;
        }

        for (int s=S; s<=B; s++) {
            if (s % 2 == 0) {
                sP = sP + s;
            }
        }
        System.out.println("A soma dos pares entre os valores inseridos é: " +sP);

        in.close();
    }
}
