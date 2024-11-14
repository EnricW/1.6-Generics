package level3.exercise1;

public class Generic {
    public <T extends Phone> void method1(T phone) {
        phone.call();
        // phone.takePhotos(); // This CAN'T be done because the method isn't defined in the Phone interface
    }

    public <T extends Smartphone> void method2(T smartphone) {
        smartphone.call();
        smartphone.takePhotos(); // This CAN be done because the method is defined in the Smartphone class
    }
}
