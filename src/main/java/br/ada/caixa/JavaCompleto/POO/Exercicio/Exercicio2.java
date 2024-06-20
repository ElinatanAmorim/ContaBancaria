package br.ada.caixa.JavaCompleto.POO.Exercicio;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Classe2 salario = new Classe2();
        System.out.println("Nome: ");
        salario.nome = sc.next();
        System.out.println("Salário Bruto: ");
        salario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        salario.imposto = sc.nextDouble();

        System.out.printf(salario.nome + ", R$ " + "%.2f", salario.salarioLiquido());
        System.out.println();

        System.out.println("Taxa de Comissão: ");
        salario.taxa  = sc.nextDouble();

        System.out.printf(salario.nome + ", R$ " + "%.2f", salario.salarioMaisComissao());


    }
}
