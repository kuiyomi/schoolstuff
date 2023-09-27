import java.util.Scanner;

public class exercicio4L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;

        System.out.print("Informe um valor numérico: ");
        valor = in.nextDouble();

        if (valor == 0) {
            System.out.println("O valor inserido é zero");
        } else {
        if (valor > 0 && valor > 1000000) {
            System.out.print("O valor inserido é positivo e grande");
        } else {
        if (valor > 0 && valor < 1000000) {
            System.out.println("O valor inserido é positivo");
        } else {
        if (valor < 0) {
            System.out.println("O valor inserido é negativo e pequeno");
        }   }   }   }
        in.close();
    }    
}
