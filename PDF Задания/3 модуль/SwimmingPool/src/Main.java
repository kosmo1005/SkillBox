public class Main {
    public static void main(String[] args) {
        int overallVolume = 1200; // общий объем бассейна
        int fillingSpeed = 30; // литров прибывает за итерацию
        int devastationSpeed = 10; // литров утекает за итерацию
        int currentVolume = 0; // текущий объем наполнения
        int time = 0; // времени прошло
        while (true){
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            System.out.println(time++);
            if (currentVolume == overallVolume)
                break;
        }
        System.out.println("Для наполнения бассейна потребовалось " + time + " циклов :)");
    }
}