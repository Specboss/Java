import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]){
        String number = new Scanner(System.in).nextLine();
        if(number.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")){
            System.out.println(number);
        }
        else{
            System.out.println("Неверный формат номера");
        }
    }
}
