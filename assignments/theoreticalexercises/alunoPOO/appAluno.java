public class AppAluno
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double nota;
        int frequencia;
        Aluno a1 = new Aluno();
        
        System.out.println("Digite a p1 do aluno: ");
        nota = in.nextDouble();
        a1.setP1(nota);
        
        System.out.println("Digite a p2 do aluno: ");
        nota = in.nextDouble();
        a1.setP2(nota);
        
        System.out.println("Digite a p3 do aluno: ");
        nota = in.nextDouble();
        a1.setP3(nota);
        
        System.out.println("Digite a me do aluno: ");
        nota = in.nextDouble();
        a1.setMe(nota);
        
        System.out.println("Digite a frquencia do aluno: ");
        frequencia = in.nextInt();
        a1.setFrequencia(frequencia);
        
        if (a1.mostraResultadoG1().equalsIgnoreCase("Em G2")){
            System.out.println("Digite a g2 do aluno: ");
            nota = in.nextDouble();
            a1.setG2(nota);
            System.out.println(a1.mostraResultadoG2());
        } else 
            System.out.println(a1.mostraResultadoG1());
        }
}
