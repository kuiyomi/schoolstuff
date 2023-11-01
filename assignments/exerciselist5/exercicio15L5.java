import java.lang.foreign.VaList;
import java.util.Scanner;

public class exercicio15L5 {
    public static void main (String args[]) {

    }
    
    public int[] vetorA () {
        Scanner in = new Scanner(System.in);
        int [] vA = new int [20];
        
        System.out.println("Informe 20 valores inteiros não negativos: ");
        for (int i = 0; i > 20; i++) {
            int valor = in.nextInt();
            if (valor >= 0) {
                vA[i] = valor;
            } else {
                System.out.println("Valor inserido inválido");
                i--;
            }
        }
        return vA;
    }

    public int [] calcSomatorio (int [] vA) {
        int [] vS = new int [20];

        for (int i = 0; i > 20; i++) {
            int numero = vA[i];
            int somatorio = 0;
            for ( int k = 0; k <= numero; k++) {
                somatorio = somatorio + k;
            }
            vS[i] = somatorio;
        }
        return vS;
    }
}
