public class PointMovable extends Point implements Movable {

    public PointMovable(int x, int y) {
        super(x, y);
    }
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void move(int right, int down) {
        x+=right;
        y += down;
    }
}
