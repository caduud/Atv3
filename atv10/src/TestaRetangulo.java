import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Retangulo retangulo = new Retangulo();
        System.out.print("Adicione o comprimento: ");
        double comprimento = sc.nextDouble();
        while(validacao(comprimento)){
            System.out.println("Tente novamente com um número positivo: ");
            comprimento = sc.nextDouble();
        }

        System.out.print("Adicione a largura: ");
        double largura = sc.nextDouble();
        while(validacao(largura)){
            System.out.println("Tente novamente com um número positivo: ");
            largura = sc.nextDouble();
        }


        retangulo.saida();
    }

    private static boolean validacao(double num) {
        return num < 0;
    }
}
