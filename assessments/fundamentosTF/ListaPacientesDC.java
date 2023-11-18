public class ListaPacientesDC {

    // Atributos
    // Vetor que armazena os pacientes.
    private Paciente[] pacientes;
    private int quantidadePacientes;

    // O construtor padrão inicializa o vetor de pacientes com um tamanho de 1 e a quantidade de pacientes com 0.
    public ListaPacientesDC() {
        this.pacientes = new Paciente[1];
        this.quantidadePacientes = 0;
    }

    // Métodos
    // Adiciona um paciente à lista de pacientes.
    // Se o vetor estiver cheio, ele é redimensionado.
    public void adicionarPaciente(Paciente paciente) {
        // Verifica se o vetor está cheio.
        if (quantidadePacientes == pacientes.length) {
            // Redimensiona o vetor.
            redimensionarVetor();
        }
        // Adiciona o paciente ao vetor.
        pacientes[quantidadePacientes] = paciente;
        // Incrementa a quantidade de pacientes.
        quantidadePacientes++;
    }

    // Remove um paciente da lista de pacientes.
    // O paciente é removido deslocando os demais pacientes uma posição para a esquerda.
    public void removerPaciente(Paciente paciente) {
        // Encontra o índice do paciente.
        int indice = encontrarIndice(paciente);

        // Se o índice for válido.
        if (indice != -1) {
            // Desloca os demais pacientes uma posição para a esquerda.
            for (int i = indice; i < quantidadePacientes - 1; i++) {
                pacientes[i] = pacientes[i + 1];
            }
            // Define o último elemento do vetor como nulo.
            pacientes[quantidadePacientes - 1] = null;
            // Decrementa a quantidade de pacientes.
            quantidadePacientes--;
        }
    }

    // Encontra o índice de um paciente no vetor.
    // O parâmetro paciente indica o paciente a ser encontrado.
    // O return indica o índice do paciente, ou -1 se o paciente não estiver presente no vetor.
    private int encontrarIndice(Paciente paciente) {
        // Itera sobre o vetor.
        for (int i = 0; i < quantidadePacientes; i++) {
            // Se o paciente for encontrado.
            if (pacientes[i].equals(paciente)) {
                // Retorna o índice.
                return i;
            }
        }
        // O paciente não foi encontrado.
        return -1;
    }

    // Redimensiona o vetor para um tamanho duas vezes maior.
    private void redimensionarVetor() {
        // Cria um novo vetor com o novo tamanho.
        int novoTamanho = pacientes.length * 2;
        Paciente[] vetor = new Paciente[novoTamanho];

        // Copia os elementos do vetor antigo para o novo vetor.
        for (int i = 0; i < quantidadePacientes; i++) {
            vetor[i] = pacientes[i];
        }
        // Substitui o vetor antigo pelo novo vetor.
        pacientes = vetor;
    }

    // Retorna o vetor de pacientes.
    public Paciente[] getListaPacientes() {
        return pacientes;
    }

    // Métodos getters
    // Retorna a quantidade de pacientes no vetor.
    public int getQuantidadePacientes() {
        return quantidadePacientes;
    }
}
