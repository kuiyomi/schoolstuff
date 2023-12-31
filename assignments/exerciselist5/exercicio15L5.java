import java.util.Scanner;

public class exercicio15L5 {
    public static void main (String args[]) {
        int [] vA = vetorA();
        int [] vS = calcSomatorio(vA);

        System.out.println("Vetor A");
        for (int i = 1; i < 20; i++) {
            System.out.println("[" + i + " ] " + vA[i]);
        }

        System.out.println("Vetor S");
        for (int i = 1; i < 20; i++) {
            System.out.println("[" + i + " ] " + vS[i]);
        }
    }
    
    public static int[] vetorA () {
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

    public static int [] calcSomatorio (int [] vA) {
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
