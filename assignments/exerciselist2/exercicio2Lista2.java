public class exercicio2Lista2 {
    public static void main (String args[]) {
        int n1, n2, n3;
        boolean exprA, exprB, exprC;
        n1 = 10; n2 = 5; n3 = 20;

        exprA = n1 + n2 % 10 >= n3 || n2 % 2 != 0 && n2 > 0;
        System.out.println("O valor lógico da expressão (a) é: " + exprA);

        exprB = !(n3 > 30) && n1 >= 10 && n1 <= 50 - n3;
        System.out.println("O valor lógico da expressão (b) é: " + exprB);

        exprC = Math.sqrt(n3 + n2) > n1 || Math.pow(n1, 2) >= n2 * n3;
        System.out.println("O valor lógico da expressão (c) é: " + exprC);
    }
}
