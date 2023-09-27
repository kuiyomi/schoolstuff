import java.util.Scanner;

public class exercicio10L2 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        double nota;

        System.out.println("Informe a sua nota, entre 0 e 10: ");
        nota = in.nextDouble();

        if (nota < 3) {
            System.out.println("Conceito E");
        } else if (nota < 5) {
            System.out.println("Conceito D");
        } else if (nota < 7) {
            System.out.println("Conceito C");
        } else if (nota < 9) {
            System.out.println("Conceito B");        
        } else if (nota <= 10) {
            System.out.println("Conceito A");
        } else if (nota > 10) {
            System.out.println("Nota inválida, por favor insira um valor entre 0 e 10");
        }
        in.close();
    }
}
