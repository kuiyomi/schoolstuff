package Livros;
public class listaLivros
{
    private Livro [] acervo;
    private int proximoIndice;

    public listaLivros(int tamanho) {
        acervo = new Livro[tamanho];
        proximoIndice = 0;
    }

    public boolean cadastraLivro(Livro l) {
        
        if (proximoIndice==0){
            acervo[proximoIndice] = l;
            proximoIndice++;
            return true;
        }
        else {
            for (int i=0;i<proximoIndice;i++){
                if (acervo[i].getCodigo()==l.getCodigo())
                    return false;    
            }
            acervo[proximoIndice] = l;
            proximoIndice++;
            return true;
        }
    }
    
    public Livro buscaLivroPorCodigo(int codigo) {        
        for (int i=0;i<proximoIndice;i++){
            if (acervo[i].getCodigo()==codigo)
                return acervo[i];
        }
        return null;
    }
    
    public Livro buscaLivroPorAutor(String autor) {        
        for (int i=0;i<proximoIndice;i++){
            if (acervo[i].getAutores().equalsIgnoreCase(autor))
                return acervo[i];
        }
        return null;
    }
    
    public boolean excluiLivro(int codigo) {
        if (proximoIndice==0){
            return false;
        }
        else
        {
            for (int i=0;i<proximoIndice;i++){
                if (acervo[i].getCodigo()==codigo) {
                    acervo[i] = null;
                    return true;
                }
            }
            return false;
        }
    }
    
    public String toString() {
        String saida="";
        for (int i=0;i<proximoIndice;i++){
            saida = saida + acervo[i];
        }
        return saida;
    }
   
}
