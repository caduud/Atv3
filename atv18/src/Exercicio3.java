import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma string");
        String string1 = sc.nextLine();
        while(string1.length() < 8){
            System.out.println("Escreva uma string com no minimo 8 letras");
            string1 = sc.nextLine();
        }

        System.out.println(verificaPalavra(string1));
    }

    public static String verificaPalavra(String string1){
        String string;
        return string = string1.substring(0,2).concat(string1.substring(string1.length()-2, string1.length()));
    }
}
