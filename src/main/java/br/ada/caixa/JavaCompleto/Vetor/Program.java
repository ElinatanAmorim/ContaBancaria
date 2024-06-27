package br.ada.caixa.JavaCompleto.Vetor;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Quantos produtos você deseja adicionar? ");
            int n = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            Producto[] vect = new Producto[n];

            System.out.println("Digite o nome e o preço de cada produto, separados por espaço (ex: Produto1 10.0 Produto2 20.0):");
            String input = sc.nextLine();

            String[] tokens = input.split(" "); //input.split salva toda a linha separando produto e preço pelo espaço.

            for(int i = 0; i < n; i++) {
                String name = tokens[i * 2];
                double price = Double.parseDouble(tokens[i * 2 + 1]);
                vect[i] = new Producto(name, price);
            }

            // Exibir os produtos para verificação
            for(Producto product : vect) {
                System.out.println(product);
            }

            sc.close();
        }
    }

    class Producto {
        private String name;
        private double price;

        public Producto(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + "}";
        }
    }