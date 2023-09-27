import java.util.Scanner;

public class exercicioBanco {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        double saldoInicial, saldoFinal, valor;
        int opcao;

        System.out.println("Informe o saldo inicial da conta: ");
        saldoInicial = in.nextDouble();

        System.out.println("Digite 1 para exibir o saldo");
        System.out.println("Digite 2 para sacar um valor");
        System.out.println("Digite 3 para depositar um valor");
        opcao = in.nextInt();

        switch (opcao) {
            case 1 : 
                System.out.println("O saldo da conta é " + saldoInicial);
                break;
            case 2 :
                System.out.println("Informe o valor a ser sacado: ");
                valor = in.nextDouble();
                    if (valor <= saldoInicial) {
                        saldoFinal = saldoInicial - valor;
                        System.out.println("O saldo atual da conta é: " + saldoFinal);
                    } else
                        System.out.println("Saldo insuficiente para o saque");
                break;
            case 3 :
                System.out.println("Informe o valor a ser depositado: ");
                valor = in.nextDouble();
                if (valor>0) {
                    saldoFinal = saldoInicial + valor;
                    System.out.println("O saldo atual da conta é: " + saldoFinal);
                } else
                    System.out.println("O valor inserido é invalido");
                break;
            default: 
                System.out.println("Opção inválida");
        }
        in.close();
    }
}
