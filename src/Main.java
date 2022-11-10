import transport.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        RacingBus paz = new RacingBus(4.7f, "ПАЗ", "32054");
        RacingBus baw = new RacingBus(3.2f, "BAW", "SREET");
        RacingBus higer = new RacingBus(6.7f, "Higer", "KLQ6928Q");
        RacingBus simaz = new RacingBus(5f, "СИМАЗ", "2258");


        PassengerCar toyota = new PassengerCar(1.5f, "toyota", "corolla");
        PassengerCar nissan = new PassengerCar(1.8f, "nissan", "primera");
        PassengerCar lada = new PassengerCar(1.7f, "Lada", "Granta");
        PassengerCar hyundai = new PassengerCar(1.6f, "hyundai", "Avante");


        Truck isuzu = new Truck(4.6f, "isuzu", "NQR");
        Truck gaz = new Truck(4.3f, "GAZ", "66");
        Truck baw1 = new Truck(3.2f, "BAW", "Tonik");
        Truck daf = new Truck(12f, "DAF", "CF85");

        paz.Print();
        paz.startMoving();
        paz.endMoving();
        paz.bestLapTime(5.65);
        paz.maximumSpeed(140);
        paz.pitStop();

        toyota.Print();
        toyota.startMoving();
        toyota.endMoving();

        isuzu.Print();
        isuzu.startMoving();
        isuzu.endMoving();
        DriverB ivnan = new DriverB("Иван", "B", 16, nissan);
        DriverC alexeder = new DriverC("Александр", "C", 5, daf);
        DriverD inna = new DriverD("Инна", "D", 10, simaz);
        System.out.println("inna = " + inna);
        System.out.println("ivnan = " + ivnan);
        System.out.println("alexeder = " + alexeder);
        inna.startDriving();
        ivnan.stop();
        alexeder.refuelingCar();

    }
}