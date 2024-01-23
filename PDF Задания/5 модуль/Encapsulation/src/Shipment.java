public class Shipment {
    private final Dimensions dimensions; //габариты
    private final double weight; // масса
    private String deliveryAddress; // адрес доставки
    private final boolean notToBeTurned; //можно ли переворачивать
    String registrationNumber; // Рег. номер
    private final boolean fragile; // хрупкость

    public Shipment (Dimensions dimensions,
                     double weight,
                     String deliveryAddress,
                     boolean notToBeTurned,
                     String registrationNumber,
                     boolean fragile){
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.notToBeTurned = notToBeTurned;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;

    }
    // ГЕТТЕРЫ
    public Dimensions getDimensions() {
        return dimensions;}
    public double getWeight() {
        return weight;}
    public String getDeliveryAddress() {
        return deliveryAddress;}
    public boolean getNotToBeTurned(){
        return notToBeTurned;}
    public String getRegistrationNumber() {
        return registrationNumber;}
    public boolean getFragile() {
        return fragile;}

    // СЕТТЕРЫ
    public Shipment setDimensions(Dimensions dimensions){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}
    public Shipment setWeight(double weight){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}
    public Shipment setDeliveryAddress(String deliveryAddress){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}
    public Shipment setNotToBeTurned(boolean notToBeTurned){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}
    public Shipment setRegistrationNumber(String registrationNumber){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}
    public Shipment setFragile(boolean fragile){
        return new Shipment (dimensions,weight,deliveryAddress,notToBeTurned,registrationNumber,fragile);}


    public void chekShipment (){
        System.out.println("Сведения о товаре по базе:");
        chek();
    }
    public void chekOrder (){
        System.out.println("Сведения о заказе:");
        chek();
    }
    private void chek (){
        System.out.println("Габариты: " + dimensions.getHeight() + " х " + dimensions.getLenght() + " х " +  dimensions.getWidth() + " см.");
        System.out.println("Объем: " + dimensions.shipmentVolume() + "см³");
        System.out.println("Масса: " + getWeight() + "кг.");
        System.out.println("Адрес доставки: " + getDeliveryAddress());
        System.out.println("Не кантовать: " + (getNotToBeTurned() ? " Да." : " Нет."));
        System.out.println("Рег. №: " + getRegistrationNumber());
        System.out.println("Хрупкий: " + (getFragile() ? " Да." : " Нет."));
        System.out.println("");
    }

}

