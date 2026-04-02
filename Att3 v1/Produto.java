public class Produto{
    //VARIAVEIS
    private String nome;
    private double preco;

    //CONSTRUTOR DA CLASSE
    public Produto(){}

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //METODOS GET SET
    //GET SET NOME
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    //GET SET PRECO
    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}
}