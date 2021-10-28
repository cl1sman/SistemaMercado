package SistemaMercado;

public class Produto {
    // Atributos
    private String produto;
    private int quantidadeDeProdutos;
    private float preço;

    // Construtores
    public Produto() {
    }

    public Produto(String produto, int quantidadeDeProdutos, float preço) {
        this.produto = produto;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
        this.preço = preço;
    }

    // Modificadores
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
}