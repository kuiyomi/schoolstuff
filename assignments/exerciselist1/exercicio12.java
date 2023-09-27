import java.util.Scanner;

public class exercicio12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int quantia, nota100, nota50, nota20, nota10, nota5, nota2, moeda1;

        System.out.println("Informe a quantia inteira em reais: ");
        quantia = in.nextInt();

        nota100 = quantia/100;
        nota50 = quantia%100/50;
        nota20 = quantia%100%50/20;
        nota10 = quantia%100%50%20/10;
        nota5 = quantia%100%50%20%10/5;
        nota2 = quantia%100%50%20%10%5/2;
        moeda1 = quantia%100%50%20%10%5%2/1;

        System.out.println(nota100 + " notas de R$100,00");
        System.out.println(nota50 + " notas de R$50,00");
        System.out.println(nota20 + " notas de R$20,00");
        System.out.println(nota10 + " notas de R$10,00");
        System.out.println(nota5 + " notas de R$5,00");
        System.out.println(nota2 + " notas de R$2,00");
        System.out.println(moeda1 + " moedas de R$1,00");

        in.close();
    }
}