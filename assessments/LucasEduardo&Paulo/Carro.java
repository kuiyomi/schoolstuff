public class Carro {
    private double km, consM, tnq, capT;
    private String plc;

    public Carro() {
        km = 0;
        consM = 0;
        tnq = 0;
        capT = 0;
        plc = "";
    }


    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getConsM() {
        return this.consM;
    }

    public void setConsM(double consM) {
        this.consM = consM;
    }

    public double getTnq() {
        return this.tnq;
    }

    public void setTnq(double tnq) {
        this.tnq = tnq;
    }

    public double getCapT() {
        return this.capT;
    }

    public void setCapT(double capT) {
        this.capT = capT;
    }

    public String getPlc() {
        return this.plc;
    }

    public void setPlc(String plc) {
        this.plc = plc;
    }
    
    public double abastecerLitros(double abastece) {
        
        if ((getTnq() + abastece) > getCapT()){
            System.out.println("O tanque está cheio e sobrou " + (abastece - getTnq()) + " litros");
            return capT;
        } else {
            return tnq = getTnq() + abastece;
        }
    }

    public double abastecerReais(double abastece, double preco) {
        
        abastece = abastece / preco;
        if ((getTnq() + abastece) > getCapT()){
            System.out.println("O tanque está cheio e sobrou " + (abastece - this.getTnq()) * preco + " reais");
            return capT;
        } else {
            return tnq = getTnq() + abastece;
        }
    }

    public double locomover(double distancia) {
        kilometragem(distancia);
        return tnq = getTnq() - (distancia / getConsM()); 
    }

    public double kilometragem(double distancia) {
        return km = km + distancia;
    }

    public double capacidadeDeslocamento() {
        return getTnq() / getConsM();
    }

    public double previsaoCombustivel(double km) {
        return Math.ceil(km / getCapT());
    }

    public String toString() {
        String saida = "Placa: " + plc + "\nKilometragem: " + km + "\nCapacidade do tanque: " + capT + "\nConsumo médio: " + consM + "\nQuantidade de combústivel: " + tnq;
        return saida;
    }
}
