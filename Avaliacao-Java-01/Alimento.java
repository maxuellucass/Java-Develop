public class Alimento extends Produto{
  private boolean perecivel;
  private String validade;

  public Alimento(){}
  public Alimento(int codigo, String descricao, int estoque, boolean perecivel, String validade){
    super(codigo, descricao, estoque);
    this.perecivel = perecivel;
    this.validade = validade;
  }

  public boolean getPerecivel(){return this.perecivel;}
  public void setPerecivel(boolean perecivel){this.perecivel = perecivel;}

  public String getValidade(){return this.validade;}
  public void setValidade(String validade){this.validade = validade;}

  @Override
  public String toString(){
    return "Produto é perecivel: " + (this.perecivel ? "SIM!" : "NÃO") +
    " Validade: "+ this.validade;
  }   
}
