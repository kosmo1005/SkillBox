
public class Main {
    public static void main(String[] args) {
       // Имеющиеся ингридиенты.
        int milkAmount = 1300; // ml
        int powderAmount = 1200; // g
        int eggsCount = 10; // items
        int sugarAmount = 500; // g
        int oilAmount = 50; // ml
        int appleCount = 8; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Cooking apple juice");
        }

        //Готовим блины: powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        // Добавляем переменные, содержащие необходимый для приготовления объем ингридиентов.
        int reqiredPowderAmountPancakes = 400;
        int reqiredSugarAmountPancakes = 10;
        int reqiredMilkAmountPancakes = 1000;
        int reqiredOilAmountPancakes = 30;
        // Проверяем достаточно ли ингридиентов для блинчиков.
        boolean presenceOfPowderPancakes = powderAmount >= reqiredPowderAmountPancakes;
        boolean presenceOfSugarPancakes = sugarAmount >= reqiredSugarAmountPancakes;
        boolean presenceOfMilkPancakes = milkAmount >= reqiredMilkAmountPancakes;
        boolean presenceOfOilPancakes = oilAmount >= reqiredOilAmountPancakes;
        boolean cookingPancakes = presenceOfOilPancakes && presenceOfMilkPancakes && presenceOfPowderPancakes && presenceOfSugarPancakes;
        if (cookingPancakes){ // Если всего хватает...
            System.out.println("Можем приготовить блинчики");
        } else System.out.println("Для блинчиков ингридиентов не хватает");

        //Готовим омлет: milk - 300 ml, powder - 5 g, eggs - 5
        // Добавляем переменные, содержащие необходимый для приготовления объем ингридиентов.
        int reqiredPowderAmountOmelette = 5;
        int reqiredEggsCountOmelette = 5;
        int reqiredMilkAmountOmelette = 300;
        // Проверяем достаточно ли ингридиентов для омлета.
        boolean presenceOfPowderOmelette = powderAmount >= reqiredPowderAmountOmelette;
        boolean presenceOfEggsOmelette = eggsCount >= reqiredEggsCountOmelette;
        boolean presenceOfMilkOmelette = milkAmount >= reqiredMilkAmountOmelette;
        boolean cookingOmlette = presenceOfMilkOmelette && presenceOfEggsOmelette && presenceOfPowderOmelette;
        if (cookingOmlette){   // Если всего хватает...
            System.out.println("Можем приготовить омлет");
        } else System.out.println("Для омлета ингридиентов не хватает");

        //Готовим яблочный пирог: apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        // Добавляем переменные, содержащие необходимый для приготовления объем ингридиентов.
        int reqiredApplesCountApplePie = 3;
        int reqiredMilkAmountApplePie = 100;
        int reqiredPowderAmountApplePie = 300;
        int reqiredEggsCountApplePie = 4;
        // Проверяем достаточно ли ингридиентов для яблочного пирога.
        boolean presenceOfApplesApplePie = appleCount >= reqiredApplesCountApplePie;
        boolean presenceOfMilkApplePie = milkAmount >= reqiredMilkAmountApplePie;
        boolean presenceOfPowderApplePie = powderAmount >= reqiredPowderAmountApplePie;
        boolean presenceOfEggsApplePie = eggsCount >= reqiredEggsCountApplePie;
        boolean cookingApplePie = presenceOfApplesApplePie && presenceOfEggsApplePie && presenceOfMilkApplePie && presenceOfPowderApplePie;
        if (cookingApplePie){   // Если всего хватает...
            System.out.println("Можем приготовить яблочный пирог");
        } else System.out.println("Для яблочного пирога ингридиентов не хвататет");

        // Проверим хватает ли у нас ингридиентов, чтобы приготовить несколько блюд.
        //З.Ы. Если задумку можно реализовать эффективнее и лаконичнее, буду рад обратной связи.

        // МОЛОКО
        // Запишем в интовые переменные суммы объемов молока для разных комбинаций блюд.
        int reqiredMilkAll = reqiredMilkAmountPancakes + reqiredMilkAmountOmelette + reqiredMilkAmountApplePie; // 1000+300+100
        int reqiredMilkPO = reqiredMilkAmountPancakes + reqiredMilkAmountOmelette; // 1000+300
        int reqiredMilkPA = reqiredMilkAmountPancakes + reqiredMilkAmountApplePie; // 1000+100
        int reqiredMilkOA = reqiredMilkAmountOmelette + reqiredMilkAmountApplePie; // 300+100

        // Запишем в булиновые переменные на какие комбинации блюд нам хватит молока.
        boolean milkAll = false;
        boolean milkPO = false;
        boolean milkPA = false;
        boolean milkOA = false;

        if (milkAmount >= reqiredMilkAll){
            milkAll = true; // молока хватит на всё
        } else if (milkAmount >= reqiredMilkPO) {
            milkPO = true; // молока хватит на (блины и омлет) или (блины и пирог) или (омлет и пирог)
        } else if (milkAmount >= reqiredMilkPA){
            milkPA = true; // молока хватит на (блины и пирог) или (омлет и пирог)
        } else if (milkAmount >= reqiredMilkOA) {
            milkOA = true; // молока хватит только на (омлет и пирог)
        }

        // МУКА
        // Запишем в интовые переменные суммы объемов муки для разных комбинаций блюд.
        int reqiredPowderAll = reqiredPowderAmountPancakes + reqiredPowderAmountOmelette + reqiredPowderAmountApplePie; // 400+5+300
        int reqiredPowderPA = reqiredPowderAmountPancakes + reqiredPowderAmountApplePie; // 400+300
        int reqiredPowderPO = reqiredPowderAmountPancakes + reqiredPowderAmountOmelette; // 400+5
        int reqiredPowderAO = reqiredPowderAmountApplePie + reqiredPowderAmountOmelette; // 300+5

        // Запишем в булиновые переменные на какие комбинации блюд нам хватит муки.
        boolean powderAll = false;
        boolean powderPA = false;
        boolean powderPO = false;
        boolean powderAO = false;

        if (powderAmount >= reqiredPowderAll){
            powderAll = true; // муки хватит на всё
        } else if (powderAmount >= reqiredPowderPA){
            powderPA = true; // муки хватит на (блины и пирог) или (блины и омлет) или (пирог и омлет)
        } else if (powderAmount >= reqiredPowderPO){
            powderPO = true; // муки хватит на (блины и омлет) или (пирог и омлет)
        } else if (powderAmount >= reqiredPowderAO){
            powderAO = true; // муки хватит на (пирог и омлет)
        }

        // ЯЙЦА
        // Запишем в интовую переменную сумму количества яиц для омлета и пирога.
        int reqiredEggsAll = reqiredEggsCountOmelette + reqiredEggsCountApplePie; // 5+4

        // Запишем в булиновую переменную хватит ли нам яиц на омлет и пирог.
        boolean eggsAll = false;

        if (eggsCount >= reqiredEggsAll){
            eggsAll = true; // яиц хватит на омлет и  пирог
        }
        /* С помощью оператора switch создадим несколько возможных комбинаций блюд исходя из имеющихся ингридиентов.
        З.Ы. Перебрал не все возможные варианты. Там было бы всё еще сложнее.
         */
        int i = 0;
        if (milkAll && powderAll && eggsAll && presenceOfSugarPancakes && presenceOfOilPancakes && presenceOfApplesApplePie){
            i = 1;
        } else if ((milkAll||milkPO) && (powderAll||powderPO) && presenceOfEggsOmelette && presenceOfSugarPancakes && presenceOfOilPancakes){
            i = 2;
        } else if ((milkAll||milkPA) && (powderAll||powderPA) && presenceOfEggsApplePie && presenceOfSugarPancakes && presenceOfOilPancakes){
            i = 3;
        } else if ((milkAll||milkOA) && (powderAll||powderAO) && eggsAll && presenceOfApplesApplePie){
            i = 4;
        } else i = 5;

        switch (i){
            case 1: System.out.println("А вообще ингридиентов достаточно, чтобы приготовить все блюда");
                break;
            case 2: System.out.println("А вообще ингридиентов достаточно, чтобы приготовить блинчики и омлет");
                break;
            case 3: System.out.println("А вообще ингридиентов достаточно, чтобы приготовить блинчики и яблочный пирог");
                break;
            case 4: System.out.println("А вообще ингридиентов достаточно, чтобы приготовить омлет и яблочный пирог");
                break;
            default: System.out.println("Чтобы приготовить несколько блюд, ингридиентов не хватает");
        }
    }
}