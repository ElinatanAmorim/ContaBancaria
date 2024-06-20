package br.ada.caixa.JavaCompleto.POO.Exercicio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Classe1 retangulo = new Classe1();
        System.out.print("Valor de b: ");
        retangulo.b = sc.nextInt();
        System.out.print("Valor de B: ");
        retangulo.B = sc.nextInt();

        System.out.println("Área do retangulo: \n" + retangulo.calcularArea());
        System.out.println("Perímetro do retangulo: " + retangulo.calcularPerimetro());
        System.out.println("Hipotenusa do retangulo: " + retangulo.calcularHipotenusa());

    }
}
