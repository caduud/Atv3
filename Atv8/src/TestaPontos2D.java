public class TestaPontos2D {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(7,5);
        Ponto2D ponto2 = new Ponto2D(2,3);

        System.out.print("Coordenadas de P1: ");
        System.out.printf("%.2f ", ponto1.getX() );
        System.out.printf("%.2f ", ponto1.getY() );

        System.out.print("Coordenadas de P1: ");
        System.out.printf("%.2f ", ponto2.getX() );
        System.out.printf("%.2f ", ponto2.getY() );

        System.out.println("Pontos criados: " + Ponto2D.getContador());

    }
}
