public class Palestra {
    Luz luz;

    Palestra(Luz luz){
        this.luz = luz;
    }

    public void acessa(){
        switch (luz){
            case VERMELHO:
                System.out.println("palestra indisponivel");
                break;
            case AMBAR:
                System.out.println("palestra sendo liberada");
                break;
            case VERDE:
                System.out.println("palestra disponivel");
                break;
        }
    }
}
