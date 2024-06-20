package br.ada.caixa.JavaCompleto.POO.Exercicio;

public class Classe2 {

    String nome;
    double salarioBruto;
    double imposto;

    double taxa;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double salarioMaisComissao() {
        return (taxa * salarioBruto) + salarioLiquido();
    }

}
