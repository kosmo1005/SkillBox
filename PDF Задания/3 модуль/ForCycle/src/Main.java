import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int someNumber = new Scanner(System.in).nextInt();
        for (int i = 1; i <= someNumber; i++) {
            for (int i1 = 1; i1 <= someNumber; i1++)
                if (i * i1 % someNumber == 0 && i * i1 <= someNumber)
                    System.out.println(i + "*" + i1);
        }

    }
}