package br.ada.caixa.JavaCompleto.Vetor;


import java.util.Locale;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nº de elementos: ");
        int n = sc.nextInt();

        double[] vect = new double[n];   // [] indica que estou declarando um vetor

        System.out.println("Digite os elementos:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double avg = calcularMedia(vect, n);

        System.out.printf("Média: %.2f%n", avg);

        sc.close();

    }
    private static double calcularMedia(double[] vect, int n) {
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        return soma / n;
    }
}
