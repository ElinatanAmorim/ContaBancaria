package br.ada.caixa.JavaCompleto.POO;

import br.ada.caixa.JavaCompleto.POO.Classes.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Insira um produto");
        System.out.println("Nome Produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade em Estoque: ");
        produto.qtd = sc.nextInt();

        System.out.println("Produto data: "+ produto);

        System.out.println();
        System.out.println("Insira produtos ao estoque: ");
        int qtd = sc.nextInt();
        produto.addProduto(qtd);

        System.out.println();
        System.out.println("Updated data: " + produto);

        System.out.println();
        System.out.println("Remova produtos do estoque: ");
        qtd = sc.nextInt();
        produto.removeProduto(qtd);

        System.out.println();
        System.out.println("Updated data: " + produto);

    }

}
