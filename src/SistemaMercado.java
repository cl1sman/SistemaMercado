package SistemaMercado;

import java.util.Scanner;

public class SistemaMercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de produtos:");
        int x = scan.nextInt();
        if (x < 1){
            System.out.println("Informe uma quantidade valida");
        }
        Carrinho carrinho1 = new Carrinho(x);
        carrinho1.addProduto();
        carrinho1.valorTotal();
        carrinho1.nota();
    }
}
