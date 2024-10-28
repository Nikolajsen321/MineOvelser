package Singleton.singleton;

public class LazyInitializationCounter {
    private static LazyInitializationCounter uniqueInstance;
    private int value = 0;

    private LazyInitializationCounter() {
        System.out.println("LazyInitializationCounter instance created");
    }

    // Hentning af instansen (Lazy Initialization)
    public static LazyInitializationCounter getInstance() {

                if (uniqueInstance == null) {
                    uniqueInstance = new LazyInitializationCounter();
                    System.out.println("Creating instance of LazyInitializationCounter (Lazy Initialization)");
        }
        System.out.println("Getting instance of LazyInitializationCounter");
        return uniqueInstance;
    }

    public void count() {
        System.out.println("Counting in LazyInitializationCounter");
        value++;
    }

    public int getValue() {
        return value;
    }
}
