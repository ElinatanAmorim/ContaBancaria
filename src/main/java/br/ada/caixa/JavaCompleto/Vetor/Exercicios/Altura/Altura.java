package br.ada.caixa.JavaCompleto.Vetor.Exercicios.Altura;

public class Altura {

    private String nome;
    private int idade;
    private double altura;

    public Altura(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Nome= " + nome + ", Idade= " + idade + ", Altura= " + altura;
    }
    public String toStringIdade() {
        return "Nome= " + nome + ", Idade= " + idade;
    }
}

