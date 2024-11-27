package level1.exercise1;

public class NoGenericMethods {
    private Integer first;
    private Integer second;
    private Integer third;

    public NoGenericMethods(Integer first, Integer second, Integer third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printValues() {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
    }
}

