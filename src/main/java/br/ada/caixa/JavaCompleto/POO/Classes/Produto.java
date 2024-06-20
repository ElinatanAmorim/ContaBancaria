package br.ada.caixa.JavaCompleto.POO.Classes;

import java.math.BigDecimal;

public class Produto {

    public String nome;
    public double preco;
    public int qtd;

    public double totalValorEstoque () {
        return preco * qtd;
    }
    public void addProduto (int qtd) {
        this.qtd += qtd;
    }
    public void removeProduto(int qtd) {
        this.qtd -= qtd;
    }
    public String toString(){
        return nome
        + ", $ "
        + String.format("%.2f", preco)
        + ", "
        + qtd
        + " unidades, Total: $ "
        + String.format("%.2f", totalValorEstoque());
    }
}
