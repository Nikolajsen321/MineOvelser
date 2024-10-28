package Strategy;

public class MallardDuck extends Duck    {
    public MallardDuck() {
        // Initialiser med default flyveadfærd (fx FlyWithWings)
        super(new FlyWithWings());
    }
}
