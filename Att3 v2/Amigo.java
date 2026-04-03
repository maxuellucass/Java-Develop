//SUBCLASSE HERDANDO PESSOA COMO CLASSE MÃE (PESSOA)
public class Amigo extends Pessoa{
    
    //VARIAVEIS
    private String diaDoAniversario;

    //CONSTRUTOR DA CLASSE
    public Amigo(){}

    public Amigo(String nome, char sexo, int idade, String diaDoAniversario){
        super(nome, sexo, idade); //INICIANDO CONSTRUTOR DA CLASSE MÃE (PESSOA)
        this.diaDoAniversario = diaDoAniversario;
    }

    //METODOS GET SET
    //GET SET DIA DO ANIVERSARIO
    public String getDiaDoAniversario(){return this.diaDoAniversario;}
    public void setDiaDoAniversario(String diaDoAniversario){this.diaDoAniversario = diaDoAniversario;}
}
