import java.util.Scanner;

public class avaliacaoAnterior {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double totalEleitores, votosPrimeiro, votosSegundo, percentualPrimeiro, percentualSegundo, percentualNulos;

		System.out.println("Informe o número total de eleitores: ");
		totalEleitores = in.nextInt();
		
		System.out.println("Informe o número total de votos do primeiro candidato: ");
		votosPrimeiro = in.nextDouble();
		System.out.println("Informe o número total de votos do segundo candidato: ");
		votosSegundo = in.nextDouble();

		percentualPrimeiro = (votosPrimeiro / totalEleitores) * 100;
		percentualSegundo = (votosSegundo / totalEleitores) * 100;
		percentualNulos = (percentualPrimeiro + percentualSegundo) - 100;

		System.out.println("O percentual total de votos do primeiro candidato, em percentual, é: " + percentualPrimeiro);
		System.out.println("O percentual total de votos do segundo candidato, em percentual, é: " + percentualSegundo);
		System.out.println("O percentual total nulos, em percentual, é: " + percentualNulos);

		in.close();
	}
}
