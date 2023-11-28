package web.model;

public class Car {
    private String color;
    private String brand;
    private int serial;

    public Car(String color, String brand, int serial) {
        this.color = color;
        this.brand = brand;
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", serial=" + serial +
                '}';
    }
}
