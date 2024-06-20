package br.ada.caixa.JavaCompleto.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;


public class ExercicioSequencial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Exercício1 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma

        System.out.println("Escolha A: ");
        int valora = sc.nextInt();

        System.out.println("Escolha B: ");
        int valorb = sc.nextInt();

        int resultado = valora + valorb;

        System.out.println("A soma dos valores é: " + resultado);

        //Exercício2 - Cácular área do círuclo com 4 casas decimais

        double raio = 2;
        double area = calcularArea(raio);

        System.out.printf("A área do círculo com raio " + raio + " é " + "area=%.4f%n", area);

        //Exercício3 - Cácular DIFERENCA = (A * B - C * D).

        int valorA = 5;
        int valorB = 6;
        int valorC = 7;
        int valorD = 8;

        double diff = diferencaProduto(valorA, valorB, valorC, valorD);

        System.out.println(diff);

        //Exercício4 - Número do Funcionário e Salários.

        Locale.setDefault(new Locale("pt", "BR"));
        //Locale.setDefault(Locale.US);

        int numFuncionario = 25;
        int numHorasTrabalhadas = 100;
        double valorHoraTrabalhada = 5.5;
        double salario = numHorasTrabalhadas * valorHoraTrabalhada;

        System.out.println("Número = " + numFuncionario);
        System.out.printf("Salário = R$ %.2f%n", salario); //Ou um sout apenas com + "\n" + entre as variáveis

        //Exercício5 - Retornar o cód da peça, nº de peças e o valor unit de cada peça, no final mostrar valor a ser pago.

        System.out.println("Cód peça 1: ");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Qtd peças 1: ");
        int qtdPeca1 = sc.nextInt();
        System.out.println("Valor peça 1: ");
        double valorUnitPeca1 = sc.nextDouble();

        System.out.println("Agora o Cód peça 2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Qtd peças 2: ");
        int qtdPeca2 = sc.nextInt();
        System.out.println("Valor peça 2: ");
        double valorUnitPeca2 = sc.nextDouble();

        double TotalPagar = (qtdPeca1 * valorUnitPeca1) + (qtdPeca2 * valorUnitPeca2);
        System.out.printf("Valor a Pagar: R$ %.2f%n", TotalPagar);

        //Exercício6 -

//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//        mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.

        double valueA = 3;
        double valueB = 4;
        double valueC = 5.2;

        double areaTrianguloRet = (valueA * valueC) /2;
        double areaCirculo = calcularArea(valueC);
        double areaTrapezio = ((valueA + valueB) * valueC) /2;
        double areaQuadrado = valueB * valueB;
        double areaRetangulo = valueA * valueB;

        System.out.printf("Área do triangulo retangulo: %.3f%n" , areaTrianguloRet);
        System.out.printf("Área do círculo: %.3f%n" , areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n" , areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n" , areaQuadrado);
        System.out.printf("Área do retangulo: %.3f%n" , areaRetangulo);

    }
        //Metodo do Exercício2
        public static double calcularArea(double raio) {
            return Math.PI * Math.pow(raio, 2);
        }

        //Metodo do Exercício3
        public static double diferencaProduto (double valorA, double valorB, double valorC, double valorD ) {
            return (valorA * valorB - valorC * valorD);
        }

}