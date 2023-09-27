import java.util.Scanner;

public class testeString {
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

    System.out.println("Digite uma letra a ser pesquisada: ");
    String letter = in.nextLine();
    
    if (word.startsWith(letter))
        System.out.println("A palavra começa com " + letter);
    else
    System.out.println("A palavra não começa com" + letter);

    in.close();
    }
}
