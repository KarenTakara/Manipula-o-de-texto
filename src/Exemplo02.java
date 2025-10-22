import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        //programa para ler uma frase e imprimir a quantidade de vogais

        Scanner sc = new Scanner(System.in);
        String frase;
        int totalVogais = 0;
        char [] letra;   //char - vetor tipo caracter
        char aux;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        letra = frase.toCharArray();

        //primeira forma
        for(int i = 0; i < letra.length; i++) {
            System.out.print(letra[i] + "\t");
        }


        //segunda forma
        System.out.println();
        for (char c : letra) {
            System.out.print(c + "\t");
        }


        //contagem das vogais da frase
        frase = frase.toLowerCase();                  //converter os caracteres minusculos, converter para maiusculo, usar to upper case
        for(int i = 0; i < frase.length(); i++) {    //para string tudo eh um metodo como length()
            aux = frase.charAt(i);
            switch(aux) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    totalVogais++;
                    break;

            }
        }

        System.out.println("\nTotal de vogais: " + totalVogais);
    }

}
