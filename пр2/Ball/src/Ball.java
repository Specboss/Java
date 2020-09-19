public class Ball {
    String brandName;
    float ballSize;
    public Ball(String bn, float bs){
        brandName = bn;
        ballSize = bs;
    }
    public void SetSize(float size){
        if (size <= 0) { return; }
        else {ballSize = size;}
    }
    public void SetBrandName(String bn){
        if (!bn.isEmpty()) brandName = bn;
        else brandName = "Ball";
    }
    public void KickBall(){
        System.out.println("Thr ball was kick!");
    }
    public String GetBrandName(){
        return brandName;
    }
    public float GetSize(){
        return ballSize;
    }
    public void PrintInfoAboutBall(){
        System.out.println("Brand name: " + brandName + ", Ball size: " + ballSize);
    }
    @Override
    public String toString(){
        return brandName + " " + ballSize;
    }
}
