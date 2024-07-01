package br.ada.caixa.JavaCompleto.EstruturaCondicionais;

public class CondicaoTernaria {
    public static void main(String[] args) {

        //A operação ternária é uma forma concisa de escrever uma declaração if-else.
        //Se a condição for verdadeira, a expressão após o ? será executada.

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.printf("R$ %.2f%n",desconto);
    }
}
