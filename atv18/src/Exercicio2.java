import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] string = new String[2];

        for (int i = 0; i < 2; i++){
            string[i] = sc.nextLine();
        }

        System.out.println(comparar(string[0], string[1]) ? "A string é igual" : "A string é diferente");
        System.out.println(comparar2(string[0], string[1]) ? "A string é igual" : "A string é diferente");
    }

    public static boolean comparar(String string1, String string2){
        return string1.equals(string2) ? true : false;
    }

    public static boolean comparar2(String string1, String string2){
        return string1.equalsIgnoreCase(string2) ? true : false;
    }
}
