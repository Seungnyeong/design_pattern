package strategy_pattern;

public class FlayNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 날지 못해요~");
    }
}
