package level3.exercise1;

public class Generic {
    public <T extends Phone> void method1(T phone) {
        phone.call();
    }

    public <T extends Smartphone> void method2(T smartphone) {
        smartphone.call();
        smartphone.takePhotos();
    }
}
