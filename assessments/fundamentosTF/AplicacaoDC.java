import java.util.Scanner;

public class AplicacaoDC {
    public static void main(String[] args) {
        // Inicializa o objeto Scanner para receber a entrada do usuário
        Scanner in = new Scanner(System.in);

        // Inicializa o objeto ListaPacientes para armazenar a lista de pacientes
        ListaPacientes listaPacientes = new ListaPacientes();

        int opcao;
        // Loop principal do programa
        do {
            // Exibe o menu de opções
            System.out.println("Menu de Opções:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Exibir Lista de Pacientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            // Obtém a opção do usuário
            opcao = in.nextInt();

            // Processa a opção do usuário
            switch (opcao) {
                // Chama a função para adicionar um novo paciente à lista
                case 1:
                    adicionarPaciente(in, listaPacientes);
                    break;
                // Chama a função para remover um paciente da lista
                case 2:
                    removerPaciente(in, listaPacientes);
                    break;
                // Chama a função para exibir a lista de pacientes
                case 3:
                    exibirListaPacientes(listaPacientes);
                    break;
                // Encerra o programa
                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                // Opção inválida
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        // Fecha o objeto Scanner
        in.close();
    }

    // Método responsável por adicionar um novo paciente à lista de pacientes
    private static void adicionarPaciente(Scanner scanner, ListaPacientes listaPacientes) {
    }

    // Método responsável por remover um paciente da lista de pacientes
    private static void removerPaciente(Scanner scanner, ListaPacientes listaPacientes) {
    }

    // Método responsável por exibir a lista de pacientes
    private static void exibirListaPacientes(ListaPacientes listaPacientes) {
    }
}
