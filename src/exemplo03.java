public class exemplo03 {
    public static void main(String[] args) {

        //tem o caracter e quero ver qual o numero correnponde ele
        String s = "fiap";
        int aux;

        for (int i = 0; i < s.length(); i++) {
            aux = s.charAt(i);
            System.out.println(aux);     //tabela ASCII
        }


        //agora eu quero o contrari, pegar o número e ecnontrar o caracter correspondente
        int valor = 80;
        char c = (char) valor;           //quero converter de inteiro para char

        System.out.println(c);


    }
}