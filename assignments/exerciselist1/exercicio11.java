import java.util.Scanner;

public class exercicio11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número de 4 dígitos: ");
        int numeroinicial = in.nextInt();

        int quartoDigito = numeroinicial % 10;
        numeroinicial /= 10;
        
        int terceiroDigito = numeroinicial % 10;
        numeroinicial /= 10;
        
        int segundoDigito = numeroinicial % 10;
        numeroinicial /= 10;
        
        int primeiroDigito = numeroinicial;

        int numeroinvertido = quartoDigito * 1000 + terceiroDigito * 100 + segundoDigito * 10 + primeiroDigito;


        System.out.println("O número inserido exibido na ordem inversa é: " + numeroinvertido);
        
        in.close();
    }
}