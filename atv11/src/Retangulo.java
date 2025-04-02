public class Retangulo extends TwoDShape{
    public Retangulo(double largura, double altura) {
        super(largura, altura);
    }

    public boolean quadrado(){
        return getLargura() == getAltura();
    }

    public double area(){
        return getLargura() * getAltura();
    }
}
