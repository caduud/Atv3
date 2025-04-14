package banco;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1, cliente2;

        cliente1 = new ClienteEspecial("Joao", 200, 2000);
        cliente2 = new Cliente("Jose", 500, 1000);

        System.out.println(cliente2);
        System.out.println(cliente1);
    }
}
