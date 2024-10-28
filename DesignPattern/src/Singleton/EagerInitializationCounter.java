package Singleton;

public class EagerInitializationCounter {
    private static final EagerInitializationCounter uniqueInstance = new EagerInitializationCounter();
    private int value = 0;

    private EagerInitializationCounter() {
        System.out.println("EagerInitializationCounter instance created");
    }

    // Hentning af instansen (Eager Initialization)
    public static EagerInitializationCounter getInstance() {
        System.out.println("Getting instance of EagerInitializationCounter (Eager Initialization)");
        return uniqueInstance;
    }

    public void count() {
        System.out.println("Counting in EagerInitializationCounter");
        value++;
    }

    public int getValue() {
        return value;
    }
}
