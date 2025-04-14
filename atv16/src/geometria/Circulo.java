package geometria;

public class Circulo extends Figura{
    Figura figura = new Figura();

    @Override
    public double area(double raio1) {
        return figura.area(Math.PI * Math.pow(raio1, 2));
    }
}
