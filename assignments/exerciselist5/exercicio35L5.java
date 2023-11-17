import java.util.Scanner;

public class exercicio35L5 {
    public static void main (String args[]) {
        int [][] matrizA = new int [6][6];
        lerMatriz(matrizA);

        int somaDiagonalPrincial = calculaSomaDiagonalPrincipal(matrizA);
        int somaDiagonalSecundaria = calculaSomaDiagonalSecundaria(matrizA);

        System.out.println("Soma diagonal principal: " + somaDiagonalPrincial);
        System.out.println("Soma diagonal secundária: " + somaDiagonalSecundaria);
    }

    public static void lerMatriz(int [][] matrizA) {
        Scanner in = new Scanner (System.in);

        System.out.println("Informe os valores para a matriz A(6, 6): ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Matriz [" + i + "][" + j + "]");
                matrizA[i][j] = in.nextInt();
            }
        }
    }

    public static int calculaSomaDiagonalPrincipal(int [][] matrizA) {
        int soma = 0;

        for (int k = 0; k < 6; k++) {
            soma += matrizA[k][k];
        } return soma;
        
    }

    public static int calculaSomaDiagonalSecundaria(int [][] matrizA) {
        int soma = 0;

        for (int l = 0; l < 6; l++) {
            soma += matrizA[l][5 - l];
        } return soma;
    }
}
