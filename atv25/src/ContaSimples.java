public class ContaSimples extends ContaBancaria{

    public ContaSimples(String nome){
        super(nome);
    }

    public void retira(double saldo){
        if(getSaldo() > saldo){
            setSaldo(saldo);
        }
    }
}
