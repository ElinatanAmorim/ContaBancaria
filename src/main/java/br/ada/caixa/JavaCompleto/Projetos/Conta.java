package br.ada.caixa.JavaCompleto.Projetos;

import br.ada.caixa.JavaCompleto.Projetos.Classes.Cadastro;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = null;

        System.out.println("Bem-vindo a CEF! Vamos abrir sua conta! Informe o número da Conta: ");
        int numconta = sc.nextInt();
        System.out.println("Informe seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Desejar realizar Depósito inicial? (s/n)");
        char response = sc.next().charAt(0);

        if (response == 's') {
            System.out.println("Depósito Inicial: ");
            double initialDeposit = sc.nextDouble();
            cadastro = new Cadastro(numconta, nome, initialDeposit);
        } else {
            cadastro = new Cadastro(numconta, nome);
        }

        System.out.println();
        System.out.println(cadastro);
        //System.out.println("Conta aberta com sucesso de nº " + numconta + " no nome de " + nome);


        boolean continuar = true;
        while (continuar) {
            System.out.println();
            System.out.println("Escolha a operação: ");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            int operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    cadastro.deposit(valorDeposito);
                    System.out.println("Saldo da conta: ");
                    System.out.println(cadastro);
                    break;
                case 2:
                    System.out.println("Valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    cadastro.saque(valorSaque);
                    System.out.println("Saldo da conta: ");
                    System.out.println(cadastro);
                    break;
                case 3:
                    System.out.println("Saldo da conta: ");
                    System.out.println(cadastro);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Operação encerrada. Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            if (continuar) {
                System.out.println("Deseja realizar outra operação? (s/n)");
                char novaOperacao = sc.next().charAt(0);
                if (novaOperacao == 'n') {
                    continuar = false;
                    System.out.println("Operação encerrada. Obrigado por usar nosso serviço!");
                }
            }
        }
    }
}

