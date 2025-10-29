import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        //Uma cifra de César é uma forma fraca de criptografia que implica “rotacionar” cada
        //letra por um número fixo de lugares. Rotacionar uma letra significa deslocá-lo pelo
        //alfabeto, voltando ao início se for necessário, portanto ‘A’ rotacionado por 3 é ‘D’ e ‘Z’
        //rotacionado por 1 é ‘A’. Para rotacionar uma palavra, faça cada letra se mover pela
        //mesma quantidade de posições. Por exemplo, “cheer” rotacionado por 7 é “jolly” e
        //“melon” rotacionado por -10 é “cubed”. No filme 2001: Uma odisseia no espaço, o
        //computador da nave chama-se HAL, que é IBM rotacionado por -1.
        //Escreva um programa em Java contendo um método chamado rotacionar() que receba
        //uma string e um número inteiro como parâmetros, e retorne uma nova string que
        //contém as letras da string original rotacionadas pelo número dado


        Scanner sc = new Scanner(System.in);
        String palavra, criptografada;
        int deslocamento;

        System.out.println("Palavra:");
        palavra = sc.next();

        System.out.println("Deslocamento:");
        deslocamento = sc.nextInt();

        criptografada = rotacionar(palavra, deslocamento);

        System.out.println(criptografada);

    }

    public static String rotacionar(String palavra, int deslocamento){
        String cripto = "";
        int aux;
        char ch;
        int desloc = deslocamento % 26;     // se o deslocamento for menor que 26, o valor continua sendo o mesmo do deslocamento
        //palavra = palavra.toLowerCase();    //converter para minusculo


        for (int i = 0; i < palavra.length(); i++){
            ch = palavra.charAt(i);

            if (ch > 'a' && ch <= 'z'){            //leta minusculo
                aux = ch - 'a';
                cripto += (char) ('a' + (aux + deslocamento) % 25);
            }

            else if (ch >= 'A' && ch <= 'Z'){       //letra maiuscula
                aux = ch - 'A';
                cripto += (char) ('A' + (aux + deslocamento) % 25);
            }

            else {
                cripto += ch;
            }
        }
        return cripto;
    }
}
