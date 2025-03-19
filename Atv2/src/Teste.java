public class Teste {
    public static void main(String[] args) {
        Universidade unicentro = new Universidade();
        Aluno carlos = new Aluno();

        unicentro.nome = "Unicentro";
        unicentro.cidade = "Guarapuava";
        unicentro.estado = "Paraná";

        carlos.nome = "Carlos";
        carlos.curso = "Ciência da computação";

        unicentro.exibeDados();
        carlos.exibeDados();
    }
}
