public class Triangulo extends TwoDShape{
    private String estilo;

    public Triangulo(double largura, double altura, String estilo) {
        super(largura, altura);
        this.estilo = estilo;
    }

    public double area(){
        return getLargura() * getAltura() / 2;
    }

    public String mostraEstilo(){
        return estilo;
    }


}