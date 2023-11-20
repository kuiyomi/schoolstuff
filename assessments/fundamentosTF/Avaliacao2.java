import java.util.Scanner;

public class Aplicacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaPacientes2 listaPacientes = new ListaPacientes2();

        int opcao;
        do {
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
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Paciente2 pacienteEncontradoPorNome = listaPacientes.consultarPorNome(scanner);
                    if (pacienteEncontradoPorNome != null) {
                        System.out.println("Paciente encontrado:\n" + pacienteEncontradoPorNome);
                    } else {
                         System.out.println("Paciente não encontrado.");
                    }
                    break;
                case 2:
                    Paciente2 pacienteEncontrado = listaPacientes.consultarPorCodigo();
                    if (pacienteEncontrado != null) {
                        System.out.println("Paciente encontrado:\n" + pacienteEncontrado);
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }
                    break;
                case 3:
                    Paciente2[] pacientesAcimaIdade = listaPacientes.listarPorIdadeAcima(scanner);
                    if (pacientesAcimaIdade.length > 0) {
                        System.out.println("Pacientes com idade acima de " + pacientesAcimaIdade[0].getIdade() + ":");
                        for (Paciente2 paciente : pacientesAcimaIdade) {
                            System.out.println(paciente);
                        }
                    } else {
                        System.out.println("Nenhum paciente encontrado com idade acima do valor informado.");
                    }
                    break;
                case 4:
                    Paciente2[] todosPacientes = listaPacientes.listarTodos();
                    if (todosPacientes.length > 0) {
                        System.out.println("Lista de todos os pacientes:");
                        for (Paciente2 paciente : todosPacientes) {
                            System.out.println(paciente);
                        }
                    } else {
                        System.out.println("Nenhum paciente cadastrado.");
                    }
                    break;
                case 5:
                    listaPacientes.cadastrarPaciente();
                    break;
                case 6:
                    listaPacientes.alterarPeso();
                    break;
                case 7:
                    listaPacientes.alterarAltura();
                    break;
                case 8:
                    listaPacientes.alterarSexo();
                    break;
                case 9:
                    listaPacientes.mostrarIMC();
                    break;
                case 10:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 10);

        scanner.close();
    }
}
