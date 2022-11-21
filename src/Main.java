import transport.*;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, CantPassDiagnostics {
        System.out.println("Hello world!");
        RacingBus paz = new RacingBus(4.7f, "ПАЗ", "32054", RacingBus.Capacyty.SMALL);
        RacingBus baw = new RacingBus(3.2f, "BAW", "SREET", RacingBus.Capacyty.SMALL);
        RacingBus higer = new RacingBus(6.7f, "Higer", "KLQ6928Q", RacingBus.Capacyty.LARGE);
        RacingBus simaz = new RacingBus(5f, "СИМАЗ", "2258", RacingBus.Capacyty.MEDIUM);


        PassengerCar toyota = new PassengerCar(1.5f, "toyota", "corolla", PassengerCar.TapeBody.SEDAN);
        PassengerCar nissan = new PassengerCar(1.8f, "nissan", "primera", PassengerCar.TapeBody.SEDAN);
        PassengerCar lada = new PassengerCar(1.7f, "Lada", "Granta", PassengerCar.TapeBody.HATCHBACK);
        PassengerCar hyundai = new PassengerCar(1.6f, "hyundai", "Avante", PassengerCar.TapeBody.SEDAN);


        Truck isuzu = new Truck(4.6f, "isuzu", "NQR", Truck.LoadCapacity.N2);
        Truck gaz = new Truck(4.3f, "GAZ", "66", Truck.LoadCapacity.N2);
        Truck baw1 = new Truck(3.2f, "BAW", "Tonik", Truck.LoadCapacity.N1);
        Truck daf = new Truck(12f, "DAF", "CF85", Truck.LoadCapacity.N3);

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
        System.out.println("toyota = " + toyota);
        System.out.println("paz = " + paz);
        paz.Print();
        gaz.Print();
        lada.Print();


        Car laba = new Car(
                "Lada",
                "Granta",
                2015,
                "России",
                "жёлтый",
                1.7f,
                "автоматическая", "x000xx000",
                "седан",

                3, "летние",
                "бензин");


        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германии",
                "черный",
                3.0f,
                "механическа", "x000xx000",
                "седан",
                4,
                "зимние",
                "бензин");

        Car bmv = new Car(
                "BMW",
                "Z8",
                2021,
                "Германии",
                "черный",
                3.0f,
                "робот", "x000xx000",
                "купе",

                3, "летние",
                "бензин");

        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2018,
                "Южной Корее",
                "красный",
                2.4f,
                "автоматическа", "x000xx000",
                "кроссовер",
                5, "летние",
                "бензин");

        Car hyundi = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Южной Корее",
                "оранжевый",
                1.6f,
                "механическая", "x000xx000",
                "седан",

                4, "зимние",
                "jhgjg");




        Data olga = new Data("olga", "gdf", "gdf");
        Data.dataVerification(olga);
        lada.passDiagnostics();
        paz.passDiagnostics();
    }

}