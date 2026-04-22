public class Produto {
  private int codigo;
  private String descricao;
  private int estoque;

  public Produto(){}
  public Produto(int codigo, String descricao, int estoque){
    this.codigo = codigo;
    this.descricao = descricao;
    this.estoque = estoque;
  }

  public int getCodigo(){return this.codigo;}
  public void setCodigo(int codigo){this.codigo = codigo;}

  public String getDescricao(){return this.descricao;}
  public void setDescricao(String descricao){this.descricao = descricao;}

  public int geEstoque(){return this.estoque;}
  public void setEstoque(int estoque){this.estoque = estoque;}

  @Override

  public String toString(){
    return "Codigo: "+ this.codigo
    + "descricao: "+ this.descricao
    + "estoque: "+ this.estoque;
  }
}

