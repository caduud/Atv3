public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(){
        comprimento = 1;
        largura = 1;
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcArea(){
        double total = this.comprimento * this.largura;
        return total;
    }

    public double calcPerimetro(){
        double total = (this.comprimento * 2) + (this.largura * 2);
        return total;
    }

    public void imprimeArea(){
        double area = calcArea();
        System.out.println("Area: " + area);
    }

    public void imprimePerimetro(){
        double perimetro = calcPerimetro();
        System.out.println("Perimetro: " + perimetro);
    }

    public boolean isQuadrado(){
        return (this.comprimento == this.largura) ? true : false;
    }


    public void saida(){
        System.out.println("Comprimento: " + this.comprimento + " Largura: " + this.largura);
        System.out.println(isQuadrado() ? "É um quadrado" : "Não é um quadrado");
        imprimeArea();
        imprimePerimetro();
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
