import java.util.Scanner;

public class App {
        
    public static void main(){
     Scanner sc = new Scanner(System.in);
     int opcao;
        

        do{

        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int B = sc.nextInt();

        Calculadora objCalculadora = new Calculadora(A, B);

        System.out.println("+----- MENU DE OPÇÕES -----+");
        System.out.println("| 1º Somar                 |");
        System.out.println("| 2º Subtrair              |");
        System.out.println("| 3º Multiplicar           |");
        System.out.println("| 4º Subtração             |");
        System.out.println("| 5º Sair                  |");
        System.out.println("+--------------------------+");
        System.out.println("");
        System.out.println("Digite uma opção valida: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(objCalculadora.soma());
                    
                break;
            case 2:
                    System.out.println(objCalculadora.subtracao());
                    break;
            case 3:
                    System.out.println(objCalculadora.multiplicacao());
                    break;
            case 4:
                    System.out.println(objCalculadora.subtracao());
                    break;
            default:
                    System.out.println("");
                    System.out.println("DIGITE UMA OPÇÃO VALIDA!!!");
                break;
        }

        System.out.println("");
        System.out.println("");

    }while (opcao != 5);

        sc.close();
    }
}
    