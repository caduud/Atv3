public class TesteDoisGen {
    public static void main(String[] args) {
        DoisGen <Integer, String> generico = new DoisGen <> (100, "Carlos");

        generico.mostra();
    }
}
