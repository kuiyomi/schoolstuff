public class AppConta
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Conta c1 = criaConta();
        Conta c2 = criaConta();
        
        depositar(c1);
        depositar(c2);
        
        System.out.println("Saldo da conta 1: " +c1.getSaldo());
        System.out.println("Saldo da conta 2: "+ c2.getSaldo());
                
        sacar(c1);
        sacar(c2);     
        
        System.out.println("Saldo da conta 1: " +c1.getSaldo());
        System.out.println("Saldo da conta 2: "+ c2.getSaldo());
        
        transferir(c1,c2);
        
        System.out.println("Saldo da conta 1: " +c1.getSaldo());
        System.out.println("Saldo da conta 2: "+ c2.getSaldo());
    }
    
    public static Conta criaConta(){
        Scanner in = new Scanner(System.in);
      
        System.out.println("Digite o nome do proprietário da conta: ");
        String nome = in.nextLine();
      
        System.out.println("Digite o saldo inicial da conta: ");
        double valor = in.nextDouble();
        Conta conta = new Conta(nome, valor);
        return conta;
    }
    
    public static void depositar(Conta destino){
        Scanner in = new Scanner(System.in);
      
        System.out.println("Digite o valor a ser depositado na conta do: "+ destino.getNome());
        double valor = in.nextDouble();
        destino.depositar(valor);        
    }
