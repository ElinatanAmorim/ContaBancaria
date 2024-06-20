package br.ada.caixa.JavaCompleto.EstruturaRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        executarExercicio1(sc);
//        executarExercicio2(sc);
//        executarExercicio3(sc);
//        executarExercicio4(sc);
//        executarExercicio5(sc);
        executarExercicio6(sc);
//        executarExercicio7(sc);
    }
    //Exercício1 - Ler um n° inteiro X 1<= X <= 1000) E mostrar os n° ímpares de 1 a X, inclusive X, se for o caso.
        public static void executarExercicio1 (Scanner sc) {

            System.out.print("Digite um valor inteiro entre 1 e 1000: ");
            int X = sc.nextInt();

            int count = 0;  // Variável para contar os números ímpares

            // Verifique se X está dentro do intervalo permitido
            if (X < 1 || X > 1000) {
                System.out.println("O valor deve estar entre 1 e 1000.");
            } else {
                // Imprima os números ímpares de 1 até X
                for (int i = 1; i <= X; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                        count++;
                    }
                }
                System.out.println("Total de números ímpares: " + count);
            }
        }
    //Exercício2 - Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
    public static void executarExercicio2 (Scanner sc) {

        System.out.println("Defina a qtd de nº serão lidos:");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }

    //Exercício3 - Leia valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    //peso 5.
    public static void executarExercicio3 (Scanner sc) {

        Locale.setDefault(Locale.US);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
    }
    //Exercício4 - ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
    public static void executarExercicio4(Scanner sc) {

        int n = sc.nextInt(); // quantos pares de inteiros serão lidos a seguir.

        for (int i = 0; i < n; i++) {

            //Em cada iteração do laço, lê dois inteiros x e y.
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
    }

    //Exercício5 - Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    //Lembrando que, por definição, fatorial de 0 é 1.
    public static void executarExercicio5(Scanner sc) {

        System.out.print("Insira o valor a ser fatorado:");
        int n = sc.nextInt(); //defina o número que será fatorado

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);
    }

    //Exercício6 - Ler um número inteiro N e calcular todos os seus divisores.
    public static void executarExercicio6(Scanner sc) {

        System.out.println("Defina o valor de N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }

        }
    }

//    Exercicio7 - Ler um n° inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N.
//    Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.

    public static void executarExercicio7 (Scanner sc) {
        int N = sc.nextInt();

        
    }
}