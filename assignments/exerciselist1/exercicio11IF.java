import java.util.Scanner;

public class exercicio11IF {
    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int numeroinicial, quartoDigito, terceiroDigito, segundoDigito, primeiroDigito, numeroinvertido;

        System.out.println("Digite um número de 4 dígitos: ");
	numeroinicial = in.nextInt();
			
	if (numeroinicial > 9999 || numeroinicial < 1000) {
	System.out.println("Erro: O numero inserido nao possui 4 digitos.");
	} else {

	quartoDigito = numeroinicial % 10;
	numeroinicial /= 10;
        
	terceiroDigito = numeroinicial % 10;
	numeroinicial /= 10;
        
	segundoDigito = numeroinicial % 10;
	numeroinicial /= 10;
        
	primeiroDigito = numeroinicial;

	numeroinvertido = quartoDigito * 1000 + terceiroDigito * 100 + segundoDigito * 10 + primeiroDigito;

	System.out.println("O número inserido exibido na ordem inversa é: " + numeroinvertido);
	}
        
        in.close();
    }
}
