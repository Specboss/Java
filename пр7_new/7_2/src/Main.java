import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String fio = new Scanner(System.in).nextLine();
        if (fio.matches(("(.*)[\\-a-zA-ZА-Яа-я()]\\s(.*)[\\-a-zA-ZА-Яа-я()]\\s(.*\\S)[\\-a-zA-ZА-Яа-я()]"))) {
            System.out.println("Фамилия: " +  fio.split(" ")[0]);
            System.out.println("Имя: " +  fio.split(" ")[1]);
            System.out.println("Отчество: " +  fio.split(" ")[2]);
        }
        else if (fio.matches(("(.*)[\\-a-zA-ZА-Яа-я()]\\s(.*)[\\-a-zA-ZА-Яа-я()]"))){
            System.out.println("Фамилия: " +  fio.split(" ")[0]);
            System.out.println("Имя: " +  fio.split(" ")[1]);
        }
    }
}
