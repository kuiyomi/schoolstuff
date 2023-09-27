import java.util.Scanner;

public class exercicioCalculoG1 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        double p1, p2, t1, t2, g1, md=0, mdt;

        System.out.println("\f");

        for(int con = 0; con < 30; con ++) {
            System.out.println("Informe a nota da primeira prova: ");
            p1 = in.nextDouble();
            System.out.println("Informe a nota da segunda prova: ");
            p2 = in.nextDouble();
            System.out.println("Informe a nota do primeiro trabalho: ");
            t1 = in.nextDouble();
            System.out.println("Informe a nota do segundo trabalho: ");
            t2 = in.nextDouble();
            g1 = (p1 + 2 * p2 + t1 + 2 * t2) / 6;

            System.out.println("A nota final do G1 do aluno é: " + g1);
            md = md + g1;
        }
        mdt = md / 30;
        System.out.println("A média da turma é: " + mdt);
        in.close();
    }
}