public class StartTheCar {

    // грубая имитация приборной панели

    public static void main(String[] args) {
        int batteryVoltage = 12; // напряжение в аккумуляторе
        int outsideTemperature = 10; // температура за бортом
        boolean fuel = true; // топливо
        boolean throttle = true; // дроссельный узел
        boolean networkPower = true; // питание сети
        boolean nozzles = true; // форсунки

        boolean fuelSupply = fuel && networkPower && nozzles; // подача топлива
        boolean airSupply = throttle && networkPower; // подача воздуха

        if (batteryVoltage<12 || !networkPower) {
            System.out.println("Обрыв цепи, либо аккумулятор разряжен. Придётся заводить с толкача.");
        } else if (outsideTemperature<-25){
            System.out.println("За бортом колотун, машина не заведется.");
        } else if (!fuelSupply){
            System.out.println("Кончился бензин или засрались форсунки");
        } else if (!airSupply) {
            System.out.println("Пора почистить дроссель, или контакт опять отошёл.");
        } else System.out.println("Машина заводится.");
    }
}
