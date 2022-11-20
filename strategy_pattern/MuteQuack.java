package ex_1_duck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<조용>>");
    }
}
