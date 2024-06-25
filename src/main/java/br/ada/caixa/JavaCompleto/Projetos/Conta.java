package br.ada.caixa.JavaCompleto.Projetos;

import br.ada.caixa.JavaCompleto.Projetos.Classes.Cadastro;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

//        Locale.setDefault(Locale.US); Decidi deixar em R$
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro;

        System.out.println("Bem-vindo a CEF! Vamos abrir sua conta! Informe o número da Conta: ");
        int numconta = sc.nextInt();
        System.out.println("Informe seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Desejar realizar Depósito inicial? (s/n)");
        char response = sc.next().charAt(0);

        if( response == 's' ) {
            System.out.println("Depósito Inicial: ");
            double initialDeposit = sc.nextDouble();
            cadastro = new Cadastro(numconta, nome, initialDeposit);
        } else {
            cadastro = new Cadastro(numconta, nome);
            break;
        }

        System.out.println();
        System.out.println("Conta aberta com sucesso de nº ");
        System.out.println(cadastro);

        System.out.println();
        System.out.println("Realizar depósito: ");
        double valorDeposito = sc.nextDouble();
        cadastro.deposit(valorDeposito);
        System.out.println("Saldo da conta: ");
        System.out.println(cadastro);

        System.out.println();
        System.out.println("Realizar saque: ");
        double valorSaque = sc.nextDouble();
        cadastro.saque(valorSaque);
        System.out.println("Saldo da conta: ");
        System.out.println(cadastro);

//        Cadastro.nome = "Matteo"; Testando se o nome e a conta alteram

    }
}
