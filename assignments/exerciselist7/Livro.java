public class Livro {
    private String titulo;
    private String autores;
    private int anoPublic;
    private int codigo;

    public Livro (String titulo, String autores, int anoPublic, int codigo) {
        this.titulo = titulo;
        this.autores = autores;
        this.anoPublic = anoPublic;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return ("Codigo: " + codigo + "\nTitulo: " + titulo + "\nAno de publicação: " + anoPublic + "\nAutores: " + autores);
    }

}
