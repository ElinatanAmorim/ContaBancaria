package br.ada.caixa.JavaCompleto.POO.Exercicio;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Classe3 student = new Classe3();

        System.out.println("Informe nome do Aluno e notas: ");
        student.aluno = sc.nextLine();
        student.nota1 = sc.nextInt();
        student.nota2 = sc.nextInt();
        student.nota3 = sc.nextInt();

        System.out.println("Resultado final: "+ student.executarResultado());

        if (student.executarResultado() < 60.0) {
            System.out.println("FAILED");
            System.out.println("Pontos a recuperar: " + student.recuperarPontos());
        }
        else {
            System.out.println("PASS");
        }
    }
}