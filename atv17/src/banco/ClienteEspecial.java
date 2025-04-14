package banco;

public class ClienteEspecial extends Cliente{
    public ClienteEspecial(String name, double saldo, double limite){
        super(name, saldo, limite);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

