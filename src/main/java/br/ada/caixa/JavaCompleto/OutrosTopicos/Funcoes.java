package br.ada.caixa.JavaCompleto.OutrosTopicos;

import java.io.InputStream;
import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);
    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) { //o value e no método acima xyz, ele trouxe informando que não tem que ser o mesmo nome das variáveis acima, exemplo abc
        System.out.println("Higher = " + value);
    }

}
