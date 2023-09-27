import java.util.Scanner;

public class exercicio6L2 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        double saldoM;

        System.out.println("Informe o saldo médio da conta: ");
        saldoM = in.nextDouble();

        if (saldoM < 500) {
            System.out.println("Não há limite disponível");
        } else {
        if (saldoM == 500 || saldoM < 1000) {
            System.out.println("O seu limite disponível é de: R$" + (saldoM * 0.08));
        } else {
            System.out.println("O seu limite disponível é de: R$" + (saldoM * 0.15));
        }   }

        in.close();
    }
}
