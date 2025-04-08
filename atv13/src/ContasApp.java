public class ContasApp {
    public static void main(String[] args) {
        ContaCorrente[] conta = new ContaCorrente[3];

        conta[0] = new ContaCorrente("Joao", 200.00);
        conta[1] = new ContaCorrente("Rafael", 1000.00);
        conta[2] = new ContaCorrenteEspecial("Joana", 500.00);

        for(ContaCorrente a: conta){
            System.out.println(a.saca(100));
            System.out.println(a.deposita(100));
            System.out.println();
        }
    }
}
