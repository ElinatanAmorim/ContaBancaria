package br.ada.caixa.JavaCompleto.Vetor.Exercicios;

import java.util.Scanner;

public class NumNegativos {
    /*Exercício
        Um programa que leia N números inteiros, e imprima só os números negativos;
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nº vc quer receber: ");
        int n = sc.nextInt();

        if (n > 5) {
            n = 5;
            System.out.println("Você só pode inserir no máximo 5 números. O número de entradas foi ajustado para 5.");
        }
        ClasseInteiros[] vect = new ClasseInteiros[n];

        for( int i=0; i< vect.length ; i++){
            sc.nextLine();
            System.out.println("Digite os números inteiros: ");
            int num = sc.nextInt();
            vect[i] = new ClasseInteiros(num);
        }

   //Verificar e imprimir apenas os números negativos -- Uma alternativa
        boolean hasNegatives = false;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() < 0) {
                if (!hasNegatives) {
                    System.out.println("Os números negativos inseridos são:");
                    hasNegatives = true;
                }
                System.out.println(vect[i].getNumber());
            }
        }

        //Caso não haja números negativos
        if (!hasNegatives) {
            System.out.println("Sem números negativos.");
        }

        sc.close();
    }
}
