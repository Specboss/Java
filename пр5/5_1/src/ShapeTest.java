public class ShapeTest {
    public static void main(String[] args){
        Rectangle rec = new Rectangle(23,24,"Red");
        Square square = new Square("Black", 23);
        Circle circ = new Circle("Green", 46);
        System.out.println(rec.toString());
        System.out.println(circ.toString());
        System.out.println(square.toString());
    }
}
