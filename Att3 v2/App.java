import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // INICIANDO SCANNER PARA INPUTS
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        Produto[] carrinhoProduto = new Produto[7];
        String codigoBarrasPesquisa;

        // PREENCHENDO NA MÃO OS VETORES
        carrinhoProduto[0] = new Livros("Dom Casmurro", 39.90, "1000000", "Machado de Assis");
        carrinhoProduto[1] = new Livros("O Alquimista", 29.90, "1000001", "Paulo Coelho");
        carrinhoProduto[2] = new Cds("Thriller", 49.90, "1000002", 9);
        carrinhoProduto[3] = new Dvds("Como Treinar seu Dragão", 30.99, "1000003", 1.30);
        carrinhoProduto[4] = new Dvds("Matrix", 77.87, "1000004", 2.16);

        // MOSTRANDO ITENS PREENCHIDOS COM FOR
        for (int i = 0; i < 5; i++) {
            System.out.println(carrinhoProduto[i].toString());
        }

        //CRIANDO DUAS NOVAS INSTANCIAS
        //COM O MESMO CODIGO DE BARRAS
        carrinhoProduto[5] = new Dvds("Como Treinar seu Dragão 2", 30.99, "1000003", 1.30);

        //COM O CODIGO DE BARRAS DIFERENTE 
        carrinhoProduto[6] = new Dvds("Como Treinar seu Dragão 3", 30.99, "1000005", 1.30);
        

        // PROCURANDO PRODUTOS POR CÓDIGO DE BARRAS
        System.out.println("");
        System.out.println("Digite o código de barras do produto: ");
        codigoBarrasPesquisa = sc.nextLine();

        //REALIZANDO BUSCA PELO VETOR 
        boolean achado = false;
        for(int i = 0; i < carrinhoProduto.length; i++ ){
            if(codigoBarrasPesquisa.equals(carrinhoProduto[i].getCodigoBarras())){
                System.out.println("Produto encontrado!");
                System.out.println("O produto que você digitou é: "+ carrinhoProduto[i].toString());   
                System.out.println("Ele está na posição: "+ i);                
                achado = true;
            }
        }
        if(!achado){
            System.out.println("Produto não encontrado!");
        }

        //TESTANDO O METODO EQUALS
        System.out.println("Testando retorno do metodo equals sobreescrito");

        //INICIANDO NOVA CLASSE
        Produto objteste = new Livros("Livro teste",45.99, "1000001", "Lucas Maxuel" );

        boolean teste = carrinhoProduto[1].equals(objteste);
        System.out.println("O retorno diz que é: " + teste);

        // REALIZANDO FECHAMENTO DO SCANNER
        sc.close();
    }
}