public class exercicio13L5 {
    public static void main (String args[]) {
        int [] resultado = montaVetorPrimos();
        for (int i=0; i<= 99; i++) {
            System.out.println(resultado[i]);
        }
        System.out.println(montaVetorPrimos());
    }
    
    public static int[] montaVetorPrimos() {
        int quantidade=0;
        int numero = 2, contDiv = 0;
        int [] VetorPrimos = new int [100];
        while (quantidade <= 99) {
            contDiv = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i ==0)
                    contDiv++;
            } if (contDiv == 2) {
                VetorPrimos[quantidade] = numero;
                quantidade++;
            }
            numero++;
        }
        return VetorPrimos;
    }
}
