import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s1, s2;
    int x;

    System.out.println("Frase: ");     //se voce inverter o frase com a palavra, vaidar errado. primeiro ele pede uma palavra, ai voce vai escrever a palavra e dar enter, esse enter ira ficar guardado ai o nextline acha que aquilo ja esta digitado e imprimi o espaço
    s2 = sc.nextLine();

    System.out.println("Palavra: ");
    s1 = sc.next();
    sc.nextLine();                      // pra nao dar o problema, a gente coloca esse comando

    System.out.println("Valor: ");
    x = sc.nextInt();


    System.out.println(s1);
    System.out.println(s2);
    System.out.println(x);

    }
}
