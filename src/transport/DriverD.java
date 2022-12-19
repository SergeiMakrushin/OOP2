package transport;

import java.util.Objects;

public class DriverD extends Driver <RacingBus>{
    public DriverD(String fullName, String driverLicense, int experience, RacingBus transport) {
        super(fullName, driverLicense, experience, transport);
    }

    public  void startDriving() {
        System.out.println(getFullName()+" на "+ getTransport()+ " начал движение");
    }

    public  void stop() {
        System.out.println(getFullName()+" на "+ getTransport()+ " остановился");
    }

    public  void refuelingCar() {
        System.out.println(getFullName()+" на "+ getTransport()+ " заправляет машину");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return getDriverLicense() == driver.getDriverLicense() && getExperience() == driver.getExperience() && getFullName().equals(driver.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getDriverLicense(), getExperience());
    }

    @Override
    public String toString() {
        return "водитель " + getFullName() + '\'' +
                ", с категорией " + getDriverLicense() +
                ", стажем вождения " + getExperience() +
                " лет управляет автомобилем " + transport+",  будет участвовать в заезде";
    }
    public void chekDriverLicense() {
        if (getDriverLicense() == null || getDriverLicense().isBlank() || !getDriverLicense().equals("D")) {

        }else {
            throw new RuntimeException("Водитель не может управлять автомобилем");
        }
    }
}
