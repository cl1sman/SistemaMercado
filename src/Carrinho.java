package SistemaMercado;

import java.util.Scanner;

class Carrinho extends Produto{ // tudo que esta em Produto, passa a estar disponivel em Carrinho
    private int id;
    float valorTotal = 0;
    float objSoma = 0;
    Produto vetorProdutos[]; // declaração do
    Scanner scan = new Scanner(System.in);
    static int index = 0;

    Carrinho(){
        vetorProdutos = new Produto[getTamanhoVetor()];
    }

    void addCarrinho(Produto x){
        index++;
        vetorProdutos[getIndex()] = x;
    }

    float valorTotal(){
        float soma = 0;
        for (int i = 0; i < vetorProdutos.length; i++) {
            soma += vetorProdutos[i].getPrecoProduto();
        }
        return soma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getObjSoma() {
        return objSoma;
    }

    public void setObjSoma(float objSoma) {
        this.objSoma = objSoma;
    }

    public Produto[] getVetorProdutos() {
        return vetorProdutos;
    }

    public void setVetorProdutos(Produto[] vetorProdutos) {
        this.vetorProdutos = vetorProdutos;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}