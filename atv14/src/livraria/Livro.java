package livraria;

public class Livro extends Produto{
    private String author = null;
    private int pages;

    public Livro(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean  itsExtensive(){
        return (this.pages > 300) ? true : false;
    }

    @Override
    public String toString() {
        return itsExpensive()?  String.format("É um livro GRANDE %n Nome: %s%n Autor: %s%n Preço: %.2f%n Quantidade de páginas: %d%n", getName(), author, getPrice(), pages) :  String.format("É um livro NORMAL %n Nome: %s%n Autor: %s%n Preço: %.2f%n Quantidade de páginas: %d%n,", getName(), author, getPrice(), pages);

    }
}
