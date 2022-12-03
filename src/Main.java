import transport.*;

import java.util.ArrayList;

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


        Data olga = new Data("olga", "gdf", "gdf");
        Data.dataVerification(olga);
        lada.passDiagnostics();
        paz.passDiagnostics();


        Transport.getCars().add(daf);
        Transport.getCars().add(nissan);
        Transport.getCars().add(simaz);
        for (Transport cars : Transport.getCars()) {
            System.out.println(cars);
        }

        Sponsor alfa = new Sponsor("alfa", 10000);
        Sponsor betta = new Sponsor("betta", 15000);
        Sponsor gamma = new Sponsor("gamma", 20000);

        Mechanic igor = new Mechanic<>("Игорь Николаев", "FitServise", daf);
        Mechanic andrei = new Mechanic<>("Андрей Великолепный", "СТО МАРС", nissan);
        Mechanic fedor = new Mechanic<>("Фёдор Трёшкин", "MT-Sib", simaz);
        daf.addDrivers(inna);
        daf.addMechanic(igor);
        daf.addMechanic(fedor);
        daf.addSponsor(alfa);
        nissan.addDrivers(ivnan);
        nissan.addMechanic(andrei);
        nissan.addSponsor(betta);
        simaz.addDrivers(alexeder);
        simaz.addMechanic(fedor);
        simaz.addSponsor(gamma);

        ArrayList<Mechanic> mechanics = daf.getMechanics();
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println(mechanics.get(i));
        }
        igor.fixCar();
        andrei.performMaintenance();

        ServiceStation carMechanic = new ServiceStation<>("Автомеханник");
        carMechanic.addCarsQueue(simaz);
        carMechanic.addCarsQueue(nissan);
        carMechanic.addCarsQueue(daf);

        carMechanic.technicalInspectionCar();


    }

}
