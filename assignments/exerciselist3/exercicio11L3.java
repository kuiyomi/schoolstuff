import java.util.Scanner;

public class exercicio11L3 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        int val;

        do {
            System.out.println("Informe um valor inteiro e positivo: ");
            val = in.nextInt();
        }   while (val<=0);
        for (int div=1; div<=val; div++) {
            if (val % div == 0)
            System.out.print(div + " ");
        } 
        in.close();
    }
}
