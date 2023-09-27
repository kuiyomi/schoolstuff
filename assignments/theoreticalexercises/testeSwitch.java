import java.util.Scanner;

public class testeSwitch {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int dia;

        System.out.println("Informe um número referente ao dia da semana desejado: ");
        dia = in.nextInt();

        switch (dia) {
            case 1 : 
                System.out.println("O dia da semana é domingo");
                break;
            case 2 : 
                System.out.println("O dia da semana é segunda-feira");
                break;
            case 3 : 
                System.out.println("O dia da semana é terça-feira");
                break;
            case 4 : 
                System.out.println("O dia da semana é quarta-feira");
                break;
            case 5 : 
                System.out.println("O dia da semana é quinta-feira");
                break;
            case 6 : 
                System.out.println("O dia da semana é sexta-feira");
                break;
            case 7 : 
                System.out.println("O dia da semana é sábado");
                break;
            default:
                System.out.println("Informação inválida");
        }
        in.close();
    }
}
