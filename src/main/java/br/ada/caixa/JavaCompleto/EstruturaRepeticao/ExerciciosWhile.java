package br.ada.caixa.JavaCompleto.EstruturaRepeticao;

import java.util.Scanner;

public class ExerciciosWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //executarExercicio1(sc);
        //executarExercicio2(sc);
        executarExercicio3(sc);
    }

        //Exercicio1 - Escreva um programa que repita a leitura de uma senha até que ela seja válida.
        // Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
        // Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
        // o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        public static void executarExercicio1 (Scanner sc) {

        System.out.println("Senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida!");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");
    }

        //Exercício2 - Escreva um programa para ler as coordenadas (X,Y) de uma qtd indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        public static void executarExercicio2 (Scanner sc) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            while (x != 0 && y != 0) { //Se qualquer uma das coordenadas for zero, o loop termina.
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("quarto");
                }
                //Novos valores de x e y são lidos para a próxima iteração do loop.
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }

        //Exercício3 - Um Posto deseja determinar qual produto tem a preferência de seus clientes.
        // Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

    public static void executarExercicio3(Scanner sc) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
