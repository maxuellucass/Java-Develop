import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saque;

        double deposito;

        int opcao;

        Conta objConta = new Conta();

        // ---------------------------------------

        // -----------------MENU------------------

        // ---------------------------------------

        do {

            System.out.println("                 ");

            System.out.println("+--------------------------------+");
            System.out.println("+------------ MENU --------------+");
            System.out.println("+--------------------------------+");
            System.out.println("| 1º CADASTRAR CONTA             |");
            System.out.println("| 2º VER DADOS CADASTRADOS       |");
            System.out.println("| 3º DEPOSITAR                   |");
            System.out.println("| 4º SACAR                       |");
            System.out.println("| 5º SAIR                        |");
            System.out.println("+--------------------------------+");
            System.out.println("                                  ");

            System.out.println("Digite uma opção valida: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    objConta.cadastraConta();

                    break;

                case 2:

                    System.out.println(objConta.toString());

                    break;

                case 3:

                    System.out.println("Digite o valor que você quer depositar: ");

                    deposito = sc.nextDouble();

                    objConta.depositar(deposito);

                    break;

                case 4:

                    System.out.println("Digite o valor que você quer sacar: ");

                    saque = sc.nextDouble();

                    if (objConta.sacarVerifica(saque)) {

                        System.out.println("Saque concluido com sucesso!");

                    }

                    else {

                        System.out.println("Erro ao realizar saque");

                    }

                    break;

                default:

                    System.out.println("Digite uma opção valida");

                    break;

            }

        }

        while (opcao != 5);

        sc.close();

    }

}
