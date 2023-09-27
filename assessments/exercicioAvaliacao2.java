import java.util.Scanner;

public class exercicioAvaliacao2 {
    //Aluno: Lucas Eduardo de Oliveira Machado Turma: 030
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3, min, mid, max;
        int opcao;

        System.out.println("Insira o primeiro valor real: ");
        n1 = in.nextDouble();
        System.out.println("Insira o segundo valor real: ");
        n2 = in.nextDouble();
        System.out.println("Insira o terceiro valor real: ");
        n3 = in.nextDouble();

        System.out.println("Digite 1 para exibir os valores em ordem crescente: ");
        System.out.println("Digite 2 para exibir os valores em ordem decrescente: ");
        System.out.println("Digite 3 para exibir o maior valor entre os demais: ");
        opcao = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            max = n1;
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
        } else {
            max = n3;
        }

        if (n1 < n2 && n1 < n3) {
            min = n1;
        } else if (n2 < n1 && n2 < n3) {
            min = n2;
        } else {
            min = n3;
        }

        mid = (n1 + n2 + n3 -min -max);

        switch (opcao) {
            case 1:
                System.out.println("Os valores inseridos em ordem crescente são: ");
                System.out.println(min);
                System.out.println(mid);
                System.out.println(max);
                break;
            case 2:
                System.out.println("Os valores inseridos em ordem decrescente são: ");
                System.out.println(max);
                System.out.println(mid);
                System.out.println(min);
                break;
            case 3:
                System.out.println("Os valores inseridos com o maior entre eles são: ");
                System.out.println(min);
                System.out.println(max);
                System.out.println(mid);
                break;
            default:
                System.out.println("Opção inválida");
        }
        in.close();
    }
}
