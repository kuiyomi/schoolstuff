import java.util.Scanner;

public class exercicio17 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double r1, r2, h1, h2, h3, volumeGarrafa, volumeCilindro1, volumeCilindro2, volumeCone;

        System.out.println("Informe a primeira altura: ");
        h1 = in.nextDouble();
        System.out.println("Informe a segunda altura: ");
        h2 = in.nextDouble();
        System.out.println("Informe a terceira altura: ");
        h3 = in.nextDouble();
        System.out.println("Informe o primeiro raio: ");
        r1 = in.nextDouble();
        System.out.println("Informe o segundo raio: ");
        r2 = in.nextDouble();

        volumeCilindro1 = Math.PI * (Math.pow(r1, 2)) * h1;

        volumeCilindro2 = Math.PI * (Math.pow(r2, 2)) * h2;

        volumeCone = Math.PI * ((((Math.pow(r1, 2)) + r1 * r2 + (Math.pow(r2, 2))) * h3) / 3);

        volumeGarrafa = volumeCilindro1 + volumeCilindro2 + volumeCone;

        System.out.println("O volume da garrafa é: " + volumeGarrafa);

        in.close();
    }
}