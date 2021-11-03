package SistemaMercado;

public class SistemaMercado {
    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho(2);
        carrinho1.addProduto();
        carrinho1.valorTotal();
        carrinho1.nota();
    }
}
