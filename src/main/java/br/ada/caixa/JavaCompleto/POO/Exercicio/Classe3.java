package br.ada.caixa.JavaCompleto.POO.Exercicio;

public class Classe3 {

    String aluno;
    int nota1;
    int nota2;
    int nota3;

    public int executarResultado() {
        return nota1 + nota2 + nota3;
    }

    public int recuperarPontos(){
        if (executarResultado() < 60) {
            return 60 - executarResultado();
        } else {
            return 0;
        }
    }
}
