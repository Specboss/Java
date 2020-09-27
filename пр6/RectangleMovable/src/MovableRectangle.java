public class MovableRectangle extends Rectangle implements Movable {
    Point point;

    public MovableRectangle(float width, float height, String color, Point point) {
        super(width, height, color);
        this.point = point;
    }

    @Override
    public void move(int right, int down) {
        point.setX(point.getX() + right);
        point.setY(point.getY()+down);
    }

    @Override
    public String toString() {
        return super.toString() + " {x=" + point.getX() + ", y=" + point.getY()+"}";
    }
}
