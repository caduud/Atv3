package banco;

public class Cliente {
    private String name;
    private double saldo;
    private double limite;

    public Cliente(String name, double saldo, double limite) {
        this.name = name;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return String.format("Nome: " + name + " Saldo: " + saldo + " Limite: " + limite);
    }
}
