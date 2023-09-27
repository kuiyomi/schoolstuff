import java.util.Scanner;

public class exercicio26L3 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        int vC1=0, vC2=0, vC3=0, vC4=0, vN=0, vB=0;

        while (true) {
            System.out.println("Digite o código do candidato desejado ou um valor negativo para encerrar: ");
            int cod = in.nextInt();

            if (cod < 0) {
                System.out.println("Contagem encerrada");
                break;
            }   if (cod == 0){
                vB++;
            }   else if (cod >= 1 && cod <= 4) {
                    switch (cod) {
                        case 1:
                            vC1++;
                            break;
                        case 2:
                            vC2++;
                            break;
                        case 3:
                            vC3++;
                            break;
                        case 4:
                            vC4++;
                            break;                        
                    } 
                } else {
                    vN++;
                }
        }
        System.out.println("Total de votos para o candidato 1: " + vC1);
        System.out.println("Total de votos para o candidato 2: " + vC2);
        System.out.println("Total de votos para o candidato 3: " + vC3);
        System.out.println("Total de votos para o candidato 4: " + vC4);
        System.out.println("Total de votos em branco: " + vB);
        System.out.println("Total de votos nulos: " + vN);

        in.close();
    }
}
