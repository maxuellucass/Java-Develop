//SUBCLASSE HERDANDO PESSOA COMO CLASSE MÃE (PRODUTO)
public class Livros extends Produto {
    //VARIAVEIS
    private String autor;

    //CONSTRUTOR DA CLASSE
    public Livros(){}

    public Livros(String nome, double preco, String codigoBarras, String autor){
        super(nome, preco, codigoBarras); //INICIANDO CONSTRUTOR DA CLASSE MÃE (PRODUTO)
        this.autor = autor;
    }

    //METODOS GET SET
    //GET SET AUTOR
    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    //METODO SOBREESCRITO PARA IMPRIMIR MENSAGEM DESEJADA
    public String toString(){
        return "| Nome: " + super.getNome() +
            " | Preço: R$" + super.getPreco() +
            " | Codigo de Barras: " + super.getCodigoBarras() +
            " | Autor: " + this.autor;
    }
}
