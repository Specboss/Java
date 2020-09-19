public class Leg extends Organ {
    float legSize;
    public Leg(float length, float legSize) {
        super(length);
        this.legSize = legSize;
    }
    public void setLegSize(float lS){
        this.legSize = lS;
    }
    public float getLegSize(){
        return legSize;
    }
    public void printLeg(){
        System.out.println("Длина ноги: " + length + ", Размер ноги: " + legSize);
    }
}
