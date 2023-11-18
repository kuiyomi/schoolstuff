public class Paciente {

    private int codigo;
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    private int idade;

    public Paciente(int codigo, String nome, char sexo, double peso, double altura, int idade) {
        this.codigo = codigo;
        setNome(nome);
        setSexo(sexo);
        setPeso(peso);
        setAltura(altura);
        setIdade(idade);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode ser nulo ou vazio");
        }
    }

    public void setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo deve ser F ou M");
        }
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso <= 150) {
            this.peso = peso;
        } else {
            System.out.println("Peso deve estar no intervalo (0, 150]");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura <= 2.5) {
            this.altura = altura;
        } else {
            System.out.println("Altura deve estar no intervalo (0, 2.5]");
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade deve estar no intervalo [0, 120]");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(char sexo, double altura) {
        if (sexo == 'M') {
            return 72.7 * altura - 58;
        } else {
            return 62.1 * altura - 44.7;
        }
    }

    public String toString() {
        return "Paciente [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + ", altura="
                + altura + ", idade=" + idade + "]";
    }
}
