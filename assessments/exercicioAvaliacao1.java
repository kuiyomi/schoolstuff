import java.util.Scanner;

public class exercicioAvaliacao1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double valorA, valorB, valorC, quantidadeA, quantidadeB, quantidadeC, valorTotal, valorTotalDesconto;
        
        System.out.println("Informe o valor unitário do primeiro produto, em reais: ");
        valorA = in.nextDouble();
        System.out.println("Informe a quantidade que será adquirida deste produto: ");
        quantidadeA = in.nextDouble();

        System.out.println("Informe o valor unitário do segundo produto, em reais: ");
        valorB = in.nextDouble();
        System.out.println("Informe a quantidade que será adquirida deste produto: ");
        quantidadeB = in.nextDouble();

        System.out.println("Informe o valor unitário do terceiro produto, em reais: ");
        valorC = in.nextDouble();
        System.out.println("Informe a quantidade que será adquirida deste produto: ");
        quantidadeC = in.nextDouble();

        valorTotal = (valorA * quantidadeA) + (valorB * quantidadeB) + (valorC * quantidadeC);
        valorTotalDesconto = valorTotal - (valorTotal * 0.10);

        System.out.println("O valor total a ser pago, sem desconto, é: R$" + valorTotal);

        System.out.println("O valor total a ser pago, com o desconto de primeira compra, é: R$" + valorTotalDesconto);

        in.close();
    }
}
