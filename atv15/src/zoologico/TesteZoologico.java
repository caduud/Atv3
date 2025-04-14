package zoologico;

public class TesteZoologico {
    public static void main(String[] args) {
        Animal[] animal = new Animal[4];
        animal[0] = new Animal();
        animal[1] = new Cachorro();
        animal[2] = new Gato();
        animal[3] = new Preguica();

        for(int  i = 0; i < 4; i++){
            animal[i].som();
        }
    }
}
