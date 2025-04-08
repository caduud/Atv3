package livraria.unicentro;

public class AppLivro {
    public static void main(String[] args) {
        Livro [] livros = new Livro [3];

        livros[0] = new Livro("Os miseráveis", "Victor Hugo", 1822);
        livros[1] = new Livro("Sapiens", "Harari", 2011);
        livros[2] = new Livro("Como programar em JAVA", "Herbert Shildt", 2013);

        for(Livro liv:livros){
            System.out.println(liv.getNome());
            System.out.println(liv.getAutor());
            System.out.println(liv.getAno());
            System.out.println();
        }
    }
}
