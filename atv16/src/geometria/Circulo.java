package geometria;

public class Circulo extends Figura{

    @Override
    public double area(double raio1) {
        return (3.14 * Math.pow(raio1, 2));
    }
}
