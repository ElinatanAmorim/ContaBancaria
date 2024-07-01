package br.ada.caixa.JavaCompleto.EstruturaRepeticao;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

//Sei qtd de repetições, ótimo para fazer contagens (progressiva ou regressiva)

/*  for (inicialização; condição; incremento) {
        Bloco de código a ser executado
    }*/

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i =0; i<N; i++) {
            sc.nextLine();
            System.out.println("Digite o valor de x: ");
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        System.out.println("Outras situações com o uso do for!");

        for (int i =0; i<N ; i++) {
            System.out.println("Valor de i: "+ i);
        }

        for (int i = 4; i >= 0 ; i--) {
            System.out.println("Valor de i: "+ i);
        }

    }
}
