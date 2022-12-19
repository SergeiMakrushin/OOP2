import Product.Product;
import Product.Recipe;
import Product.SetInteger;
import transport.*;
import Product.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static Product.Passport.getPassportByPassportNumber;

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

        Product banans = new Product("Бананы", 95.0, 0.0);
        Product apples = new Product("Яблоки", 150.0, 1.5);
        Product cherry = new Product("Вишня", 250.0, 0.9);
        Product tomato = new Product("Помидоры", 140.0, 1.0);
        Product potato = new Product("Картофель", 20.0, 3.0);
        Product egg = new Product("Яйцо", 60.0, 2.0);
        Product milk = new Product("Молоко", 80.0, 1.0);
        Product cookies = new Product("Печенье", 100.0, 1.0);
        Product bread = new Product("Хлеб", 40.0, 1.0);

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
        r1.makeRecipeCard(banans);
        r1.makeRecipeCard(apples);
        r1.makeRecipeCard(cherry);
        System.out.println("***********");
        System.out.println(" рецепт 1  ");
        r1.printSet();
        System.out.println("r1 = " + r1);

        Recipe t1 = new Recipe("t1");
        t1.makeRecipeCard(tomato);
        t1.makeRecipeCard(potato);

        System.out.println(" рецепт 2 ");
        t1.printSet();
        System.out.println("t1 = " + t1);

        Recipe g3 = new Recipe("g3");
        g3.makeRecipeCard(apples);
        g3.makeRecipeCard(potato);
        g3.makeRecipeCard(cherry);
        System.out.println(" рецепт 3 ");
        g3.printSet();
        System.out.println("g3 = " + g3);

        System.out.println(" **************");
        SetInteger.oddSet(SetInteger.number);

        Multiplication.fd();

        Passport one = new Passport(123456, "Иванов", "Иван", "Иванович", "11.12.2000");
        Passport two = new Passport(123789, "Петров", "Алексей", "Дмитриевия", "23.04.2010");
        Passport three = new Passport(456951, "Blum", "Richard", null, "05.05.1983");
        Passport.addPassport(one);
        Passport.addPassport(two);
        Passport.addPassport(three);
        Passport foor = new Passport(456951, "Mag", "Tag", null, "25.07.1993");
        Passport.addPassport(foor);

        for (Passport passport : Passport.getPassports()
        ) {
            System.out.println(passport);
        }

        getPassportByPassportNumber(123789);
        System.out.println("*************************");


        TelephoneDirectory n1 = new TelephoneDirectory("Иван Иванов", "8-(383)-89523657");
        TelephoneDirectory n2 = new TelephoneDirectory("Иван Петров", "8-(383)-89523658");
        TelephoneDirectory n3 = new TelephoneDirectory("Иван Зайцев", "8-(383)-89523659");
        TelephoneDirectory n4 = new TelephoneDirectory("Иван Сидоров", "8-(383)-89523654");
        TelephoneDirectory n5 = new TelephoneDirectory("Иван Котов", "8-(383)-89523655");
        TelephoneDirectory n6 = new TelephoneDirectory("Иван Морской", "8-(383)-89523656");
        TelephoneDirectory n7 = new TelephoneDirectory("Иван Угрюмый", "8-(383)-89523651");
        TelephoneDirectory n8 = new TelephoneDirectory("Иван Веселов", "8-(383)-89523652");
        TelephoneDirectory n9 = new TelephoneDirectory("Иван Шмыга", "8-(383)-89523653");
        TelephoneDirectory n10 = new TelephoneDirectory("Дмитрий Петров", "7-(383)-89523657");
        TelephoneDirectory n11 = new TelephoneDirectory("Дмитрий Зайцев", "9-(383)-89523657");
        TelephoneDirectory n12 = new TelephoneDirectory("Дмитрий Тихий", "10-(383)-89523657");
        TelephoneDirectory n13 = new TelephoneDirectory("Дмитрий Легин", "3-(383)-89523657");
        TelephoneDirectory n14 = new TelephoneDirectory("Дмитрий Бобров", "2-(383)-89523657");
        TelephoneDirectory n15 = new TelephoneDirectory("Дмитрий Котов", "1-(383)-89523657");
        TelephoneDirectory n16 = new TelephoneDirectory("Дмитрий Зайцев", "6-(383)-89523657");
        TelephoneDirectory n17 = new TelephoneDirectory("Дмитрий Иванов", "5-(383)-89523657");
        TelephoneDirectory n18 = new TelephoneDirectory("Дмитрий Колита", "4-(383)-89523657");
        TelephoneDirectory n19 = new TelephoneDirectory("Борис Грызлов", "20-(383)-89523657");
        TelephoneDirectory n20 = new TelephoneDirectory("Борис Попов", "17-(383)-89523657");
        TelephoneDirectory.setListSubscribers(n1);
        TelephoneDirectory.setListSubscribers(n2);
        TelephoneDirectory.setListSubscribers(n3);
        TelephoneDirectory.setListSubscribers(n4);
        TelephoneDirectory.setListSubscribers(n5);
        TelephoneDirectory.setListSubscribers(n6);
        TelephoneDirectory.setListSubscribers(n7);
        TelephoneDirectory.setListSubscribers(n8);
        TelephoneDirectory.setListSubscribers(n9);
        TelephoneDirectory.setListSubscribers(n10);
        TelephoneDirectory.setListSubscribers(n11);
        TelephoneDirectory.setListSubscribers(n12);
        TelephoneDirectory.setListSubscribers(n13);
        TelephoneDirectory.setListSubscribers(n14);
        TelephoneDirectory.setListSubscribers(n15);
        TelephoneDirectory.setListSubscribers(n16);
        TelephoneDirectory.setListSubscribers(n17);
        TelephoneDirectory.setListSubscribers(n18);
        TelephoneDirectory.setListSubscribers(n19);
        TelephoneDirectory.setListSubscribers(n20);

        TelephoneDirectory.print();

        System.out.println("*************************");

        SimpleMap sea = new SimpleMap("море", 2);
        SimpleMap ball = new SimpleMap("мяч", 3);
        SimpleMap horse = new SimpleMap("конь", 4);
        SimpleMap field = new SimpleMap("Поле", 1);
        SimpleMap slep = new SimpleMap("сон", 7);
        SimpleMap.setSimpleMap(sea);
        SimpleMap.setSimpleMap(ball);
        SimpleMap.setSimpleMap(horse);
        SimpleMap.setSimpleMap(field);
        SimpleMap.setSimpleMap(slep);

        SimpleMap.print();
        System.out.println("*******************");

        List<Integer> a = new LinkedList<>();
        MapList.oddList(a);
        for (Integer integr : a) {
            System.out.println(integr);
        }
        List<Integer> b = new LinkedList<>();
        MapList.oddList(b);
        List<Integer> c = new LinkedList<>();
        MapList.oddList(c);
        List<Integer> d = new LinkedList<>();
        MapList.oddList(d);
        List<Integer> f = new LinkedList<>();
        MapList.oddList(f);

        String aa = "aa";
        String bb = "bb";
        String cc = "cc";
        String dd = "dd";
        String ff = "ff";

        MapList.putMap(aa, a);
        MapList.putMap(bb, b);
        MapList.putMap(cc, c);
        MapList.putMap(dd, d);
        MapList.putMap(ff, f);
        System.out.println("MapList.getSong() = " + MapList.getSong());

        MapList.putNewSong();

        System.out.println("*******************");

        NewMap a1 = new NewMap(1, "слон");
        NewMap a2 = new NewMap(2, "бегемот");
        NewMap a3 = new NewMap(3, "кот");
        NewMap a4 = new NewMap(4, "собака");
        NewMap a5 = new NewMap(5, "аист");
        NewMap a6 = new NewMap(6, "улитка");
        NewMap a7 = new NewMap(7, "лосось");
        NewMap a8 = new NewMap(8, "курица");
        NewMap a9 = new NewMap(9, "хорек");
        NewMap a10 = new NewMap(10, "ёж");
        NewMap.setValores(a1);
        NewMap.setValores(a2);
        NewMap.setValores(a3);
        NewMap.setValores(a4);
        NewMap.setValores(a5);
        NewMap.setValores(a6);
        NewMap.setValores(a7);
        NewMap.setValores(a8);
        NewMap.setValores(a9);
        NewMap.setValores(a10);
        NewMap.Print();


    }
}
