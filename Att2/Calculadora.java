public class Calculadora{
    private int numeroA;
    private int NumeroB;

    public int getNumeroA(){return this.numeroA;}
    public void setNumeroA(int a){this.numeroA = a;}

    public int getNumeroB(){return this.NumeroB;}
    public void setNumeroB(int b){this.NumeroB = b;}

    public Calculadora(int a, int b){
        this.numeroA = a;
        this.numeroA = b;
    }

    public int soma(){
        return this.numeroA + this.NumeroB;
    }

    public int multiplicacao(){
        return this.numeroA * this.NumeroB;
    }

    public int divisao(){
        return this.numeroA / this.NumeroB;
    }

    public int subtracao(){
        return this.numeroA - this.NumeroB;
    }

}