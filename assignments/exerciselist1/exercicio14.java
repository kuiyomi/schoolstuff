import java.util.Scanner;

public class exercicio14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d, e, g, h, j, k, m, n, r, p, y;

        System.out.println("Digite o ano desejado: ");
        y = in.nextInt();
        a = y%19;
        b = y/100;
        c = y%100;
        d = b/4;
        e = b%4;
        g = (8 * b + 13) / 25;
        h = (19 * a + b - d - g + 15) % 30;
        j = c/4;
        k = c%4;
        m = (a + 11 * h) / 319;
        r = (2 * e + 2 * j - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 32;

        System.out.println("A Páscoa será: " + p + " / " + n + " / " + y);

        in.close();
    }
    
}