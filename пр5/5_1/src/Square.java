public class Square extends Shape {
    float size;
    public Square(String color, float size){
        super(color);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public float getArea() {
        return size * size;
    }
    public float getPerimeter(){
        return size * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", color=" + color +
                '}';
    }
}
