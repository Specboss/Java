public class Main {
    public static void main(String[] args){
        MovableRectangle rec = new MovableRectangle(23,34,"Red", new Point(0,0));
        System.out.println(rec.toString());
        rec.move(23,23);
        System.out.println(rec.toString());
    }
}