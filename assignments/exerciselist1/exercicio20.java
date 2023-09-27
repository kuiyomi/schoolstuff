import java.util.Scanner;

public class exercicio20 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double distanciaTotal, distanciaParada, capacidade, consumo, paradas;
		
		System.out.println("Informe a capacidade do tanque do seu veículo, em litros: ");
		capacidade = in.nextDouble();		
		
		System.out.println("Informe o consumo médio do seu veículo, em km/litro: ");
		consumo = in.nextDouble();
		
		System.out.println("Informe a distância que será percorrida. em km: ");
		distanciaTotal = in.nextDouble();
		
		distanciaParada = (capacidade * consumo);
		paradas = (distanciaTotal / distanciaParada);
		
		System.out.println("O número total de paradas para chegar ao destino será: " + (Math.round(paradas)));
		
		in.close();
	}
}
