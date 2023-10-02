import java.util.Scanner;

public class Banco {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int opcao;
        double saldo;
        saldo = validaEntrada();
        
        do{
            menu();
            opcao= in.nextInt();
            switch (opcao) {
                case 1: 
                    saldo = sacar(saldo);
                    break;
                case 2: 
                    saldo = depositar(saldo); 
                    break;
                default:
                    System.out.println("Opção inválida"); 
                    break;                
            }
        } while (opcao!=10);
        in.close();
    }
    public static void menu() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("10 - Sair");
    }
    public static double validaEntrada() {
        Scanner in = new Scanner(System.in);
        double saldo = 0;

        do {
            System.out.print("Digite o saldo médio: ");
            saldo = in.nextDouble();
        } while (saldo < 0);
        in.close();
        return saldo;
    }
    public static double sacar(double saldo) {
        Scanner in = new Scanner (System.in);
        double saque=0;

        do {
            System.out.print("Digite o valor a ser sacado: ");
            saque = in.nextDouble();
        } while (saque<0);
        if (saldo >= saque){
            saldo = saldo - saque;
            System.out.println("Saldo atual é:"+saldo);
        } else                
            System.out.println("Saldo insuficiente:");   
        in.close();
        return saldo;
    }
    public static double depositar(double saldo) {
        Scanner in = new Scanner (System.in);
        double deposito=0;

        do {
            System.out.print("Digite o valor a ser depositado: ");
            deposito = in.nextDouble();
        } while (deposito<=0);
        if (deposito > 0) {
            saldo = saldo + deposito;
            System.out.println("Saldo atual é:"+saldo);
        } else
            System.out.println("Depósito inválido");
        in.close();
        return saldo;
    }
}
