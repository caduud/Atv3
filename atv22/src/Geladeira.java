public class Geladeira{
    private boolean ligado;

    Geladeira(boolean ligado){
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
        System.out.println(isLigado()? "Geladeira esta ligada" : "Geladeira esta desligada");
    }
}
