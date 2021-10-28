package SistemaMercado;

public class SistemaMercado {
    public static void main(String[] args) {
        // code
        Carrinho item1 = new Carrinho("Macarrão", 2, 2.5f);
        item1.getProduto();

        Carrinho item2 = new Carrinho("Feijão", 1, 5.38f);
        item2.getProduto();

        Operacoes resultado;

//        item1.setObjSoma(item1.getPrecoProduto());
//        item1.getObjSoma();
//
//        item2.setObjSoma(item1.getPrecoProduto());
//        item2.getObjSoma();
        item1.somaCarrinho(item1);
        item1.getObjSoma();
        item2.somaCarrinho(item2);
        item2.getObjSoma();

        resultado = new Operacoes();
        resultado.setSoma(item1.getPrecoProduto());
        resultado.setSoma(item2.getPrecoProduto());
        resultado.getSoma();
    }
}
