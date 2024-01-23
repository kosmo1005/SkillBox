import java.util.Scanner;

public class Elevator {
    int currentFloor = 1;
    int minFloor;
    int maxFloor;
    private int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor (){
        return currentFloor;
    }
    public void moveUp (){
        if (currentFloor < maxFloor){
            currentFloor = currentFloor++;
            System.out.println(currentFloor+1 + " этаж.");
        } else System.out.println("Это последний этаж. Выше только рай.");
    }
    public void moveDown (){
        if (currentFloor > minFloor){
            currentFloor = currentFloor--;
            System.out.println(currentFloor-1 + " этаж.");
        } else System.out.println("Это последний этаж. Ниже только ад.");
    }
    public void move (){
        if (floor<minFloor||floor>maxFloor) {
            System.out.println("Такого этажа нету в этом здании.");
        } else {
            if (currentFloor < floor) {
                for (; currentFloor < floor; currentFloor++) {
                    moveUp();
                }
            } else if (currentFloor > floor) {
                for (; currentFloor > floor; currentFloor--) {
                    moveDown();
                }
            } else System.out.println("Вы на этом этаже.");
        }
    }
    public void input (){ // Метод имитирует панель ввода. Позволяет нажать кнопку вверх, вниз или указать этаж.
        while (true){
            System.out.println("Нажмите ВВЕРХ или ВНИЗ или введите номер этажа.");
            String input = new Scanner(System.in).next();
            try {
                int number = Integer.parseInt(input);
                floor = number;
                move();
            } catch (NumberFormatException e) {
                switch (input){
                    case ("ВВЕРХ") -> moveUp();
                    case ("ВНИЗ") -> moveDown();
                    default -> System.out.println("Введено неверное значение.");
                }
            }
        }
    }
}
