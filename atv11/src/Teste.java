import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Triangulo");
        System.out.print("Largura triangulo: ");
        double larguratri = sc.nextDouble();
        System.out.print("Altura triangulo: ");
        double alturatri = sc.nextDouble();
        System.out.print("Estilo triangulo: ");
        sc.nextLine();
        String estilotri = sc.nextLine();

        Triangulo triangulo = new Triangulo(larguratri, alturatri, estilotri);

        System.out.println("Area: " + triangulo.area());
        System.out.println("Estilo: " + triangulo.mostraEstilo());

        System.out.println();
        System.out.println("Retangulo");
        System.out.print("Largura retangulo: ");
        double larguraret = sc.nextDouble();
        System.out.print("Altura retangulo: ");
        double alturaret = sc.nextDouble();

        Retangulo retangulo = new Retangulo(larguraret, alturaret);

        System.out.println((retangulo.quadrado()) ? "É quadrado" : "Não é quadrado");
        System.out.println("Area: " + retangulo.area());
    }
}
