package transport;

import java.time.LocalDate;

public class Car extends Transport implements PassDiagnostic {


    public static class Key {
        private String remoteEngineStart;
        private String keyFree;

        public Key(String remoteEngineStart, String keyFree) {
            if (remoteEngineStart == null && remoteEngineStart.isBlank()) {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keyFree != null && !keyFree.isBlank()) {
                if (keyFree.equalsIgnoreCase("есть") || keyFree.equalsIgnoreCase("нет")) {
                    this.keyFree = remoteEngineStart;
                } else this.keyFree = "Данные неверны";
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeyFree() {
            return keyFree;
        }

    }


    public static class Insurance {
        private String insurancePeriod;
        private double costInsurance;
        private String numberInsurance;
        private double s = Math.pow(10, 3);
        private LocalDate b;

        public Insurance(String insurancePeriod, double costInsurance, String numberInsurance) {

            if (this.insurancePeriod == null || this.insurancePeriod.isBlank() || this.insurancePeriod.length() != 10) {
                this.insurancePeriod = "Заполните данные в формате гггг-мм-дд  с тире";
            } else if (Character.isDefined(this.insurancePeriod.charAt(4))
                    || Character.isDefined(this.insurancePeriod.charAt(7))
                    || Character.isDigit(this.insurancePeriod.charAt(0))
                    || Character.isDigit(this.insurancePeriod.charAt(1))
                    || Character.isDigit(this.insurancePeriod.charAt(2))
                    || Character.isDigit(this.insurancePeriod.charAt(3))
                    || Character.isDigit(this.insurancePeriod.charAt(5))
                    || Character.isDigit(this.insurancePeriod.charAt(6))
                    || Character.isDigit(this.insurancePeriod.charAt(8))
                    || Character.isDigit(this.insurancePeriod.charAt(9))) {
                LocalDate b = LocalDate.parse(this.insurancePeriod);
                b.isBefore(LocalDate.now());
                this.insurancePeriod = "Поменяйте страховку";
            }
            if (costInsurance < 0) {
                costInsurance = Math.abs(costInsurance);
                this.costInsurance = Math.ceil(costInsurance * s) / s;
            }
            if (numberInsurance == null || numberInsurance.isBlank()) {
                if (numberInsurance.length() != 9) {
                    this.numberInsurance = "Неверный номер";
                } else this.numberInsurance = numberInsurance;
            }
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public String getInsurancePeriod() {

            return insurancePeriod;
        }

        public double getCostInsurance() {
            return costInsurance;
        }
    }


    private String transmission;
    private final String body;
    private final int numberSeats;
    private String tyres;
    private String registrationNumber;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               float engineVolume, String transmission, String registrationNumber, String body, int numberSeats, String tyres, String fuel) {
        super(brand, model, productionYear, productionCountry, color, engineVolume, fuel);


        if (transmission != null || !transmission.isEmpty() || !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = ": Информация не указана";
        }

        if (body != null || !body.isEmpty() || !body.isBlank()) {
            this.body = body;
        } else {
            this.body = ": Информация не указана";
        }

        if (registrationNumber != null || registrationNumber.isBlank()) {

            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Неправильный номер";
        }

        this.numberSeats = numberSeats;

        if (tyres != null || !tyres.isEmpty() || !tyres.isBlank()) {
            this.tyres = tyres;
        } else {
            this.tyres = ": Информация не указана";
        }

    }

    public Key getKey() {
        return key;
    }


    public void setKey(Key key) {
        if (key == null) {
            this.key = key;
        }
    }


    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }


    public String getBody() {
        return body;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTires() {
        return tyres;
    }

    public void setTires(String tires) {
        this.tyres = tires;
    }

    public void print() {
        System.out.println(
                super.getBrand() + " "
                        + super.getModel() + ", "
                        + super.getProductionYear()
                        + " год выпуска, сборка в "
                        + super.getProductionCountry()
                        + " , цвет "
                        + super.getColor()
                        + " , объём двигателя "
                        + getEngineVolume() + " л, коробка передач "
                        + transmission + ", тип кузова "
                        + body + ", регистрационный номер: " + registrationNumber + ", количество мест "
                        + numberSeats + ", шины "
                        + tyres + ", вид топлива: "
                        + super.getFuel() + ".");
    }

    public void keys() {
        System.out.println(getKey());
    }


    public void kprint() {
        System.out.println(getInsurance());

    }

    public void refill() {
        String a = "дизельное топливо";
        String b = "бензин";
        String c = "электричество";
        if (getFuel().equalsIgnoreCase(a) == true) {
            System.out.println("Заправьте дизельное топливо на заправке");
        } else if (getFuel().equalsIgnoreCase(b) == true) {
            System.out.println("Заправьте бензин на заправке");
        } else if (getFuel().equalsIgnoreCase(c) == true) {
            System.out.println("Зарядите на электро парковке");
        } else {
            System.out.println("укажите: бензин, электричество или дизельное топливо");
        }

    }

    public void startMoving() {

    }

    public void endMoving() {

    }


    public void changeTyres() {
        String a = "летние";
        if (tyres.equals(a) == true) {
            tyres = "зимние";
        } else {
            tyres = "летние";
        }
    }

    public void number() {
        this.registrationNumber.toCharArray();
        if (this.registrationNumber.toCharArray().length != 9) {
            this.registrationNumber = "Неверная длина номера";
        } else if (!Character.isLetter(this.registrationNumber.charAt(0))
                || !Character.isLetter(this.registrationNumber.charAt(4))
                || !Character.isLetter(this.registrationNumber.charAt(5))) {
            this.registrationNumber = "Неверно указан символ";
        } else if (!Character.isDigit(this.registrationNumber.charAt(1))
                || !Character.isDigit(this.registrationNumber.charAt(2))
                || !Character.isDigit(this.registrationNumber.charAt(3))
                || !Character.isDigit(this.registrationNumber.charAt(6))
                || !Character.isDigit(this.registrationNumber.charAt(7))
                || !Character.isDigit(this.registrationNumber.charAt(8))) {
            this.registrationNumber = "Неверно указан символ!";
        } else {
            this.registrationNumber = registrationNumber.toLowerCase();
        }
    }

    @Override
    public boolean passDiagnostics() throws CantPassDiagnostics {
        if (getBody() == null) {
            System.out.println("fd");
        }
        return true;
    }
}
