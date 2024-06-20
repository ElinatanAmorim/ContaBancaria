package br.ada.caixa.JavaCompleto.geteset;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um produto");
        System.out.println("Nome Produto: ");
        String name = sc.nextLine();
        System.out.println("Preço: ");
        double price = sc.nextDouble();
        System.out.println("Quantidade em Estoque: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Update price: " + product.getPrice());

        System.out.println("Produto data: "+ product);

        System.out.println();
        System.out.println("Insira produtos ao estoque: ");
        quantity= sc.nextInt();
        product.addProduto(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Remova produtos do estoque: ");
        quantity = sc.nextInt();
        product.removeProduto(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

    }

}
