package br.ada.caixa.JavaCompleto.EstruturaRepeticao;

public class TestedeMesaFor {

    public static void main(String[] args) {

        int x= 3;
        int y= 0;
        int a = 4;
        int b= a + 2;

        int i;
        for (i = 0; i < x; i++) {
            System.out.print(i + ",");
            y = y + 5;
            System.out.println(y);
        }

        for ( i = 0; i < a; i++) {
            System.out.println(a + " " + b);
            b = b + i;
        }
    }
}
