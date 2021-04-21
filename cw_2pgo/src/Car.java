public class Car {
    String brand;
    String color;
    double capacity;


    Car(String brand, String color, double capacity) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
    }
    String carInfo(String brand, String color){
        return "Kolor samochodu:" + this.color + " Marka:" + this.brand;
    }
    void changeCapacity(double newCapacity){
        this.capacity = newCapacity;
    }
    boolean isHigh(double capacity){
        if(capacity <= 2.0){
            return false;
        }
        return true;
    }


}

