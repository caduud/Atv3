package Banco;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome, double saldo){
        super(nome, saldo);
    }

    @Override
    public void taxaOperacao(double saldo){
        saldo *= 0.01;
        setSaldo(getSaldo() -  saldo);;
    }
}
