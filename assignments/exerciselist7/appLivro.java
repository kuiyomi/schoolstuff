package Livros;
import java.util.Scanner;

public class appLivro {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int tamanho, opcao, codigo, anoPublic;
        String titulo, autores;

        System.out.println("Informe o tamanho do acervo:");
        tamanho = in.nextInt();
        opcao = 0;

        listaLivros lista = new listaLivros(tamanho);
        
        while (opcao!=5) {
            menu();
            opcao = in.nextInt();
            switch(opcao){
                case 1: System.out.println("Digite o código: ");
                        codigo = in.nextInt();
                        System.out.println("Digite o título: ");
                        titulo = in.next();
                        System.out.println("Digite o ano: ");
                        anoPublic = in.nextInt();
                        System.out.println("Digite os autores: ");
                        autores = in.next();
                        Livro l = new Livro(titulo, autores, anoPublic, codigo);
                        if (lista.cadastraLivro(l))
                            System.out.println("Livro cadastrado");
                        else
                            System.out.println("Livro cadastradoJa existe livro com este código");
                        break;
                case 2: System.out.println("Digite o código: ");
                        codigo = in.nextInt(); 
                        if (lista.excluiLivro(codigo))
                            System.out.println("Livro excluido");
                        else
                            System.out.println("Acervo não possui livros ou não tem livro com este código");
                        break;
                case 3: System.out.println("Digite o código: ");
                        codigo = in.nextInt(); 
                        if (lista.buscaLivroPorCodigo(codigo)!=null)
                            System.out.println(lista.buscaLivroPorCodigo(codigo).toString());
                        else
                            System.out.println("Acervo não possui livros ou não tem livro com este código");
                        break;
                case 4: System.out.println("Digite o nome do autor(es): ");
                        autores = in.next(); 
                        if (lista.buscaLivroPorAutor(autores)!=null)
                            System.out.println(lista.buscaLivroPorAutor(autores).toString());
                        else
                            System.out.println("Acervo não possui livros ou não tem livro com estes autores");
                        break;        
                case 5: System.out.println("Saindo da livraria");
                        break;
                default:System.out.println("Opção inválida");
                        break;
            }
        }
        in.close();
    }
    
    public static void menu() {
        System.out.println("1 - Insere");
        System.out.println("2 - Exclui");
        System.out.println("3 - Consulta por código");
        System.out.println("4 - Consulta por autores");
        System.out.println("5 - Sair");        
    }
}
