import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число");
            int someNumber = new Scanner(System.in).nextInt();
            int a = 1;
            for (int i = 1; i <= someNumber; i++)
                a = a*i;
            someNumber = a;
            System.out.println("Факториал этого числа равен " + someNumber);
        }
    }
}