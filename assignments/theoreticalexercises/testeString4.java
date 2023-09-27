package sangue.projeto.src;
import java.util.Scanner;

public class testeString4 {
    public static void main (String args[]) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    System.out.println("\fDigite a posição da string a ser pesquisada: ");
    int posicao = in.nextInt();

    //length retorna o tamanho da String
    if (posicao<word.length() && posicao>=0)
        // charAt (int) retorna o caracter que tem na posção informada no parâmetro
        System.out.println("O caractere da posição " +posicao + "é" + word.charAt(posicao));
    else
        System.out.println("A posição não existe na palavra");

    System.out.println("Digite uma parte a ser pesquisada: ");
    String part = in.nextLine();
    
    if (word.contains(part))
        System.out.println("A palavra possui a parte " + part);
    else
    System.out.println("A palavra não possui a parte" + part);

    in.close();
    }
}