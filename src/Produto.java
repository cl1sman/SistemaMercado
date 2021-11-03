package SistemaMercado;

import java.util.Scanner;

public class Produto {
    // Atributos
    private String nomeProduto;
    private int qtoProduto;
    private float valorUnitario;
    private float valorTotalProduto;
    Produto vetorProdutos[]; // declaração do vetor

    Scanner scan = new Scanner(System.in);

    // Construtores
    public Produto() {
    }

    public Produto(String produto, int quantidade, float preco) {
        this.nomeProduto = produto;
        this.qtoProduto = quantidade;
        this.valorUnitario = preco;
        this.setValorTotalProduto();
    }

    // Modificadores Personalizados
    void addProduto(){

        for (int i = 0; i < vetorProdutos.length; i++) {
            System.out.println("Produto: ");
            String pro = scan.next();
            System.out.println("Quantidade: ");
            int qua = scan.nextInt();
            System.out.println("Preço: ");
            float pre = scan.nextFloat();
            vetorProdutos[i] = new Produto(pro, qua, pre);
        }
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

    public float getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto() {
        this.valorTotalProduto = getQtoProduto() * getValorUnitario();
    }
}