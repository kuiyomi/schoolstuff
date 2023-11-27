import java.util.Scanner;

public class AppPaciente {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int codigo, idade;
        double altura, peso;
        String nome;
        char sexo;

        System.out.println("Informe o tamanho da lista de pacientes: ");
        int tamanho = in.nextInt();
        ListaPacientes pacientes = new ListaPacientes(tamanho);

        int opcao;
        do {

            menu();
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do paciente a ser pesquisado: ");
                    nome = in.nextLine();
                    if (pacientes.consultaPacientePorNome(nome) != null){
                        System.out.println("Paciente encontrado:\n" + pacientes.consultaPacientePorNome(nome).toString());
                    } else {
                         System.out.println("Paciente não encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("Informe o código do paciente a ser pesquisado: ");
                    codigo = in.nextInt();
                    if ( pacientes.consultaPacientePorCodigo(codigo) != null) {
                        System.out.println(pacientes.consultaPacientePorCodigo(codigo).toString());
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Informe a idade mínima a ser consultada: ");
                    idade = in.nextInt();
                    pacientes.consultaPacientesIdadeAcima(idade);
                    break;

                case 4:
                    pacientes.listaTodosPacientes();
                    break;
                    
                case 5:
                    do {
                        System.out.println("Informe o código do paciente a ser cadastrado: ");
                        codigo = in.nextInt();
                        in.nextLine();
                    } while (codigo < 0);
                    
                    do {
                        System.out.println("Informe o nome do paciente a ser cadastrado: ");
                        nome = in.nextLine();
                        in.nextLine();
                    } while (nome == null);
                    
                    do {
                        System.out.println("Informe o sexo do paciente a ser cadastrado (F para feminino ou M para masculino): ");
                        sexo = Character.toUpperCase(sc.next().charAt(0));
                    } while (sexo != 'F' && sexo != 'M');

                    do {
                        System.out.println("Informe o peso do paciente a ser cadastrado, dentro do intervalo de [0, 150kg]: ");
                        peso = in.nextInt();
                    } while (peso <= 0 || peso > 150);

                    do {
                        System.out.println("Informe a altura do paciente a ser cadastrado, dentro do intervalo de [0, 2,5m]: ");
                        altura = in.nextInt();
                    } while (altura <= 0 || altura > 2.5);

                    do {
                        System.out.println("Informe a idade do paciente a ser cadastrado, dentro do intervalo de [0, 120]: ");
                        altura = in.nextInt();
                    } while (altura < 0 || altura > 120);

                    Paciente paciente = new Paciente(codigo, nome, sexo, peso, altura, idade);
                    if (pacientes.cadastraPaciente(paciente)) {
                        System.out.println("Paciente cadastrado com sucesso!");
                    } else {
                        System.out.println("Não foi possível cadastrar o paciente\nNome ou código já cadastrados");
                    }
                    break;
                case 6:
                    System.out.println("Informe o código do paciente: ");
                    codigo = in.nextInt();
                    System.out.println("Informe o novo peso a ser cadastrado, dentro do intervalo de [0, 150kg]: ");
                    peso = in.nextDouble();
                    if (pacientes.alteraPeso(codigo, peso)) {
                        System.out.println("Peso alterado com sucesso!");
                    } else {
                        System.out.println("Não foi possível alterar o peso do paciente\nCódigo não cadastrado ou peso inválido");
                    } 
                    break;
                case 7:
                    System.out.println("Informe o código do paciente: ");
                    codigo = in.nextInt();
                    System.out.println("Informe a nova altura a ser cadastrada, dentro do intervalo de [0, 2,5m]: ");
                    altura = in.nextDouble();
                    if (pacientes.alteraAltura(codigo,altura)) {
                        System.out.println("Altura alterada com sucesso!");
                    } else {
                        System.out.println("Não foi possível alterar a altura do paciente\nCódigo não cadastrado ou altura inválida");
                    } 
                    break;
                case 8:
                    System.out.println("Informe o código do paciente: ");
                    codigo = in.nextInt();
                    System.out.println("Informe o novo sexo a ser cadastrado (F para feminino ou M para masculino): ");
                    sexo = Character.toUpperCase(sc.next().charAt(0));
                    if (pacientes.alteraSexo(codigo, sexo)) {
                        System.out.println("Sexo alterado com sucesso!");
                    } else {
                        System.out.println("Não foi possível alterar o sexo do paciente\nCódigo não cadastrado ou sexo inválido");
                    } 
                    break;
                case 9:
                    System.out.println("Informe o código do paciente para exibir o IMC: ");
                    codigo = in.nextInt(); 
                    if (pacientes.consultaPacientePorCodigo(codigo) != null) {
                        System.out.println("O IMC do paciente é: " + pacientes.consultaPacientePorCodigo(codigo).calculaIMC());
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
                    break;
                case 10:
                    System.out.println("Informe o código do paciente para exibir o seu peso ideal: ");
                    codigo = in.nextInt(); 
                    if (pacientes.consultaPacientePorCodigo(codigo) != null) {
                        System.out.println("O IMC do paciente é: " + pacientes.consultaPacientePorCodigo(codigo).calculaPesoIdeal());
                    } else {
                        System.out.println("Paciente não encontrado");
                    }
                    break;
                case 11:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 11);

        in.close();
    }

    public static void menu(){
        System.out.println("Menu de Opções:");
        System.out.println("1. Consultar Paciente por Nome");
        System.out.println("2. Consultar Paciente por Código");
        System.out.println("3. Listar Pacientes com Idade Acima");
        System.out.println("4. Listar Todos os Pacientes");
        System.out.println("5. Cadastrar Paciente");
        System.out.println("6. Alterar Peso de Paciente");
        System.out.println("7. Alterar Altura de Paciente");
        System.out.println("8. Alterar Sexo de Paciente");
        System.out.println("9. Mostrar IMC de Paciente");
        System.out.println("10. Mostrar o peso ideal do paciente");
        System.out.println("11. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
