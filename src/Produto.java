package SistemaMercado;

import java.util.Scanner;

public class Produto {
    // Atributos
    private String nomeProduto;
    private int qtoProduto;
    private float valorUnitario;
    private float precoProduto;
    Produto vetorProdutos[]; // declaração do vetor
    static int tamanhoVetor = 0;

    // Construtores
    public Produto() {
    }

    public Produto(String produto, int quantidade, float preco) {
        this.nomeProduto = produto;
        this.qtoProduto = quantidade;
        this.valorUnitario = preco;
    }

    // Modificadores Personalizados
    void addProduto(){
        tamanhoVetor++; // Tamanho do vetor
        int answer = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("ID produto: ");
        setNomeProduto(scan.next());

        System.out.println("Quantidade: ");
        setQtoProduto(scan.nextInt());

        System.out.println("Preço: ");
        setValorUnitario(scan.nextFloat());
        setPrecoProduto(getValorUnitario() * getQtoProduto());

        System.out.println("Produto em desconto? 1-sim 0-não");
        answer = scan.nextInt();
        if(answer == 1){
            Float a = null;
            System.out.println("Informe o valor do desconto: ");
            a = scan.nextFloat();
            Descontos cliente = new Descontos(getPrecoProduto(), a);
            setPrecoProduto(cliente.desconto());
        }
    }
    void getProduto(){
        System.out.println(this.getNomeProduto());
        System.out.println(this.getQtoProduto());
        System.out.println(this.getValorUnitario());
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

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
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

    public float getPrecoProduto() {
        return precoProduto;
    }
    
    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
}