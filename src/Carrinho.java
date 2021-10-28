package SistemaMercado;

import java.util.Scanner;

class Carrinho{
    // Atributos
    Produto vetor[];

    public void setVetor(int x) {
        this.vetor = new Produto[x];
    }
    
    void addProduto(){
        Scanner scan = new Scanner(System.in);
        int continua = scan.nextInt();
        // -[] colocar produtos dentro do vetor
    }
}