package livraria;

public class Produto {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean itsABook (){
        return false;
    }

    public boolean itsABook(String name){
        return (name != null) ? true : false;
    }

    public boolean itsExpensive(){
        return (this.price > 80) ? true : false;
    }

    @Override
    public String toString() {
        return itsExpensive()? String.format("É um produto Caro %n Nome: %s%n Preço %.2f%n", getName(), getPrice()) : String.format("É um produto BARATO %n Nome: %s%n Preço %.2f%n", getName(), getPrice());

    }
}
