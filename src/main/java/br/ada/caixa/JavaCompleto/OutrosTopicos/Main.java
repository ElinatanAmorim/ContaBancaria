package br.ada.caixa.JavaCompleto.OutrosTopicos;

public class Main {
    /*
    Principais funções
    Formatar: toLowerCase(), toUpperCase(), trim()
    Recortar: substring(inicio), substring(inicio, fim)
    Substituir: Replace(char, char), Replace(string, string)
    Buscar: IndexOf, LastIndexOf
    str.Split(" "
     */
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); //tudo minúscula
        String s02 = original.toUpperCase(); //tudo maiúscula
        String s03 = original.trim(); // eliminou os espaços em branco
        String s04 = original.substring(2); //pega o caracter da posição 2 em diante
        String s05 = original.substring(2, 9); //recotar a string a partir do 2 e abaixo do caracter 9
        String s06 = original.replace('a', 'x'); //trocou a por x
        String s07 = original.replace("abc", "xy"); //trocou abc por xy
        int i = original.indexOf("bc"); //primeira ocorrência do bc
        int j = original.lastIndexOf("bc"); //última ocorrência do bc
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }

}
