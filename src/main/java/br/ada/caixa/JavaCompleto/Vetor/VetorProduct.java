package br.ada.caixa.JavaCompleto.Vetor;

import java.util.Scanner;

public class VetorProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nº de elementos: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for( int i=0; i < vect.length; i++) { //Posso utilizar vect.length ao invés de n, pois ele retorna a qtd de elementos do vetor
            sc.nextLine();
            System.out.print("Digite o nome e preço do produto:");
            String name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double avg = calcularMedia(vect);

        System.out.printf("O valor da média é: R$ %.2f%n", avg );

        sc.close();
    }
    private static double calcularMedia(Product[] vect){
        double soma = 0;
        for(int i=0; i < vect.length ; i++){
            soma += vect[i].getPrice();
        }
        return soma / vect.length;
    }
}