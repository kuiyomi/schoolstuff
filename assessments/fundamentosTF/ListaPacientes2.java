import java.util.Scanner;

public class ListaPacientes2 {
    private Paciente2[] pacientes;
    private int quantidadePacientes;

    public ListaPacientes2() {
        this.pacientes = new Paciente2[1];
        this.quantidadePacientes = 0;
    }

    public void cadastrarPaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.next();
        System.out.print("Digite o sexo do paciente (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite o peso do paciente: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura do paciente: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();

        Paciente2 paciente = new Paciente2(codigo, nome, sexo, peso, altura, idade);
        if (!containsPaciente(paciente)) {
            if (quantidadePacientes == pacientes.length) {
                redimensionarVetor();
            }
            pacientes[quantidadePacientes] = paciente;
            quantidadePacientes++;
            System.out.println("Paciente cadastrado com sucesso!");
        } else {
            System.out.println("Paciente com mesmo nome e código já cadastrado.");
        }
        scanner.close();
    }

    public Paciente2 consultarPorNome(Scanner scanner) {
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.next();
        
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].getNome().equalsIgnoreCase(nome)) {
                return pacientes[i];
            }
        }
        
        return null;
    }

    public Paciente2 consultarPorCodigo(int codigo) {
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                return pacientes[i];
            }
        }
        return null;
    }
    
    public Paciente2 consultarPorCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        scanner.close();

        return consultarPorCodigo(codigo);
    }

    public Paciente2[] listarPorIdadeAcima(Scanner scanner) {
        System.out.print("Digite a idade mínima: ");
        int valorIdade = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].getIdade() > valorIdade) {
                contador++;
            }
        }

        Paciente2[] pacientesAcimaIdade = new Paciente2[contador];
        contador = 0;
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].getIdade() > valorIdade) {
                pacientesAcimaIdade[contador] = pacientes[i];
                contador++;
            }
        }

        return pacientesAcimaIdade;
    }

    public Paciente2[] listarTodos() {
        Paciente2[] todosPacientes = new Paciente2[quantidadePacientes];
        for (int i = 0; i < quantidadePacientes; i++) {
            todosPacientes[i] = pacientes[i];
        }
        return todosPacientes;
    }

    public void alterarPeso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        Paciente2 paciente = consultarPorCodigo(codigo);

        if (paciente != null) {
            System.out.print("Digite o novo peso do paciente: ");
            double novoPeso = scanner.nextDouble();
            paciente.setPeso(novoPeso);
            System.out.println("Peso alterado com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
        scanner.close();
    }

    public void alterarAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        Paciente2 paciente = consultarPorCodigo(codigo);

        if (paciente != null) {
            System.out.print("Digite a nova altura do paciente: ");
            double novaAltura = scanner.nextDouble();
            paciente.setAltura(novaAltura);
            System.out.println("Altura alterada com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
        scanner.close();
    }

    public void alterarSexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        Paciente2 paciente = consultarPorCodigo(codigo);

        if (paciente != null) {
            System.out.print("Digite o novo sexo do paciente (M/F): ");
            char novoSexo = scanner.next().charAt(0);
            paciente.setSexo(novoSexo);
            System.out.println("Sexo alterado com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
        scanner.close();
    }

    public void mostrarIMC() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do paciente: ");
        int codigo = scanner.nextInt();
        Paciente2 paciente = consultarPorCodigo(codigo);

        if (paciente != null) {
            System.out.println("IMC do paciente: " + paciente.calcularIMC());
        } else {
            System.out.println("Paciente não encontrado.");
        }
        scanner.close();
    }

    private boolean containsPaciente(Paciente2 paciente) {
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].equals(paciente)) {
                return true;
            }
        }
        return false;
    }

    private void redimensionarVetor() {
        int novoTamanho = pacientes.length * 2;
        Paciente2[] novoVetor = new Paciente2[novoTamanho];
        for (int i = 0; i < quantidadePacientes; i++) {
            novoVetor[i] = pacientes[i];
        }
        pacientes = novoVetor;
    }
}
