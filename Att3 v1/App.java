import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // INICIANDO SCANNER PARA INPUTS
        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        Produto[] carrinhoProduto = new Produto[5];

        //PREENCHENDO NA MÃO OS VETORES
        carrinhoProduto[0] = new Livros("Dom Casmurro", 39.90, "Machado de Assis");
        carrinhoProduto[1] = new Livros("O Alquimista", 29.90, "Paulo Coelho");
        carrinhoProduto[2] = new Cds("Thriller", 49.90, 9);
        carrinhoProduto[3] = new Dvds("Como Treinar seu Dragão", 30.99, 1.30);
        carrinhoProduto[4] = new Dvds("Matrix", 77.87, 2.16);

        //MOSTRANDO ITENS PREENCHIDOS COM FOR
        for(int i = 0; i < carrinhoProduto.length; i++ ){
            System.out.println(carrinhoProduto[i].toString());
        }
        
        // REALIZANDO FECHAMENTO DO SCANNER
        sc.close();
    }
}