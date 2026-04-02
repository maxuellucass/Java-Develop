//INICIANDO CONSTRUTOR DA CLASSE MÃE (PRODUTO)
public class Dvds extends Produto{
    //VARIAVEIS
    private double duracao;

    //CONSTRUTOR DA CLASSE
    public Dvds(){}

    public Dvds(String nome, double preco, double duracao){
        super(nome, preco); //INICIANDO CONSTRUTOR DA CLASSE MÃE (PRODUTO)
        this.duracao = duracao;
    }

    //METODOS GET SET
    //GET SET DURAÇÃO
    public double getDuracao(){return this.duracao;}
    public void setDuracao(double duracao){this.duracao = duracao;}


    //METODO SOBREESCRITO PARA IMPRIMIR MENSAGEM DESEJADA
    public String toString(){
        return "| Nome: " + super.getNome() +
            " | Preço: R$" + super.getPreco() +
            " | Duração: " + this.duracao;
    }

}