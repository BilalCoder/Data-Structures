package arraypackage;

public class Main {
    public static void main(String[] args) {
        // Validating arrays
        DummyArray numbers = new DummyArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        System.out.println(numbers.indexOf(30));
        numbers.print();
        numbers.insert(40);
        numbers.print();
        numbers.removeAt(2);
        numbers.print();
        numbers.removeAt(0);
        numbers.print();
    }
}
