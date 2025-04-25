import java.sql.SQLOutput;

public class DiversaoApp {
    public static void main(String[] args) {
        Diversao diversao;

        diversao = Diversao.PESCAR;

        switch(diversao){
            case LER:
                System.out.println("Vou ler o livro admiravel mundo novo!");
                break;
            case JOGAR:
                System.out.println("Vou jogar xadrez!");
                break;
            case PESCAR:
                System.out.println("Vou pescar na lagoa das lagrimas!");
                break;
            case CONVERSAR:
                System.out.println("Vou conversar com o pessoal da computação");
                break;
            case PASSEAR:
                System.out.println("Vou passear");
                break;
        }
    }
}
