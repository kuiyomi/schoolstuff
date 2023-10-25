public class AppConta {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o nome do proprietário da conta: ");
        String nome = in.nextLine();
      
        System.out.println("Digite o saldo inicial da conta: ");
        double valor = in.nextDouble();
        Conta c1 = new Conta(nome, valor);
        
        System.out.println("Digite o nome do proprietário da conta: ");
        nome = in.nextLine();
      
        System.out.println("Digite o saldo inicial da conta: ");
        valor = in.nextDouble();
        Conta c2 = new Conta(nome, valor);
    
        System.out.println("Digite o valor a ser depositado na conta do: "+ c1.getNome());
        valor = in.nextDouble();
        c1.depositar(valor);
                
        System.out.println("Digite o valor a ser depositado na conta do: "+ c2.getNome());
        valor = in.nextDouble();
        c2.depositar(valor);
        

        System.out.println("SAldo da conta 1: " +c1.getSaldo());
        System.out.println("SAldo da conta 2: "+ c2.getSaldo());
                
        
        System.out.println("Digite o valor a ser sacado na conta do: "+ c1.getNome());
        valor = in.nextDouble();
        c1.sacar(valor);
        
        System.out.println("Digite o valor a ser sacado na conta do: "+ c2.getNome());
        valor = in.nextDouble();
        c2.sacar(valor);
        
        System.out.println("SAldo da conta 1: " +c1.getSaldo());
        System.out.println("SAldo da conta 2: "+ c2.getSaldo());

        System.out.println("Digite o valor a ser trasnferido da conta do: "+ c1.getNome()+ " para a conta do " +c2.getNome());
        valor = in.nextDouble();
        c1.transferir(c2, valor);        
        
        System.out.println("SAldo da conta 1: " +c1.getSaldo());
        System.out.println("SAldo da conta 2: "+ c2.getSaldo());
    }    
}
