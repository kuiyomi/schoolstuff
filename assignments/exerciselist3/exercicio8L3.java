import java.util.Scanner;

public class exercicio8L3 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        int soma=0, intervalo=0, maior=0, menor=Integer.MAX_VALUE;
        
        for (int num=1; num<=10; num++) {
            System.out.println("Informe um valor inteiro positivo: ");
            int valor = in.nextInt();

            if (valor<0) {
                System.out.println("O valor inserido não é válido");
                num--;
                continue;
            }
            soma += valor;
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            if (valor >= 0 && valor <= 10){
                intervalo++;
            }            
        }
        double media = soma / 10;

        System.out.println("A média dos valores é: " + media);
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A quantidade de valores no intervalo de [0;10] é: " + intervalo);

        in.close();
    }
}
