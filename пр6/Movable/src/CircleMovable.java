public class CircleMovable extends Circle implements Movable {
    Point p;

    public CircleMovable(int cD, Point p) {
        super(cD);
        this.p = p;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    @Override
    public void move(int right, int down) {
        p.setY(p.getY() + down);
        p.setX(p.getX() + right);

    }
    @Override
    public String toString(){
        return super.toString() + "{x = "+p.getX() + ", y =" + p.getY() + "}";
    }
}
