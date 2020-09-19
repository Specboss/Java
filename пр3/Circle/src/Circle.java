public class Circle {
    int circleDiameter;
    public Circle(int cD){
        circleDiameter = cD;
    }
    public void setCircleDiameter(int cD){
        circleDiameter = cD;
    }
    public int getCircleDiameter(){
        return circleDiameter;
    }
    public float getRadius(){
        return circleDiameter / 2;
    }
    public void printCircle(){
        System.out.println("Диаметр окружности: " + circleDiameter + "\nРадиус окружности: " + getRadius());
    }
}
