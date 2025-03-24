public class Livro {
    private String titulo;
    private String autor;
    private static int livrosCriados;

    public Livro(){
        titulo = "Desconhecido";
        autor = "Anônimo";
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        ++livrosCriados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static int getLivrosCriados() {
        return livrosCriados;
    }
}
