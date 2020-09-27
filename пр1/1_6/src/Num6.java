import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Num6 {
    public static void main(String[] args){
        double[] mas = new double[10];
        for(int i = 0; i < mas.length;i++){
            mas[i] = Math.random();
        }
        var out = System.out;
        out.println("Math random():");
        for(int i = 0; i < mas.length; i++){
            out.print(mas[i] + " ");
        }
        out.println();
        out.println("Sorted array:");
        Arrays.sort(mas);
        for(int i = 0; i < mas.length; i++){
            out.print(mas[i] + " ");
        }
        out.println();

        /////
        out.println("Random:");
        Random r = new Random(435);
        for(int i = 0; i < mas.length; i++){
            mas[i] = r.nextDouble();
        }
        for(int i = 0; i < mas.length; i++){
            out.print(mas[i] + " ");
        }
        out.println();
        out.println("Sorted array:");
        Arrays.sort(mas);
        for(int i = 0; i < mas.length; i++){
            out.print(mas[i] + " ");
        }
    }
}
