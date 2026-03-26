
import java.util.Scanner;

public class Conta {

    //#region Variaveis

    private double  saldo ;

    private  String nome;

    private  int numero;

    private  double limite;

    Scanner sc = new Scanner(System.in);

    //#endregion

    //#region GET SET

    //#region GET/SET NOME

    public void setNome(String nome){
        if(nome != null && nome.length() > 1){
            this.nome = nome;
        }
    }

    public String getNome(){
        return this.nome;
    }

    //#endregion

    //#region GET/SET SALDO

    public void setSaldo(double saldo){
        if(saldo > 0){
            this.saldo = saldo;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    //#endregion
    
    //#region GET/SET NUMERO

    public void setNumero(int numero){
        if(numero > 0){
            this.numero = numero;
        }
    }

    public int getNumero(){
        return this.numero;
    }

    //#endregion

    //#region GET/SET LIMITE
    public void setLimite(double limite){
        if(limite > 0){
            this.limite = limite;
        }
    }

    public double getLimite(){
        return this.limite;
    }

    //#endregion
  
    //#region Funcoes Sistema

    public void cadastraConta() {

        System.out.println("");

        System.out.println("+-----------------------------+");
        System.out.println(" Digite o seu nome de usuario: ");
        this.nome = sc.nextLine();
        this.setNome(nome);
        System.out.println("+-----------------------------+");
        System.out.println("");
        System.out.println("+-----------------------------+");
        System.out.println(" Digite o numero da conta:     ");
        this.numero = sc.nextInt();
        this.setNumero(numero);
        System.out.println("+-----------------------------+");
        System.out.println("");
        System.out.println("+-----------------------------+");
        System.out.println(" Digite o saldo da conta:      ");
        this.saldo = sc.nextDouble();
        this.setSaldo(saldo);
        System.out.println("+-----------------------------+");
        System.out.println("");
        System.out.println("+-----------------------------+");
        System.out.println(" Digite o limite da conta:     ");
        this.limite = sc.nextDouble();
        this.setLimite(limite);
        System.out.println("+-----------------------------+");
        System.out.println("");
        System.out.println("+------------------------------+");
        System.out.println("| CONTA CADASTRADA COM SUCESSO |");
        System.out.println("+------------------------------+");

    }

    public void saque(double valor) {

        if (saldo >= valor && valor > 0) {

            this.saldo -= valor;

            System.out.println("Saque efetuado com sucesso!");

        }

        else {

            System.out.println("Saldo insuficiente ou valor inválido");

        }

        System.out.println("Seu saldo atual: R$" + this.saldo);

    }

    boolean sacarVerifica(double quantidade) {

        if (quantidade > saldo && quantidade <= 0) {
            return false;
        }

        else {
            this.saldo -= quantidade;
            return true;

        }

    }

    public void depositar(double valor) {

        if (valor < 0) {
            System.out.println("Erro, digite um valor maior que R$ 0,00");
        }
        else {
            this.saldo += valor;
            System.out.println("Deposito concluido com sucesso!");
        }

    }

    public String toString() {
        return "Nome: " + this.getNome()
                + "| Num.: " + this.getNumero()
                + "| Saldo: " + this.getSaldo()
                + "| Limite: " + this.getLimite();
    }

    //#endregion




}