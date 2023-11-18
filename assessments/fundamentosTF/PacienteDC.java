public class PacienteDC {

    // Atributos da classe Paciente
    private int codigo;
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    private int idade;

    // Construtor da classe Paciente
    public PacienteDC(int codigo, String nome, char sexo, double peso, double altura, int idade) {
        // Inicializa os atributos da classe com os valores passados como parâmetros
        this.codigo = codigo;
        setNome(nome);
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
        setIdade(idade);
    }

    // Método para definir o nome do paciente
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            // Define o nome se não for nulo ou vazio
            this.nome = nome;
        } else {
            // Exibe mensagem de erro se o nome for nulo ou vazio
            System.out.println("Nome não pode ser nulo ou vazio");
        }
    }

    // Método para definir o sexo do paciente
    public void setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            // Define o sexo se for 'F' (feminino) ou 'M' (masculino)
            this.sexo = sexo;
        } else {
            // Exibe mensagem de erro se o sexo não for 'F' ou 'M'
            System.out.println("Sexo deve ser F ou M");
        }
    }

    // Método para definir o peso do paciente
    public void setPeso(double peso) {
        if (peso > 0 && peso <= 150) {
            // Define o peso se estiver no intervalo (0, 150]
            this.peso = peso;
        } else {
            // Exibe mensagem de erro se o peso não estiver no intervalo permitido
            System.out.println("Peso deve estar no intervalo (0, 150]");
        }
    }

    // Método para definir a altura do paciente
    public void setAltura(double altura) {
        if (altura > 0 && altura <= 2.5) {
            // Define a altura se estiver no intervalo (0, 2.5]
            this.altura = altura;
        } else {
            // Exibe mensagem de erro se a altura não estiver no intervalo permitido
            System.out.println("Altura deve estar no intervalo (0, 2.5]");
        }
    }

    // Método para definir a idade do paciente
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            // Define a idade se estiver no intervalo [0, 120]
            this.idade = idade;
        } else {
            // Exibe mensagem de erro se a idade não estiver no intervalo permitido
            System.out.println("Idade deve estar no intervalo [0, 120]");
        }
    }

    // Método para obter o código do paciente
    public int getCodigo() {
        return codigo;
    }

    // Método para obter o nome do paciente
    public String getNome() {
        return nome;
    }

    // Método para obter o sexo do paciente
    public char getSexo() {
        return sexo;
    }

    // Método para obter o peso do paciente
    public double getPeso() {
        return peso;
    }

    // Método para obter a altura do paciente
    public double getAltura() {
        return altura;
    }

    // Método para obter a idade do paciente
    public int getIdade() {
        return idade;
    }

    // Método estático para calcular o Índice de Massa Corporal (IMC) de um paciente
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método estático para calcular o peso ideal de um paciente com base no sexo e altura
    public static double calcularPesoIdeal(char sexo, double altura) {
        if (sexo == 'M') {
            // Fórmula para peso ideal para homens
            return 72.7 * altura - 58;
        } else {
            // Fórmula para peso ideal para mulheres
            return 62.1 * altura - 44.7;
        }
    }

    // Método para representar o objeto Paciente como uma string
    public String toString() {
        return "Código do paciente: " + codigo + "\nNome do paciente: " + nome + "\nSexo:" + sexo + "\nPeso: " + peso + "\nAltura: "
                + altura + "\nIdade: " + idade;
    }
}
