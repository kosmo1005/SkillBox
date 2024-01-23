public class Dimensions {
    private final double width;
    private final double height;
    private final double lenght;

    public Dimensions(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    // ГЕТТЕРЫ
    public double getWidth() {
        return width;}
    public double getHeight() {
        return height;}
    public double getLenght() {
        return lenght;}

    // СЕТТЕРЫ
    public Dimensions setWidth (double width){
        return new Dimensions(width,height,lenght);
    }
    public Dimensions setHeight (double height){
        return new Dimensions(width,height,lenght);
    }
    public Dimensions setLenght (double lenght){
        return new Dimensions(width,height,lenght);
    }


    public double shipmentVolume() {
        return width * height * lenght;
    }
}
