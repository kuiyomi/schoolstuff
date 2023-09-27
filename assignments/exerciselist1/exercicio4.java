import java.util.Scanner;

public class exercicio4 {
public static void main(String args[]){
Scanner in = new Scanner(System.in);
  double raio, area;

  System.out.println("Informe o valor do raio: ");
  raio = in.nextDouble();
  area = 4 * Math.PI * Math.pow(raio, 2);

  System.out.printf("A área do circulo é: %.2f", area);
  
  in.close();
  }
}