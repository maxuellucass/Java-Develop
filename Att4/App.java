public class App {
    public static void main(String[] args) throws Exception {
       Animal animais[] = new Animal[10];

       Animal doguinho = new Animal("Doguinho", 3, 5.5, 0);

       animais[0] = doguinho;

        Peixe beta = new Peixe("Betinha", 2, 5, 2, 2);
        animais[1] = new Peixe();
        animais[1] = beta;
        
        Ave canarinho = new Ave("Canario da copa", 2, 7, 5);
        animais[2] = new Ave();
        animais[2] = canarinho;

        for (Animal a : animais) {
            a.mover();            
        } 
    }
}