import java.util.Scanner;

public class exercicioAvaliacao3 {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);
        int eletrs, vC1=0, vC2=0, vC3=0, vC4=0, vN=0, vB=0;
        String cidade;

        System.out.println("Informe o nome da cidade desejada: ");
        cidade = in.nextLine();
        System.out.println("Informe a quantidade de eleitores desta cidade: ");
        eletrs = in.nextInt();

            for (int con = 1; con <= eletrs; con++) {
                System.out.println("Digite o código do candidato desejado: ");
                int cod = in.nextInt();
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
                        case 0 :
                            vB++;
                            break;
                        default :
                            vN++;
                    } 
                }
        System.out.println("Resultados da eleição do município de " +cidade);
        System.out.println("Total de votos para o candidato 1: " + vC1);
        System.out.println("Total de votos para o candidato 2: " + vC2);
        System.out.println("Total de votos para o candidato 3: " + vC3);
        System.out.println("Total de votos para o candidato 4: " + vC4);
        System.out.println("Total de votos em branco: " + vB);
        System.out.println("Total de votos nulos: " + vN);

        in.close();
    }
}
