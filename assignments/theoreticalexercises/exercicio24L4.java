import java.util.Scanner ;

public class exercicio24L4 {
    public static void main (String args[]) {
        int num = valores();
        System.out.println("Os divisores de " + num + " são: ");
        divisores(num);
    }
    public static int valores () {
        Scanner in = new Scanner (System.in);
        int valor;
        do {
        System.out.println("Informe um valor inteiro e positivo: ");
        valor = in.nextInt();
        } while (valor <= 0);
        return valor;
    }
    public static void divisores (int valor) {
        for (int i=1; i<=valor; i++) {
            if (valor % i == 0)
                System.out.println(i);
        }
    }
}
