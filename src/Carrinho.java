package SistemaMercado;

class Carrinho extends Produto{ // tudo que esta em Produto, passa a estar disponivel em Carrinho
    float objSoma = 0;
    Carrinho(){

    }
    Carrinho(String nome, int quantidade, float preco){
        addProduto(nome, quantidade, preco);
    }

    void somaCarrinho(Produto x){
        setObjSoma(getObjSoma() + x.getPrecoProduto());
    }

    public float getObjSoma() {
        return objSoma;
    }

    public void setObjSoma(float objSoma) {
        this.objSoma = objSoma;
    }
}