package Banco;

public class ContaCorrente {
    private String nome;
    private double saldo;

    public ContaCorrente(){

    }

    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public double deposita(double saldo){
        return this.saldo += saldo;
    }

    public double saca(double saldo){
        setSaldo(getSaldo() - saldo);
        taxaOperacao(saldo);
        return getSaldo();
    }

    public void taxaOperacao(double saldo){
        saldo *=  0.02;
        setSaldo(getSaldo() -  saldo);
    }
}
