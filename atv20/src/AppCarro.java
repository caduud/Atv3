public class AppCarro
{
    public static void main(String args[]){
        Motor m1 = new Motor("3.8L V6");
        Carro c1 = new Carro("Mustang", "Convers�vel", "Ford",m1);
        Banco b1 = new Banco("Recaro");

        Motor m2 = new Motor("COOPER");
        Carro c2 = new Carro("MINI", "COOPER SE", "BMW", m2);
        Banco b2 = new Banco("BMW");

        Motor m3 = new Motor("Mercedes-Benz");
        Carro c3 = new Carro("Mercedes-EQ", "EQA 250", "Mercedes-Benz", m3);
        Banco b3 = new Banco("AMG");

        System.out.println( c1.getFabricante() + " " +
                c1.getMarca()      + " " +
                c1.getModelo()     + " " +
                c1.getTipoMotor()  + " " +
                b1.getFabrincante());

        System.out.println( c2.getFabricante() + " " +
                c2.getMarca()      + " " +
                c2.getModelo()     + " " +
                c2.getTipoMotor() + " " +
                b2.getFabrincante());

        System.out.println( c3.getFabricante() + " " +
                c3.getMarca()      + " " +
                c3.getModelo()     + " " +
                c3.getTipoMotor()  + " " +
                b3.getFabrincante());
    }
}