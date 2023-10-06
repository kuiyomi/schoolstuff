import java.util.Scanner;

public class modCalcG1 {
    public static void main (String args[]) {
        double p1, p2, me, tf, g1;
        for (int x=0; x<leituraTurmas(); x++) {
            for (int y=0; y<leituraAlunos(); y++) {
                p1 = leituraNotas();
                p2 = leituraNotas();
                me = leituraNotas();
                tf = leituraNotas();
                g1 = calcG1(p1, p2, me, tf);
                System.out.println(Resultados(g1));
            }
        }
    }
    public static int leituraTurmas () {
        Scanner in = new Scanner (System.in);
        System.out.println("Informe a quantidade de turmas: ");
        int turmas = in.nextInt();
        return turmas;
    }
    public static int leituraAlunos () {
        Scanner in = new Scanner (System.in);
        System.out.println("Informe a quantidade de alunos: ");
        int alunos = in.nextInt();
        return alunos;
    }
    public static double leituraNotas () {
        Scanner in = new Scanner (System.in);
        System.out.println("Informe a nota do aluno: ");
        double nota = in.nextDouble();
        return nota;
    }
    public static double calcG1 (double p1, double p2, double me, double tf) {
        double g1 = (p1 + 2*p2 + me + 2*tf) / 6;
        return g1;
    }
    public static String Resultados (double g1) {
        if (g1 >= 7)
            return "Aprovado";
        else if (g1 >= 4)
            return "Em G2";
        else
            return "Reprovado";            
    }
}
