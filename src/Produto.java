package SistemaMercado;

public class Produto {
    // Atributos
    private String nomeProduto;
    private int qtoProduto;
    private float precoProduto;

    // Construtores
    public Produto() {
    }

    public Produto(String produto, int quantidade, float preco) {
        this.nomeProduto = produto;
        this.qtoProduto = quantidade;
        this.precoProduto = preco;
    }

    // Modificadores Personalizados
    void addProduto(String nome, int qtos, float price){
        this.nomeProduto = nome;
        this.qtoProduto = qtos;
        this.precoProduto = price;
    }
    void getProduto(){
        System.out.println(this.getNomeProduto());
        System.out.println(this.getQtoProduto());
        System.out.println(this.getPrecoProduto());
    }

    // Modificadores de Acesso

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtoProduto() {
        return qtoProduto;
    }

    public void setQtoProduto(int qtoProduto) {
        this.qtoProduto = qtoProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
}