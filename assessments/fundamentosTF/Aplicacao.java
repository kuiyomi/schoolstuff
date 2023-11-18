import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaPacientes listaPacientes = new ListaPacientes();

        int opcao;
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Remover Paciente");
            System.out.println("3. Exibir Lista de Pacientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPaciente(in, listaPacientes);
                    break;
                case 2:
                    removerPaciente(in, listaPacientes);
                    break;
                case 3:
                    exibirListaPacientes(listaPacientes);
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        in.close();
    }

    private static void adicionarPaciente(Scanner scanner, ListaPacientes listaPacientes) {
    }

    private static void removerPaciente(Scanner scanner, ListaPacientes listaPacientes) {
    }

    private static void exibirListaPacientes(ListaPacientes listaPacientes) {
    }
}
