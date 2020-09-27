public class Num3 {
    public static void main(String[] args){
        int[] mas = {34,54,256,2,654}; //1000
        int sum = 0;
        for (int i = 0; i < mas.length; i++){
            sum+= mas[i];
        }
        System.out.println("for: "+sum);
        sum = 0;
        int i = 0;
        while(i < mas.length){
            sum += mas[i];
            i++;
        }
        System.out.println("while: " + sum);
        sum = 0;
        i = 0;
        do {
            sum+=mas[i];
            i++;
        }while (i < mas.length);
        System.out.println("do while: "+sum);
    }
}
