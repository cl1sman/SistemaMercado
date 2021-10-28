package SistemaMercado;

import java.util.Scanner;

class Carrinho{
    // Atributos
    Produto vetor[];
    Produto item = new Produto();

    public Carrinho() {
    }
    public Carrinho(int x){
        setVetor(x);
    }

    // Métodos de acesso
    public void setVetor(int x) {
        this.vetor = new Produto[x];
    }
    
    void addProduto(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            String nomeProduto = scan.next();
            this.item.setProduto(nomeProduto);
            int quantosProdutos = scan.nextInt();
            this.item.setQuantidadeDeProdutos(quantosProdutos);
            float preço = scan.nextFloat();
            this.item.setPreço(preço);

            vetor[i] = item;
        }
    }
    float somarProdutos(Produto vet){
        Produto vetorSoma = new Produto();
        for (int i = 0; i < x; i++) {

        }
    }
}