package br.ada.caixa.JavaCompleto.POO.Exercicio;

import br.ada.caixa.JavaCompleto.POO.Classes.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual a cotação do dólar: ");
        CurrencyConverter.cotacaodolar = sc.nextDouble();
        System.out.println("Quantos dólares a converter: ");
        CurrencyConverter.qtddolar = sc.nextDouble();

//        System.out.println(CurrencyConverter.converter());

        System.out.printf("O valor é: R$ %.2f" , CurrencyConverter.converter());

    }
}
