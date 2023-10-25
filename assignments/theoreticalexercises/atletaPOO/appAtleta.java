public class AppAtleta {
    public static void main(String args[]){
        double nota;
        Scanner in = new Scanner(System.in);
        Atleta a1 = new Atleta();
        System.out.println("Digite a nota de partida:");
        nota = in.nextDouble();
        a1.setNotaPartida(nota);
        
        System.out.println("Digite a nota 1:");
        nota = in.nextDouble();
        a1.setNota1(nota);
        
        System.out.println("Digite a nota 2:");
        nota = in.nextDouble();
        a1.setNota2(nota);
        
        System.out.println("Digite a nota 3:");
        nota = in.nextDouble();
        a1.setNota3(nota);
        
        System.out.println("Digite a nota 4:");
        nota = in.nextDouble();
        a1.setNota4(nota);
        
        System.out.println("Digite a nota 5:");
        nota = in.nextDouble();
        a1.setNota5(nota);
        
        System.out.println("Digite a nota 6:");
        nota = in.nextDouble();
        a1.setNota6(nota);
        
        System.out.println(a1.toString());
        
        System.out.println("\nA nota mais baixa é: " + a1.buscaNotaMaisBaixa());
        
        System.out.println("\nA nota mais alta é: " + a1.buscaNotaMaisAlta());
        
        System.out.println("\nA media das notas é: " + a1.calculaMediaNotas());
        
        System.out.println("\nA nota final é : " + a1.calculaNotaFinal());
    }
}
