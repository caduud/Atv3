public class DoisGen <T,V>{
    private T ob1;
    private V ob2;

    DoisGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    public T getOb1() {
        return ob1;
    }
    public V getOb2() {
        return ob2;
    }
    public void mostra(){
        System.out.println("Tipo de T: " + ob1.getClass().getName() + "Tipo de V: " + ob2.getClass().getName());
    }
}