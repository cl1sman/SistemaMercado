package SistemaMercado;

public class SistemaMercado {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.addProduto();
        Produto produto2 = new Produto();
        produto2.addProduto();
        Produto produto3 = new Produto();
        produto3.addProduto();

        Carrinho joão = new Carrinho(); // Tamanho do vetor
        joão.addCarrinho(produto1);
        joão.addCarrinho(produto2);
        joão.addCarrinho(produto3);
        System.out.println(joão.valorTotal());
    }
}
