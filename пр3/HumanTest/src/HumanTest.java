public class HumanTest {
    public static void main(String[] args) {
        Leg l = new Leg(90, 45);
        Hand h = new Hand(60);
        Head head = new Head(32, "Brown");
        Human human = new Human(l, head, h);
        human.printHuman();
        
    }
}
