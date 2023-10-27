import java.util.Scanner;

public class appCarro {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String plc;
        double dslc, lngDslc, consM, capT, abastece, gas;

        Carro carro1 = new Carro();
        System.out.println("Informe a placa do carro: ");
        plc = in.nextLine();
        carro1.setPlc(plc);

        System.out.println("Informe a capacidade do tanque: ");
        capT = in.nextDouble();
        carro1.setCapT(capT);

        System.out.println("Informe o consumo médio do veículo, em km/litro: ");
        consM = in.nextDouble();
        carro1.setConsM(consM);

        System.out.println("Informe valor do litro da gasolina, em reais: ");
        gas = in.nextDouble();
                
        System.out.println("Informe a quantidade a ser abastecida, em litros: ");
        abastece = in.nextDouble();
        carro1.abastecerLitros(abastece);

        System.out.println("Informe a quantidade a ser abastecida, em reais: ");
        abastece = in.nextDouble();
        carro1.abastecerReais(abastece, gas);

        System.out.println("Informe a distância a ser deslocada, em km: ");
        dslc = in.nextDouble();
        carro1.locomover(dslc);

        System.out.println("O carro pode se deslocar " + carro1.capacidadeDeslocamento());

        System.out.println("Digite uma distância, em km, para exibir quantos tanques serão necessários para o deslocamento: ");
        lngDslc = in.nextDouble();
        System.out.println("O carro precisa de " + carro1.previsaoCombustivel(lngDslc) + " tanques de combústivel para esta dist");

        System.out.println(carro1.toString());
    }
}
