public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Banco banco;

    public Carro(String marca, String modelo, String fabricante, Motor motor, Banco banco) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.banco = banco;
    }

    public String getTipoMotor(){
        return motor.getTipo();
    }

    public String getFabBanco(){
        return banco.getFabrincante();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + this.marca +
                ", modelo=" + this.modelo +
                ", fabricante=" + this.fabricante +
                ", motor=" + getTipoMotor() +
                ", banco=" + getFabBanco() +
                '}';
    }
}