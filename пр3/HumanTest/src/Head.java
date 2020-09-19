public class Head extends Organ {
    String hairColor;
    public Head(float sizeHead, String hairColor){
        super(sizeHead);
        this.hairColor = hairColor;
    }
    void setHairColor(String hC){
        hairColor = hC;
    }
    public String getHairColor(){
        return hairColor;
    }
    public void printHead(){
        System.out.println("Размер головы: " + length + ", Цвет волос на голове: " + hairColor);
    }
}
