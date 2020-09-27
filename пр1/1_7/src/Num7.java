
public class Num7 {
    public static void main(String[] args){
        System.out.println("Факториал числа: " + fact(4));
    }
    public static long fact(int n){
        long s = 1;
        for(int i = 1; i <= n; i++){
            s*= i;
        }
        return s;
    }
}
