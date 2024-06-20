package br.ada.caixa.JavaCompleto.geteset;

public class Product {

    private String name;
    private double price;
    private int quantity;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
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
        this.quantity += qtd;
    }
    public void removeProduto(int qtd) {
        this.quantity -= qtd;
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
