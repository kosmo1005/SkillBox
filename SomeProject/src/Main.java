import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Введите номер, имя или команду:");
            String string = scanner.nextLine();
            // регекс, проверяющий является ли ввод номером телефона
            String regexNumber = "[+]?[7-8]{1}[-(\s]?[0-9]{3}[-(\s]?[0-9]{3}[-]?[0-9]{2}[-]?[0-9]{2}";
            // регекс, очищающий номер телефона до дефолта
            String regexClean = "[^0-9]";
            // регекс, проверяющий является ли ввод именем
            String regexName = "[а-яА-Я]{2,}";

            if (string == "LIST"){
                phoneBook.typePhoneBook(); //напечатать телефонную книгу
            } else if (string.matches(regexNumber)){ // если это номер
                string.replaceAll(regexClean,""); // чистим номер
                Integer number = Integer.valueOf(string); // преобразовываем в интж
                if (phoneBook.checkNumber(number)){ // проверяем наличие номера в книге

                }

            } else if (string.matches(regexName)){
                // логика по имени
            } else System.out.println("Неверный формат ввода");
        }
    }
}