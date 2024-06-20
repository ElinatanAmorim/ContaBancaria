package br.ada.caixa.JavaCompleto.POO.Classes;

public class CurrencyConverter {

    public static double cotacaodolar, qtddolar;

    public static final double IOF = 1.06;

    public static double dolarReal() {
        return qtddolar * cotacaodolar;
    }
    public static double converter() {
        return  dolarReal() * IOF;
    }
}
