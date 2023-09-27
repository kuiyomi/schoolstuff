import java.util.Scanner;

public class exercicio7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int valorA, valorB;
        double soma, diferenca, media, distancia, maior, menor;

        System.out.println("Informe o primeiro valor: ");
        valorA = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        valorB = in.nextInt();

        soma = valorA + valorB;
        diferenca = valorA - valorB;
        media = (valorA+valorB) / 2;
        distancia = Math.abs(diferenca);
        maior = (soma + distancia) / 2;
        menor = (soma - distancia) / 2;

        System.out.println("O resultado da soma dos valores é: " + soma);
        System.out.println("O resultado da diferenca dos valores é: " + diferenca);
        System.out.println("O resultado da media dos valores é: " + media);
        System.out.println("A distancia entre os valores é: " + distancia);
        System.out.println("O maior dos valores é: " + maior);
        System.out.println("O menor dos valores é: " + menor);

        in.close();
    }
}
