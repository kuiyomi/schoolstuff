import java.io.UTFDataFormatException;
import java.util.Scanner;

public class appLivro {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        Livro[] listaLivros = new Livro [10];
        int codigo, anoPublic;
        String titulo, autores;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o titulo do livro: ");
            titulo = in.nextLine();
            System.out.println("Informe o codigo do livro: ");
            codigo = in.nextInt();
            System.out.println("Informe o autor do livro ");
            autores = in.nextLine();
            System.out.println("Informe o ano de publicação do livro: ");
            anoPublic = in.nextInt();

            Livro l1 = new Livro(titulo, codigo, autores, anoPublic);

            listaLivros[i] = l1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(listaFormas[i].toString());
        }

        in.close();
    }
}

??????
