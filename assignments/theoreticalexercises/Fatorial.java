import java.util.Scanner;

public class Fatorial {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("Informe um número inteiro positivo: ");
            num = in.nextInt();
        } while (num <= 0);

        int con = calcFatorial(num);
        System.out.println("O fatorial de " + num + " é " + con);

        in.close();
    }
    public static int calcFatorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * calcFatorial(num - 1);
    }
}
