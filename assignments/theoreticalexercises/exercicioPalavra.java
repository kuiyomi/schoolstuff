import java.util.Scanner;

public class exercicioPalavra {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int opcao, d1, d2;
        char cn, cs;
        String s1, s2, pt;

        System.out.println("Informe uma string com, no máximo, 20 caracteres: ");
        s1 = in.nextLine();

        if (s1.length() > 20)
            System.out.println("A string inserida possui mais que 20 caracteres");
        else 
            System.out.println("Digite 1 para exibir a string inserida");
            System.out.println("Digite 2 para exibir o tamanho da string inserida");
            System.out.println("Digite 3 para comparar a string inserida com outra");
            System.out.println("Digite 4 para comparar o tamanho da string inserida com outra");
            System.out.println("Digite 5 para concatenar a string inserida com outra");
            System.out.println("Digite 6 para substituir a primeira ocorrência de um caractere da string inserida por outro");
            System.out.println("Digite 7 para procurar uma substring especifica dentro da string inserida");
            System.out.println("Digite 8 para exibir uma parte da string inserida");
            opcao = in.nextInt();

        if (opcao >= 1 && opcao <=8) {
            switch (opcao) {
                case 1 :
                    System.out.println("A palavra inserida é " + s1);
                    break;
                case 2 :
                    System.out.println("A palavra inserida possui " + s1.length() + " caracteres");
                    break;
                case 3 :
                    System.out.println("Insira uma nova string a ser comparada: ");
                    in.nextLine();
                    s2 = in.nextLine();
                    if (s1.compareToIgnoreCase(s2) == 0)
                        System.out.println("As strings são iguais");
                    else if (s1.compareToIgnoreCase(s2) > 0)
                        System.out.println(s2 + " vem antes de " + s1);
                    else
                        System.out.println(s2 + " vem depois de " + s1);
                    break;
                case 4 :
                    System.out.println("Insira uma nova string a ser comparada: ");
                    in.nextLine();
                    s2 = in.nextLine();
                    if (s1.length() > s2.length())
                        System.out.println("A string inserida é menor que a string inicial");
                    else
                        System.out.println("A string inserida é maior que a string inicial");
                    break;
                case 5 :
                    System.out.println("Insira uma nova string a ser concatenada: ");
                    in.nextLine();
                    s2 = in.nextLine();
                    System.out.println(s1 + s2);
                    break;
                case 6 :
                    System.out.println("Informe o caractere a ser substituido na string: ");
                    in.nextLine();
                    cs = in.nextLine().charAt(0);
                    System.out.println("Insira o novo caractere a ser adicionado: ");
                    cn = in.nextLine().charAt(0);
                    s2 = s1.replaceFirst(String.valueOf(cs), String.valueOf(cn));
                    System.out.println(s2);
                    break;
                case 7 :
                    System.out.println("Digite a substring a ser procurada: ");
                    in.nextLine();
                    s2 = in.nextLine();
                    if (s1.contains(s2))
                        System.out.println("A string inicial possui a substring inserida");
                    else
                        System.out.println("A string inicial não possui a substring inserida");
                    break;
                case 8 :
                    System.out.println("Informe a partir de qual posição deve ser exibido: ");
                    d1 = in.nextInt() -1;
                    System.out.println("Informe até que posição deve ser exibido");
                    d2 = in.nextInt();
                    if (d1 >= 0 && d2 <= s1.length() && d1 <= d2) {
                        pt = s1.substring(d1, d2);
                        System.out.println(pt);
                    } else
                        System.out.println("O valor inserido é inválido");
                    break;
                default :
                    System.out.println("Informação inválida");
                } 
        } else
            System.out.println("Opção inserida não encontrada");

        in.close();
    }
}
