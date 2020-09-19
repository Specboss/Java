public class Human {
    Leg leg;
    Head head;
    Hand hand;
    public Human(Leg l, Head h, Hand hand){
        leg = l;
        head = h;
        this.hand = hand;
    }
    public void printHuman(){
        head.printHead();
        hand.printHand();
        leg.printLeg();
    }
}
