import Product.Product;
import Product.Recipe;
import Product.SetIntegers;
import transport.*;
import Product.*;

import java.util.Arrays;

import static Product.Passport.getPassportByPassportNumber;
import static Product.Passport.passports;

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


        Data olga = new Data("olga", "gdf470", "gdf470");
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
        daf.addMechanic(igor);
        daf.addSponsor(alfa);
        nissan.addDrivers(ivnan);
        nissan.addMechanic(andrei);
        nissan.addSponsor(betta);
        simaz.addDrivers(alexeder);
        simaz.addMechanic(fedor);
        simaz.addSponsor(gamma);


        igor.fixCar();
        andrei.performMaintenance();

        ServiceStation carMechanic = new ServiceStation<>("Автомеханник");
        carMechanic.addCarsQueue(simaz);
        carMechanic.addCarsQueue(nissan);
        carMechanic.addCarsQueue(daf);

        carMechanic.technicalInspectionCar();
        System.out.println(daf.getMechanics());

        Product banans = new Product("Бананы", 95, 2);
        Product apples = new Product("Яблоки", 150, 1.5);
        Product cherry = new Product("Вишня", 250, 0.9);
        Product tomato = new Product("Помидоры", 140, 1);
        Product potato = new Product("Картофель", 20, 3);
        Product egg = new Product("Яйцо", 60, 2);
        Product milk = new Product("Молоко", 80, 1);
        Product cookies = new Product("Печенье", 100, 1);
        Product bread = new Product("Хлеб", 40, 1);

        Product.addProduct(banans);
        Product.addProduct(apples);
        Product.addProduct(cherry);
        Product.addProduct(tomato);
        Product.addProduct(potato);
        Product.productQuantity(potato);
        for (Product products : Product.getProducts()) {
            System.out.println(products);
        }
        Recipe r1 = new Recipe("r1");
        r1.makeRecipe(banans);
        r1.makeRecipe(apples);
        r1.makeRecipe(cherry);
        System.out.println("***********");
        System.out.println(" рецепт 1  ");
     r1.printSet();
        System.out.println("r1 = " + r1);

        Recipe t1 = new Recipe("t1");
        t1.makeRecipe(tomato);
        t1.makeRecipe(potato);

        System.out.println(" рецепт 2 ");
        t1.printSet();
        System.out.println("t1 = " + t1);

        Recipe g3 = new Recipe("g3");
        g3.makeRecipe(apples);
        g3.makeRecipe(potato);
        g3.makeRecipe(cherry);
        System.out.println(" рецепт 3 ");
                g3.printSet();
        System.out.println("g3 = " + g3);

        System.out.println(" **************");
        SetIntegers.oddSet(SetIntegers.number);

        Multiplication.fd();

        Passport one = new Passport(123456, "Иванов", "Иван", "Иванович", "11.12.2000");
        Passport two = new Passport(123789, "Петров", "Алексей", "Дмитриевия", "23.04.2010");
        Passport three = new Passport(456951, "Blum", "Richard", null, "05.05.1983");
        Passport.addPassport(one);
        Passport.addPassport(two);
        Passport.addPassport(three);
        Passport foor = new Passport(456951, "Mag", "Tag", null, "25.07.1993");
        Passport.addPassport(foor);

        for (Passport passport: Passport.getPassports()
             ) {
            System.out.println(passport);
        }

        getPassportByPassportNumber(123789);



    }
}
