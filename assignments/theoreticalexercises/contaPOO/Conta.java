public class Conta {
    private double saldo;
    private String nome;
    
    public Conta (String nome, double saldo){
    
        if(!nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Cliente";
        
        if (saldo>=0)
            this.saldo = saldo;
        else
            this.saldo = 0;                  
    }
    
    
    public void setNome(String nome){
        if(!nome.isEmpty())
            this.nome = nome;        
    }
    
    public String getNome(){return nome;
    }
    
    public double getSaldo(){ return saldo;
    }

    public void sacar(double valor){
        if (saldo>= valor)
            saldo = saldo - valor;
        else
            System.out.println("Saldo insuficiente");            
    }
    
    public void depositar(double valor){
        if (valor>0)
            saldo = saldo + valor;
    }
    
    public void transferir(Conta destino, double valor){
        if (saldo>= valor){
            sacar(valor);
            destino.depositar(valor);
        }
        else
            System.out.println("Saldo insuficiente para transferência");  
    }
    
    public String toString(){
        return "Nome: " + getNome() + "\nSaldo: "+ getSaldo();
    }
}
