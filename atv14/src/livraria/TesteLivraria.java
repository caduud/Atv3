package livraria;

public class TesteLivraria {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 50);
        Livro livro1 = new Livro("Dom casmurro", 200, "Machado De Assis", 391);

        System.out.println(produto1.toString());
        System.out.println(livro1.toString());
    }
}
