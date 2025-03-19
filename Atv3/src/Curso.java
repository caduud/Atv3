public class Curso {
    public static void main(String[] args) {
        Turma turma1 = new Turma("Ciência da computação", "Lógica digital");
        Turma turma2 = new Turma("Medicina", "Ossos");

        turma1.exibirDados();
        turma2.exibirDados();

        System.out.printf("Curso: %s Disciplina: %s %n", turma1.getCurso(), turma1.getDisciplina());
        System.out.printf("Curso: %s Disciplina: %s", turma2.getCurso(), turma2.getDisciplina());
    }
}
