package SistemaMercado;

import java.util.Scanner;

class Carrinho extends Produto{ // tudo que esta em Produto, passa a estar disponivel em Carrinho
    Scanner scan = new Scanner(System.in);
    private int id;
    private  float soma;

    Carrinho(){}

    Carrinho(int tamanhoVetor){
        vetorProdutos = new Produto[tamanhoVetor]; // vai setar o tamanho do vetor
    }

    float valorTotal(){
//        float soma = 0;
        for (int i = 0; i < vetorProdutos.length; i++) {
//            soma += vetorProdutos[i].getValorTotalProduto();
            this.setSoma(getSoma() + vetorProdutos[i].getValorTotalProduto());
        }
        return this.getSoma();
    }

    void nota(){
        System.out.println("############ Nota ################");
        for (int i = 0; i < vetorProdutos.length; i++) {
            System.out.println("Produto: " + vetorProdutos[i].getNomeProduto());
        System.out.println("Quantidade de produtos: " + vetorProdutos[i].getQtoProduto());
            System.out.println("Valor unitario: " + vetorProdutos[i].getValorUnitario());
            System.out.println("Valor: " + vetorProdutos[i].getValorTotalProduto());
            System.out.println();
        }
        System.out.println("Valor total à pagar: " + getSoma());
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }
}