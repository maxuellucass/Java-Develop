import java.util.Scanner;

public class Funcionario {
    
    public String strFuncionario;

    public String strDepartamento;

    public double doubleSalario;

    public String dtEntradaBanco;

    public String strRg;

    public boolean boolAtivoFunc;

    Scanner sc = new Scanner(System.in);

    public void ativoInativo(){
        if(this.boolAtivoFunc){
            System.out.println("Deseja realmente desativar o colaborador: "+ this.strFuncionario);
            this.boolAtivoFunc = false;
        }
        else{
            System.out.println("Deseja realmente desativar o colaborador: "+ this.strFuncionario);
           this.boolAtivoFunc = true;
        }
    }

    public void trocaDepartamento(){
        if (this.boolAtivoFunc) {
            System.out.println("Deseja trocar o funcionario: "+this.strFuncionario+", de departamento? (s/n)");
            String decisao = sc.nextLine();

            if(decisao == "s" || decisao == "SIM" || decisao == "sim" || decisao == "S"){
                System.out.println("Digite o departamento de destino do funcionario: ");
                this.strDepartamento = sc.nextLine();
            }
        }
        else{
            System.out.println("Esse funcionario não está ativo no momento!");
        }
    }

    public void bonifica(double bonificacao){
        if(boolAtivoFunc){
            System.out.println("Deseja bonificar o funcionario: "+this.doubleSalario+", com o aumento?");
            String decisao = sc.nextLine();
            if(decisao == "s" || decisao == "SIM" || decisao == "sim" || decisao == "S"){
                this.doubleSalario += bonificacao;
                System.out.println("Bonificacao concluida!, o funcionario: "+this.strFuncionario+", teve um aumento de: R$"+bonificacao+" no seu salario!");
            }
        }
        else{
            System.out.println("Esse funcionario não está ativo no momento!");
            
        }
    }


}
