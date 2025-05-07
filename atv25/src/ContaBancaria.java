public abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome){
        this.nome = nome;
    }

    public abstract void retira(double saldo);

    public void deposita(double valor){
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
