public class Rectangle extends Shape {
    float width;
    float height;
    public Rectangle(float width, float height, String color){
        super(color);
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public float getArea() {
        return height * width;
    }
    public float getPerimeter(){
        return width + height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
