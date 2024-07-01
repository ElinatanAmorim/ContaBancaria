package br.ada.caixa.JavaCompleto.Construtor;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //É executado no momento da instanciação do objeto
    public Product(String name, double price, int quantity){
        this.name = name;  //O this serve para dif o atributo do objeto do parâmetro do construtor
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double totalValorEstoque () {

        return price * quantity;
    }
    public void addProduto (int qtd) {

        quantity += qtd;
    }
    public void removeProduto(int qtd) {

        quantity -= qtd;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total: $ "
                + String.format("%.2f", totalValorEstoque());
    }
}