package level1.exercise1;

public class NoGenericMethods<T> {
    private T first;
    private T second;
    private T third;

    public NoGenericMethods(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void storeValues(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void printValues() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }

    public static void main(String[] args) {
        NoGenericMethods<Integer> noGenericMethods = new NoGenericMethods<>(5, 10, 15);
        noGenericMethods.printValues();

        noGenericMethods.storeValues(20, 25, 30);
        noGenericMethods.printValues();
    }
}

