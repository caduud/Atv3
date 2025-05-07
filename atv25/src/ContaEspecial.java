public class ContaEspecial extends ContaBancaria{
    private double adicional;

    public ContaEspecial(String nome, double adicional){
        super(nome);
        this.adicional = adicional;
    }

    public void retira(double saldo){
        if(getSaldo() + adicional > saldo){
            setSaldo(saldo);
        }
    }
}
