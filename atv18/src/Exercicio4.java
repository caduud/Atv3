import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        System.out.println(processa(string));
    }

    public static String processa(String string){
        return string.equals(null) ? null : string.toUpperCase();
    }
}
