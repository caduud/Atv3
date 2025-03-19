public class Turma {
    private String curso;
    private String disciplina;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turma(String curso, String disciplina) {
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public void exibirDados(){
        System.out.println("Curso: " + getCurso());
        System.out.println("Disciplina: " + getDisciplina());
    }
}
