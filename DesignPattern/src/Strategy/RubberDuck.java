package Strategy;

public class RubberDuck extends Duck{
    public RubberDuck() {
        // Initialiser med default flyveadfærd (fx FlyNoWay)
        super(new FlyNoWay());
    }
}
