import java.util.Scanner;

public class exercicio22 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double custoTotal, poltronas, lucroDesejado, ocupacaoMinima, espetaculos, ingresso;

        System.out.println("Informe o custo total para execução do espetáculo, em reais: ");
        custoTotal = in.nextDouble();

        System.out.println("Informe a quantidade de poltronas existentes no teatro: ");
        poltronas = in.nextDouble();

        System.out.println("Informe a quantidade lucro desejada, em percentual: ");
        lucroDesejado = in.nextDouble();

        System.out.println("Informe a quantidade minima de ocupação esperada, em percentual: ");
        ocupacaoMinima = in.nextDouble();

        System.out.println("Informe a quantidade de espetaculos que serão realizados: ");
        espetaculos = in.nextDouble();

        ingresso = ((custoTotal * (lucroDesejado / 100)) / (poltronas * (ocupacaoMinima / 100))) * espetaculos;

        System.out.println("O valor do ingresso, em reais, deve ser: " + (Math.ceil(ingresso)));

        in.close();
    }
}