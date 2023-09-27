import java.util.Scanner;

public class exercicio21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double bolinhas, caixas;

        System.out.println("Informe a quantidade de bolinhas: ");
        bolinhas = in.nextDouble();

        caixas = Math.ceil(bolinhas/100);

        System.out.println("Serão necessárias " + caixas + " para embalar as bolinhas");

        in.close();
    }
}
