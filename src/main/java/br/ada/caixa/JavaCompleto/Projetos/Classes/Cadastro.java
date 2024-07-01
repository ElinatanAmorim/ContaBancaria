package br.ada.caixa.JavaCompleto.Projetos.Classes;

import br.ada.caixa.JavaCompleto.Vetor.Exercicios.Altura.ProgramAltura;

public class Cadastro {

    private int numconta; //Inicialmente tinha feito assim - final public int numconta;
    private static String nome;
    private static double balance;

       public Cadastro(int numconta, String nome){
        this.numconta = numconta;
        this.nome = nome;
    }

    public Cadastro(final int numconta, String nome, double initailDeposit){
        this.numconta = numconta;
        this.nome = nome;
        deposit(initailDeposit);
    }
    public int getNumconta() {
        return numconta;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cadastro.nome = nome;
    }
    public static double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
           balance += amount;
    }

    public void saque (double amount) {
           balance -= amount + 5;
    }

    public String toString() {
           return "Conta "
                   + numconta
                   + ", Titular: "
                   + nome
                   + ", Balance: R$ "
                   + String.format("%.2f",balance);
       }
}
