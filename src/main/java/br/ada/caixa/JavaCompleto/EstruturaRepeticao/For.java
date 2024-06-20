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

        int N = sc.nextInt();
        int soma = 0;
        for (int i =0; i<N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        for (int i =0; i<5 ; i++) {
            System.out.println("Valor de i: "+ i);
        }

        for (int i = 4; i >= 0 ; i--) {
            System.out.println("Valor de i: "+ i);
        }

    }
}
