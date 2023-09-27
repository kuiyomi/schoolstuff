public class exercicio7L3 {
    public static void main (String args[]) {
        int num=100, con=1;

        while (con <= 50) {
            if (num % 7 == 0) {
                System.out.println("O " +con+ "º numero divisivel por 7 é " +num);
                con++;
            }
        num++;
        }
    }
}
