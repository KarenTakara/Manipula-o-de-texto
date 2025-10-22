import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        //Duas palavras são um “par inverso” se uma for o contrário da outra. Escreva um
        //programa em Java que leia um conjunto de palavras e em seguida encontre todos os
        //pares inversos na lista de palavras.

        String[] palavra = new String[4];

        lerPalavra(palavra);
        localizarPar(palavra);

    }

    public static void lerPalavra(String[] palavra) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < palavra.length; i++) {
            System.out.println("Palavra: ");
            palavra[i] = sc.next();
        }
    }

    public static void localizarPar(String[] palavra) {
        String inverso;
        for (int j = 0; j < palavra.length; j++) {
            inverso = inverter(palavra[j]);

            for (int i = j + 1; i < palavra.length; i ++) {
                if (inverso.equalsIgnoreCase(palavra[i])){
                    System.out.println("(" + inverso + "," + palavra[i] + ")");
                }
            }
        }
    }

    public static String inverter(String palavra) {
        char aux;
        int j = palavra.length() -1;
        char[] letra = palavra.toCharArray();
        for (int i = 0; i < letra.length / 2; i++ ){
            aux = letra[i];
            letra[i] = letra[j];
            letra[j] = aux;
        }
    }
}
