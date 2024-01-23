import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        System.out.println("Мы загадали число! Угадай какое))");
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt<value){
                System.out.println("Не угадал! Мы загадали что-то побольше))");
            } else if (attempt>value){
                System.out.println("Не угадал! Мы поменьше загадали))");
            } else { System.out.println("Верноо! Ты угадал! Поздравляем!!!");
            break;
            }
        }
    }
}