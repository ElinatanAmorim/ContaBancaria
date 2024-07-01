package br.ada.caixa.JavaCompleto.Construtor;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um produto");
        System.out.println("Nome Produto: ");
        String nome = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        System.out.println("Quantidade em Estoque: ");
        int quantidade = sc.nextInt();
        Product product = new Product(nome, preco, quantidade);

        System.out.println("Produto data: "+ product);

        System.out.println();
        System.out.println("Insira produtos ao estoque: ");
        quantidade= sc.nextInt();
        product.addProduto(quantidade);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Remova produtos do estoque: ");
        quantidade = sc.nextInt();
        product.removeProduto(quantidade);

        System.out.println();
        System.out.println("Updated data: " + product);

    }
}

