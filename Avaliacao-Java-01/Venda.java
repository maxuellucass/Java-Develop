public class Venda {
  private int notaFiscal;
  private String nomeCliente;
  private Produto produto;

  public Venda(){}
  public Venda(int notaFiscal, String nomeCliente, Produto produto){
    this.notaFiscal = notaFiscal;
    this.nomeCliente = nomeCliente;
    this.produto = produto;
  }
  
  public int getNotaFiscal(){return this.notaFiscal;}
  public void setNotaFiscal(int notaFiscal){this.notaFiscal = notaFiscal;}

  public String getNomeCliente(){return this.nomeCliente;}
  public void setNomeCliente(String nomeCliente){this.nomeCliente = nomeCliente;}

  public Produto getProduto(){return this.produto;}
  public void setProduto(Produto produto){this.produto = produto;}

  @Override
  public String toString(){
    return "Nota Fiscal: " + this.notaFiscal
    + " Nome Cliente: "+ this.nomeCliente
    + " Produto: " + this.produto.toString();
  }
}