import java.util.ArrayList;

public class TesteCozinha {
    public static void main(String[] args) {
        Geladeira g = new Geladeira(true);
        Liquidificador l = new Liquidificador(true);
        Microondas m = new Microondas(true);
        Cozinha cozinha = new Cozinha(g, l, m);

        cozinha.desligar();
        cozinha.ligar();

    }
}
