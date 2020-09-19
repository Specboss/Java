public class Main {
    public static void main(String[] args){
        PointMovable pointMovable = new PointMovable(0,0);
        pointMovable.move(23,28);
        System.out.println(pointMovable);
        CircleMovable circle = new CircleMovable(34, new Point(28,90));
        System.out.println(circle);
    }
}
