public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 3000; // количество кофе в граммах
        int milkAmount = 3000; // количество молока в граммах

        int cappucinoMilkReqired = 60; // требуемое количество молока для капучино
        int cappucinoCoffeeReqired = 15; // требуемое количество кофе для капучино

        if (coffeeAmount>=cappucinoCoffeeReqired){
            if (milkAmount>=cappucinoMilkReqired)
                System.out.println("Готовим капучино");
            else System.out.println("Недостаточно молока");
        } else System.out.println("Недостоточно кофе");




    }
}