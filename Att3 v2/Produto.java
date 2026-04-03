public class Produto{
    //VARIAVEIS
    private String nome;
    private double preco;
    private String codigoBarras;

    //CONSTRUTOR DA CLASSE
    public Produto(){}

    public Produto(String nome, double preco, String codigoBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    //METODOS GET SET
    //GET SET NOME
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    //GET SET PRECO
    public double getPreco(){return this.preco;}
    public void setPreco(double preco){this.preco = preco;}

    //GET SET CODIGO DE BARRAS
    public String getCodigoBarras(){return this.codigoBarras;}
    public void setCodigoBarras(String codigoBarras){this.codigoBarras = codigoBarras;}

    //METODOS DA CLASSE
    // public boolean equals(Produto[] listaCodigoBarras){
    //     boolean igual = false;

    //     /*O FOR FUNCIONA DA SEGUINTE FORMA, PEGAMOS A POSIÇÃO DO VETOR QUE QUEREMOS VERIFICAR COM OUTRAS
    //     EM SEGUIDA FAZEMOS OUTRO FOR PARA ANDAR PELAS OUTRAS POSIÇÕES DO VETOR, ENTÃO VERIFICAMOS SE 
    //     O CODIGO DE BARRAS DO PRIMEIRO FOR É IGUAL AO SEGUNDO QUE ESTÁ PASSANDO PELAS OUTRAS POSIÇÕES DO VETOR
    //     MAS PARA ISSO TAMBÉM COMPARAMOS SE O NOME DO PRODUTO É IGUAL, POIS SE O NOME FOR IDENTICO ENTÃO O FOR ESTÁ 
    //     PASSANDO PELO MESMO PRODUTO, JÁ QUE O OBJETIVO É SABER SE EXISTE PRODUTOS DIFERENTES MAS COM O MESMO CODIGO.
    //     */

    //     for(int i = 0; i < listaCodigoBarras.length; i++){
    //         for(int u = 0; u < listaCodigoBarras.length; u++){
    //             if(listaCodigoBarras[i].codigoBarras == listaCodigoBarras[u].codigoBarras && listaCodigoBarras[i].nome.equals(listaCodigoBarras[u].nome) == false){
    //                 System.out.println("Existe produtos diferentes mas com o mesmo codigo de barras!");
    //                 System.out.println(listaCodigoBarras[i].toString());
    //                 System.out.println(listaCodigoBarras[u]);
    //                 igual = true;
    //             }
    //         }
    //     }

    //     return igual;
    // }

        public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Produto)) return false;

        Produto outro = (Produto) obj;
        return this.codigoBarras.equals(outro.codigoBarras);
    }
}