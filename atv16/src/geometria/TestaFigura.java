package geometria;

public class TestaFigura {
    public static void main(String[] args) {
        Figura quadrado, circulo;

        quadrado = new Quadrado();
        circulo = new Circulo();

        System.out.println("Area quadrado: " + quadrado.area(4));
        System.out.println("Area circulo: " + circulo.area(4));

    }
}
