package br.ada.caixa.JavaCompleto.EstruturaRepeticao;

import java.util.Scanner;

public class While {

    //É usada quando você não sabe antecipadamente quantas vezes o laço deve ser executado
    // e a condição de término é verificada antes de cada iteração.

//    while (condição) {
//        comandos
//        {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de x:");
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        System.out.println(soma);

    }
}
