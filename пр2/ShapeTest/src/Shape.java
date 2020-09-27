public class Shape {
    int x;
    int y;
    int z;
    public Shape(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    int getZ(){
        return z;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    void setZ(int z){
        this.z = z;
    }
    @Override
    public String toString() {
        return "X = " + x+", Y = " + y + ", Z = " + z;
    }
}
