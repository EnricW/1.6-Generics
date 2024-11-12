package level1.exercise1;

public class NoGenericMethods<T> {
    private T first;
    private T second;
    private T third;

    // Constructor que inicialitza els tres arguments
    public NoGenericMethods(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Mètode per emmagatzemar els tres valors
    public void storeValues(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    // Mètodes per obtenir els valors
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    // Mètode per imprimir els valors
    public void printValues() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }

    public static void main(String[] args) {
        // Exemple d'ús de la classe
        NoGenericMethods<Integer> noGenericMethods = new NoGenericMethods<>(5, 10, 15);

        // Imprimir els valors emmagatzemats
        noGenericMethods.printValues();

        // Modificar els valors amb el mètode storeValues
        noGenericMethods.storeValues(20, 25, 30);

        // Imprimir els nous valors
        noGenericMethods.printValues();
    }
}

