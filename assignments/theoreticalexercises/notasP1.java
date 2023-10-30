import java.util.Scanner;

public class notasP1 {
    public static void main(String args[]) {
        double [] notasP1 = new double[30];
        double media;
        int con;

        notasP1 = insereNotas();

        con = contaNotasM7(notasP1);
        
        media = mediaNotas(notasP1);

        System.out.println("A quantidade de notas acima de 7 é: " + con);

        System.out.println("A média das notas é: " + media);

    }
    public static double [] insereNotas() {
        Scanner in = new Scanner (System.in);
        double [] notasP1 = new double[30];
        double nota;
        for (int x=0; x<30; x++) {
            nota = in.nextDouble();
            notasP1[x] = nota;
        } return notasP1;
    }
    public static int contaNotasM7(double [] notasP1) {
        int con=0;
        for (int x=0; x<30; x++) {
            if (notasP1[x] >= 7)
                con++;
        } return con;
    }
    public static double mediaNotas(double [] notasP1) {
        double media=0;
        for (int x=0; x<30; x++) {
            media = media + notasP1[x];
        } return media;
    }
}
