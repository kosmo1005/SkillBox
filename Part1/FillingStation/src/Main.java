public class Main {
    public static void main(String[] args){
        System.out.println("Расчет стоимости топлива");
        int fuelTupe = 95; // тип топлива
        int amountFuel = 420; // объем топлива
        double fuel92Price = 60.2; // цена 92
        double fuel95Price = 67.56; // цена 95
        double fuelPrice = 0;
        int maxAmount = 400;


        if (amountFuel < 1){ // если объем меньше 1, то объем выставляется равным 0, чтобы нельзя было поставить отрицательное значение.
            System.out.println("Указано неверное количество топлива");
            amountFuel = 0;
        }
        if (amountFuel>maxAmount){ // если объем превышает 400л, то выставляется 400, потому что это максимально возможный отпускаемый объем.
            System.out.println("Указанный объем топлива превышает максимально отпускаемый объем - 400л.");
            amountFuel = maxAmount;
        }

        if(fuelTupe == 92) {
            fuelPrice = fuel92Price;
            double totalPrice = fuelPrice*amountFuel;
            System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
            System.out.println("Объем топлива: " + amountFuel + " л.");
            System.out.println("Стоимость топлива составляет " + totalPrice + " руб.");
        }
        else if (fuelTupe == 95){
            fuelPrice = fuel95Price;
            double totalPrice = fuelPrice*amountFuel;
            System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
            System.out.println("Объем топлива: " + amountFuel + " л.");
            System.out.println("Стоимость топлива составляет " + totalPrice + " руб.");
        } else {
            System.out.println("Указан неверный тип топлива");
        }
    }
}