package br.ada.caixa.JavaCompleto.EstruturaCondicionais;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciciosEstruturaCondicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exercício1 - Ler um n° inteiro e depois dizer se este número é negativo ou não.

        int valorX = 3;
        int valorY = 4;

        if (valorX > 0) {
            System.out.println("POSITIVO");
        } else if (valorX < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("Zero é nulo");
        }

        // Exercício2 - Ler um número inteiro e dizer se este número é par ou ímpar.

        if(valorX % 2 == 0) {
            System.out.println("Par");
        } else if ( valorX %2 !=0) {
            System.out.println("Ímpar");
        } else {
            System.out.println("Valor inválido");
        }

        // Exercício3 - Se são múltiplos

        if(valorY % valorX == 0 || valorX % valorY == 0 ) {
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("Não são Múltiplos");
        }

        // Exercício4 - Leia a hora inicial e final de um jogo. A seguir calcule a duração do jogo,
        // sabendo que pode começar em um dia e terminar em outro, tendo duração mínima de 1h e máx de 24h.

        System.out.println("Qual hora começará o jogo? ");
        int horaInicial = sc.nextInt();
        System.out.println("Qual hora terminará o jogo? ");
        int horaFinal = sc.nextInt();
        int duracao;

        if( horaInicial < horaFinal)
            duracao = horaFinal - horaInicial;
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        //Exercício5 - escreva um programa que leia o código de um item e sua qtd. Calcule o valor da conta.

        int codigo = sc.nextInt();
        int qtdProduto = sc.nextInt();
        double total;

        if ( codigo == 1 ) {
            total = qtdProduto * 4;
        }
        else if
            ( codigo == 2 ) {
            total = qtdProduto * 4.5;
        }
        else if
        ( codigo == 3 ) {
            total = qtdProduto * 5;
        }
        else if
        ( codigo == 4) {
            total = qtdProduto * 2;
        }
        else {
            total = qtdProduto * 1.5;
        }
        System.out.printf("O total da compre é: R$ %.2f%n", total);

        //Exercício6 - Qual intervalo o valor se encontra

        double valor = 24.1;
        String intervalo;

        if( valor >= 0 || valor <= 25) {
            System.out.println("[0,25]");
        }
        else if
            (valor >= 26 || valor <= 50) {
            System.out.println("[26,50]");
        }
        else {
            System.out.println("Fora do intervalo");
        }

        //Exercício8 - Calculando Impostos
        System.out.println("Qual o valor da renda? ");
        double renda = sc.nextDouble();
        double imposto;

        if ( renda <= 2000 ) {
            imposto = 0;
        }
        else if
            (renda >= 2000.01 || renda <= 3000) {
            imposto = ( renda - 2000 ) * 0.08;
        }
        else if
            ( renda >= 3000.01 || renda <= 4500) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
