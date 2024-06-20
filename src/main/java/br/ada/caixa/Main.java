package br.ada.caixa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina o valor de b");
        int valorb = scanner.nextInt();

        System.out.println("Defina o valor de B");
        int valorB = scanner.nextInt();

        System.out.println("Defina o valor de h");
        int valorh = scanner.nextInt();

        double valorArea = ((valorb + valorB) / 2) * valorh;

        System.out.println("O valor da área é " + valorArea);

    }
}