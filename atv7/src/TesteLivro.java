public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dom quixote", "Miguel de cervantes");

        System.out.printf("Livro 1: %nTitulo: %s, Autor: %s%n", livro1.getTitulo(), livro1.getAutor());
        System.out.printf("Livro 2: %nTitulo: %s, Autor: %s%n", livro2.getTitulo(), livro2.getAutor());
        System.out.println("Quantidade de livros: " + Livro.getLivrosCriados());
    }
}
