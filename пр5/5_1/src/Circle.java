public class Circle extends Shape {
    float diameter;
    public Circle(String color, int diameter){
        super(color);
        this.diameter = diameter;
    }
    public void setDiameter(float diameter){
        this.diameter = diameter;
    }
    public float getDiameter(){
        return diameter;
    }
    public float calculateRadius(){
        return diameter / 2;
    }
    @Override
    public float getArea(){
        return (float)3.14* (calculateRadius() * calculateRadius());
    }
    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", color=" + color +
                '}';
    }
}
