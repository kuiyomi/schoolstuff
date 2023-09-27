public class IntervalosDeRepresentacao {
public static void main(String args[]){
System.out.println("O Tipo int utiliza 4 bytes e consegue representar
valores inteiros de : " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
System.out.println("O Tipo double utiliza 8 bytes e consegue representar
valores reais de : " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
}
}
import java.util.Scanner;
public class Funcoes {
public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
System.out.println("Informe um valor real: ");
double valor = entrada.nextDouble();
System.out.println("Resultado de floor(" + valor+ ")=" +
Math.floor(valor));
System.out.println("Resultado de ceil(" + valor+ ")=" + Math.ceil(valor));
System.out.println("Resultado de round(" + valor+ ")=" +
Math.round(valor));
}
}
public class Exemplo {
public static void main(String args[]){
double valorDaCompra = 19.93;
double pagamento = 20.0;
double diferenca = pagamento - valorDaCompra;
System.out.println("Diferenca = " + diferenca);
}
}
