public class Pessoa {
    
    //VARIAVEIS
    private String nome;
    private char sexo;
    private int idade;

    //CONSTRUTOR DA CLASSE
    public Pessoa(){}

    public Pessoa(String nome, char sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    //METODOS GET SET

    //GET SET NOME
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    //GET SET SEXO
    public char getSexo(){return this.sexo;}    
    public void setSexo(char sexo){this.sexo = sexo;}

    //GET SET IDADE
    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade = idade;}

        


}
