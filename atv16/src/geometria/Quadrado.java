package geometria;

public class Quadrado extends Figura{
    Figura figura = new Figura();

    @Override
    public double area(double lado1) {
        return figura.area(lado1 * lado1);
    }
}
