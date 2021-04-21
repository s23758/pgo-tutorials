public class Main {

    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("Xiaomi",5.8, 123456789);
        Telephone telephone2 = new Telephone("Nokia", 4.7, 987654321);

        System.out.println(telephone1.wyslijWiadomosc("Ptaki lataja kluczem", telephone2.numer));

        Car car1 = new Car("Volkswagen","Czarny",3.8);

        System.out.println(car1.carInfo(car1.color, car1.brand));

        car1.changeCapacity(1.9);
        System.out.println("Zmieniona pojemnosc silnika to " + car1.capacity);

        car1.isHigh(car1.capacity);
        System.out.println("Czy silnik jest wysokoobrotowy : " +car1.isHigh(car1.capacity));





    }
}
