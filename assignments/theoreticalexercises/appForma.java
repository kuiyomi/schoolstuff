import java.util.Scanner;

public class appForma {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        Forma[] listaFormas = new Forma [10];
        double lado, area;
        String nome, cor;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome da forma: ");
            nome = in.nextLine();
            System.out.println("Informe a cor da forma: ");
            cor = in.nextLine();
            System.out.println("Informe o lado da forma: ");
            lado = in.nextDouble();
            System.out.println("Informe a área da forma: ");
            area = in.nextDouble();

            Forma f1 = new Forma(nome, cor, lado, area);

            listaFormas[i] = f1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(listaFormas[i].toString());
        }

        in.close();
    }
}
