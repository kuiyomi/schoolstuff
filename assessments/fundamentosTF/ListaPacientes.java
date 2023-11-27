public class ListaPacientes {
    private Paciente[] pacientes;
    private int proximoIndice;

    public ListaPacientes(int tamanho) {
        pacientes = new Paciente[tamanho];
        proximoIndice = 0;
    }

    public Paciente consultaPacientePorNome(String nome) {
        for (int i = 0; i < proximoIndice; i++) {
            if (pacientes[i].getNome().equalsIgnoreCase(nome)) {
                return pacientes[i];
            }
        }
        return null;
    }

    public Paciente consultaPacientePorCodigo(int codigo) {
        for (int i = 0; i < proximoIndice; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                return pacientes[i];
            }
        }
        return null;
    }

    public void listaPacientesAcimaIdade(int idade) {
        for (int i = 0; i < proximoIndice; i++) {
            if (lista[i].getIdade() > idade) {
                System.out.println("Paciente[ " + (i+1) + " ]:\n" + lista[i]);
	        } else {
                System.out.println("Nenhum paciente encontrado");
	        }
        }
	}

    public boolean cadastraPaciente(Paciente paciente) {
        if (proximoIndice == 0) {
            pacientes[proximoIndice] = paciente;
            proximoIndice++;
            return true;
        } else {
            for (int i = 0; i < proximoIndice; i++) {
                if (pacientes[i].getCodigo() == paciente.getCodigo() || pacientes[i].getNome().equalsIgnoreCase(paciente.getNome()));
                    return false;
            }
            pacientes[proximoIndice] = paciente;
            proximoIndice++;
            return true;
        }
    }

    public boolean alteraPeso(int codigo, double peso) {
        if (proximoIndice == 0) {
            return false;
        } else {
            for (int i = 0; i < proximoIndice; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    pacientes[i].setPeso(peso);
                    return true;
                }
            }
            return false;
        }
    }

    public boolean alteraAltura(int codigo, double altura) {
        if (proximoIndice == 0) {
            return false;
        } else {
            for (int i = 0; i < proximoIndice; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    pacientes[i].setAltura(altura);
                }
            }
            return false;
        }
    }

    public boolean alteraSexo(int codigo, String genero) {
        if (proximoIndice == 0) {
            return false;
        } else {
            for (int i = 0; i < proximoIndice; i++) {
                if (pacientes[i].getCodigo() == codigo) {
                    pacientes[i].setGenero(genero);
                    return true;
                }
            }
            return false;
        }
    }

    public double mostraIMC(int codigo) {
        for (int i = 0; i <proximoIndice; i++) {
            if (pacientes[i].getCodigo() == codigo) {
                return pacientes[i].calculaIMC();
            }
        }
        return 0;
    }
}
