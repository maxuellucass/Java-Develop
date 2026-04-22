public class App {

  public static void main(String[] args) {

    Eletronico produto1 = new Eletronico(01, "teclado gamer", 5, 110, "Eletrica");
    Eletronico produto2 = new Eletronico(02, "mouse gamer", 4, 110, "Nuclear");
    Eletronico produto3 = new Eletronico(03, "monitor ultra", 3, 110, "Solar");

    Alimento produto4 = new Alimento(04, "Maçã colhidas no verão", 10, true, "10/10/2026");
    Alimento produto5 = new Alimento(05, "Pão da padaria do mercado", 15, true, "10/06/2026");
    Alimento produto6 = new Alimento(06, "Coca melhor que pepsi", 11, false, "--/--/----");

    Venda venda01 = new Venda(0001, "Lionel Messi", produto3);
    Venda venda02 = new Venda(0002, "Bruno Henrique", produto6);
    Venda venda03 = new Venda(0003, "Roberto Carlos", produto5);
    Venda venda04 = new Venda(0004, "Romarinho", produto4);
    Venda venda05 = new Venda(0005, "Rodinei Idolo", produto2);

    System.out.println(venda01.toString());
    System.out.println(venda02.toString());
    System.out.println(venda03.toString());
    System.out.println(venda04.toString());
    System.out.println(venda05.toString());
  }

}