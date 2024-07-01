package br.ada.caixa.JavaCompleto.Vetor.Exercicios.Altura;

import java.util.Scanner;

public class ProgramAltura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Informe a quantidade N pessoas: ");
            int N = sc.nextInt();
            Altura[] vect = new Altura[N];

            // Verifica se N é positivo
            if (N <= 0) {
                System.out.println("O número de pessoas deve ser positivo! Deseja tentar novamente? (s/n)");
                char response = sc.next().charAt(0);

                if (response == 'n') {
                    System.out.println("Até a próxima!");
                    return;
                } else {
                    continue; // Pula para a próxima iteração do loop while
                }
            }

            System.out.println("Informe o nome, idade e altura das N pessoas: ");
            for (int i = 0; i < vect.length; i++) {
                sc.nextLine();  // Consome a nova linha pendente
                System.out.print("Pessoa " + (i + 1) + ": ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                vect[i] = new Altura(nome, idade, altura);
            }

            double avg = calcularMediaAltura(vect);

            System.out.printf("A média de todas as alturas é: %.2f%n", avg);

            // Exibe os detalhes de todas as pessoas
            for (int i = 0; i < vect.length; i++) {
                System.out.println(vect[i].toString());
            }
            // Exibe a quantidade, nome e idades dos menores de 16 anos
            int countMenores16 = 0;
            for (int i = 0; i < vect.length; i++) {
                if (vect[i].getIdade() < 16) {
                    countMenores16++;
                    System.out.println("Menor de 16 anos: " + vect[i].toStringIdade());
                }
            }
            double percent = countMenores16 * 100.0 / N;

            if (countMenores16 == 0) {
                System.out.println("Não há menores de 16 anos na base.");
            } else {
                System.out.println("Quantidade de menores de 16 anos: " + countMenores16 + ", " + percent+"%");
            }
            break;
            }
            sc.close();
        }

        private static double calcularMediaAltura(Altura[]vect){
            double soma = 0;
            for (int i = 0; i < vect.length; i++) {
                soma += vect[i].getAltura();
            }
            return soma / vect.length;
        }
}
