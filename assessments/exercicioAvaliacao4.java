import java.util.Scanner;

public class exercicioAvaliacao4 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        String entrada;

        do {
            System.out.println("Informe uma string ou digite SAIR para encerrar o programa: ");
            entrada = in.nextLine();

            int qntPalavras = contarPalavras(entrada);
            System.out.println("A quantidade de palavras na string é: " + qntPalavras);

            System.out.println("Digite a vogal a ser procurada na string: ");
            char vogal = in.nextLine().charAt(0);
            int qntVogais = contarVogais(entrada, vogal);
            System.out.println("A vogal '" + vogal + "' aparece " + qntVogais);

            boolean palindromo = testePalindromo(entrada);
            System.out.println((palindromo ? "Sim" : "Não ") + " é um palindromo");

            String textoReverso = inverterString(entrada);
            System.out.println("A string " + entrada + " ao contrário é: " + textoReverso);
        } while (entrada != "SAIR");
        in.close();
    }
    public static int contarPalavras(String entrada) {
        int con = 0;
        boolean contemPalavra = false;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                if (!contemPalavra) {
                    con++;
                    contemPalavra = true;
                } else {
                    contemPalavra = false;
                }
            }
        } 
        return con;
    }
    public static int contarVogais (String entrada, char vogal) {
        int con = 0;
        entrada.toLowerCase();
        
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (entrada.charAt(i) == 'a' || entrada.charAt(i) == 'b' || entrada.charAt(i) == 'e' || entrada.charAt(i) == 'i' || entrada.charAt(i) == 'o' || entrada.charAt(i) == 'u')
                con++;
        }
        return con;
    }
    public static boolean testePalindromo (String entrada) {
        String semEspacos = entrada.replaceAll("\\s", "").toLowerCase();
        int esquerda = 0;
        int direita = semEspacos.length() - 1;

        while (esquerda < direita) {
            if (semEspacos.charAt(esquerda) != semEspacos.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
    public static String inverterString (String entrada) {
        StringBuilder invertido = new StringBuilder(entrada).reverse();
        return invertido.toString();
    }
}
