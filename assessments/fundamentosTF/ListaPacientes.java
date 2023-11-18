public class ListaPacientes {
    private Paciente[] pacientes;
    private int quantidadePacientes;

    public ListaPacientes() {
        this.pacientes = new Paciente[1];
        this.quantidadePacientes = 0;
    }

    public void adicionarPaciente(Paciente paciente) {
        if (quantidadePacientes == pacientes.length) {
            redimensionarVetor();
        }
        pacientes[quantidadePacientes] = paciente;
        quantidadePacientes++;
    }

    public void removerPaciente(Paciente paciente) {
        int indice = encontrarIndice(paciente);

        if (indice != -1) {
            for (int i = indice; i < quantidadePacientes - 1; i++) {
                pacientes[i] = pacientes[i + 1];
            }
            pacientes[quantidadePacientes - 1] = null;
            quantidadePacientes--;
        }
    }

    private int encontrarIndice(Paciente paciente) {
        for (int i = 0; i < quantidadePacientes; i++) {
            if (pacientes[i].equals(paciente)) {
                return i;
            }
        }
        return -1;
    }

    private void redimensionarVetor() {
        int novoTamanho = pacientes.length * 2;
        Paciente[] vetor = new Paciente[novoTamanho];
        for (int i = 0; i < quantidadePacientes; i++) {
            vetor[i] = pacientes[i];
        }
        pacientes = vetor;
    }

    public Paciente[] getListaPacientes() {
        return pacientes;
    }

    public int getQuantidadePacientes() {
        return quantidadePacientes;
    }
}
