public class Paciente {
    private int codigo;
    private String nome;
    private String sexo;
    private double peso;
    private double altura;
    private int idade;  

    public Paciente(int codigo, String nome, String sexo, double peso, double altura, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
        idade = 0;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo.toUpperCase();
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean setPeso(double peso) {
        if (peso > 0 && peso <= 150) {
            this.peso = peso;
            return true;
        } else {
            return false;
        }
    }

    public double getAltura() {
        return altura;
    }

    public boolean setAltura(double altura) {
        if (altura > 0 && altura <= 2.5) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade > 0 && idade <= 120) {
            this.idade = idade;
            return true;
        } else {
            return false;
        }
    }

    public double calcularIMC() {
        return ((altura * altura) / peso);
    }

    public double calcularPesoIdeal() {
        if (sexo.equalsIgnoreCase("M")) {
            return ((72.7 * altura) - 58);
        } else {
            return ((62.1 * altura) - 44.7);
        }
    }

    public String toString() {
        return "Código do paciente: " + getCodigo() + "\nNome do paciente: " + getNome() + "\nSexo: " + getSexo() +
                "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nIdade: " + getIdade();
    }
}