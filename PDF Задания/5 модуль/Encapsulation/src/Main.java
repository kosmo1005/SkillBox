import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions boxOne = new Dimensions(4.27,5.12,6.33);
        Shipment shipmentOne = new Shipment
          (boxOne, 17.567,"ул. Пушкина, д. Колотушкина", true, "67ER6556KK",false);
        shipmentOne.chekShipment(); // Выведем параметры груза.
        Shipment shipmentForOrder = shipmentOne.setDeliveryAddress("111656, г. Москва, ул Горбунова, д. 2 стр. 3, помещ. II ком.");
        shipmentOne.chekShipment(); // Выведем параметры изначального объекта еще раз и убедимся, что объект не изменился.
        shipmentForOrder.chekOrder(); // Выведем параметры склонированного обхекта и убедимся, что измененный параметр поменялся.

        Elevator elevator = new Elevator(-3,16);
        elevator.input();

    }
}