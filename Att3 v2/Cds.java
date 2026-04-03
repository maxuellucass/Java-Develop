//SUBCLASSE HERDANDO PESSOA COMO CLASSE MÃE (PRODUTO)
public class Cds extends Produto {
    //VARIAVEIS
    private int numeroFaixas;

    //CONSTRUTOR DA CLASSE
    public Cds(){}

    public Cds(String nome, double preco, String codigoBarras, int numeroFaixas){
        super(nome, preco, codigoBarras); //INICIANDO CONSTRUTOR DA CLASSE MÃE (PRODUTO)
        this.numeroFaixas = numeroFaixas;
    }

    //METODOS GET SET
    //GET SET NUMERO DE FAIXAS
    public int getNumeroFaixas(){return this.numeroFaixas;}
    public void setNumeroFaixas(int numeroFaixas){this.numeroFaixas = numeroFaixas;}

    //METODO SOBREESCRITO PARA IMPRIMIR MENSAGEM DESEJADA
    public String toString(){
        return "| Nome: " + super.getNome() +
            " | Preço: R$" + super.getPreco() +
            " | Codigo de Barras: " + super.getCodigoBarras() +
            " | Numero de Faixas: " + this.numeroFaixas;
    }
}
