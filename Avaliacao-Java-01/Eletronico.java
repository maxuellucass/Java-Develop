public class Eletronico extends Produto {
  private int voltagem;
  private String fonteDeEnergia;

   public Eletronico(){}
    public Eletronico(int codigo, String descricao, int estoque, int voltagem, String fonteDeEnergia){
    super(codigo, descricao, estoque);
    this.voltagem = voltagem;
    this.fonteDeEnergia = fonteDeEnergia;
  }

  public int getVoltagem(){return this.voltagem;}
  public void setVoltagem(int voltagem){this.voltagem = voltagem;}

  public String getFonteEnergia(){return this.fonteDeEnergia;}
  public void setFonteEnergia(String fonteDeEnergia){this.fonteDeEnergia = fonteDeEnergia;}


  @Override
  public String toString(){
    return "Voltagem: "+ this.voltagem
    +" Fonte de Energia: "+ this.fonteDeEnergia;
  }
}