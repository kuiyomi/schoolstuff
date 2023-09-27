import java.util.Scanner;

public class exercicio3L2 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        double altura, pesoIdeal = 0;
        int genero;

        System.out.println("Informe a sua altura, em metros: ");
        altura = in.nextDouble();

        System.out.println("Informe o seu gênetro, use 1 para feminino e 2 para masculino: ");
        genero = in.nextInt();

        if (genero == 1) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else
        if  (genero == 2) {
            pesoIdeal = 72.7 * altura - 58;
        } else
            System.out.println("Informação inválida, use 1 para feminino e 2 para masculino");
        
        if (genero == 1 || genero == 2) {
            System.out.printf("O seu peso ideal é: %.2f kg%n" , pesoIdeal);
        }
        in.close();
    }
}
