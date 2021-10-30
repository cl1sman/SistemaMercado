package SistemaMercado;

import java.util.Scanner;

public class Produto {
    // Atributos
    private String nomeProduto;
    private int qtoProduto;
    private float precoProduto;
    Produto vetorProdutos[]; // declaração do vetor
    static int tamanhoVetor = 0;

    // Construtores
    public Produto() {
    }

    public Produto(String produto, int quantidade, float preco) {
        this.nomeProduto = produto;
        this.qtoProduto = quantidade;
        this.precoProduto = preco;
    }

    // Modificadores Personalizados
    void addProduto(){
        tamanhoVetor++; // Tamanho do vetor
        Scanner scan = new Scanner(System.in);

        System.out.println("ID produto: ");
        setNomeProduto(scan.next());

        System.out.println("Quantidade: ");
        setQtoProduto(scan.nextInt());

        System.out.println("Preço: ");
        setPrecoProduto(scan.nextFloat());
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

    public Produto[] getVetorProdutos() {
        return vetorProdutos;
    }

    public void setVetorProdutos(Produto[] vetorProdutos) {
        this.vetorProdutos = vetorProdutos;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }

    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }
}