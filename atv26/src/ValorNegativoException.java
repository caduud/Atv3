public class ValorNegativoException extends Exception{
    private double quantia;
    ValorNegativoException(double quantia){
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return "Voce nao pode sacar um valor negativo!";
    }
}
