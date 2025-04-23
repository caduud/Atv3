public class Liquidificador{
    private boolean ligado;

    Liquidificador(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public boolean isLigado(){
        return this.ligado == true;
    }

    public void observar(){
        System.out.println(isLigado()? "Liquidificador esta ligado" : "Liquidificador esta desligado");
    }
}
