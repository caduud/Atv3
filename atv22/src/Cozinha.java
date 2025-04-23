public class Cozinha {
    private Geladeira geladeira;
    private Liquidificador liquidificador;
    private Microondas microondas;

    Cozinha(Geladeira g, Liquidificador l, Microondas m){
        this.geladeira = g;
        this.liquidificador = l;
        this.microondas = m;
    }

    public void ligar(){
        geladeira.ligar();
        liquidificador.ligar();
        microondas.ligar();

        geladeira.observar();
        liquidificador.observar();
        microondas.observar();
    }

    public void desligar(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();

        geladeira.observar();
        liquidificador.observar();
        geladeira.observar();
    }

}
