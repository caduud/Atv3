public class TesteContaBancarias {
    public static void main(String[] args) {
        ContaSimples simples = new ContaSimples("joao");
        ContaEspecial especial = new ContaEspecial("rafael", 5000);

        simples.deposita(3000);
        simples.retira(2000);

        especial.deposita(3000);
        especial.retira(6000);

        System.out.println("Conta simples: " + simples.getSaldo());
        System.out.println("Conta especial: " + especial.getSaldo());
    }
}
