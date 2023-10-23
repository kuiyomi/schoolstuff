import java.util.Scanner;

public class appAluno {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        double p1, p2, p3, me, frq, g2;
        int mat;
        String nome;

        Aluno aluno1 = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        nome = in.nextLine();
        aluno1.setNome(nome);

        System.out.println("Informe a matricula do aluno: ");
        mat = in.nextInt();
        aluno1.setMat(mat);

        System.out.println("Informe a frequência do aluno: ");
        frq = in.nextDouble();
        aluno1.setFrq(frq);

        System.out.println("Informe a nota da primeira prova do aluno: ");
        p1 = in.nextDouble();
        aluno1.setP1(p1);

        System.out.println("Informe a nota da segunda prova do aluno: ");
        p2 = in.nextDouble();
        aluno1.setP2(p2);

        System.out.println("Informe a nota da terceira prova do aluno: ");
        p3 = in.nextDouble();
        aluno1.setP3(p3);

        System.out.println("Informe a nota da média de exercícios do aluno: ");
        me = in.nextDouble();
        aluno1.setME(me);

        System.out.println(aluno1.toString());
    }
}
...
