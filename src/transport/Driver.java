package transport;

import java.util.Objects;

public abstract class Driver<T extends Transport & Competing> {
    private String fullName;
    private String driverLicense;
    private int experience;

    public T transport;


    public Driver(String fullName, String driverLicense, int experience, T transport) {
        setFullName(fullName);
        setDriverLicense(driverLicense);
        setExperience(experience);
        this.transport = transport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null && fullName.isBlank()) {
            this.fullName = "Введите ФИО";
        } else {
            this.fullName = fullName;
        }

    }

    public String getDriverLicense() {
        return driverLicense;

    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense != null) {
            this.driverLicense = driverLicense;
        } else {
            System.out.println("Водитель не может участвовать в гонках");

        }

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience == 0) {
            this.experience = Math.abs(experience);
        } else {

            this.experience = experience;
        }
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public abstract void startDriving();

    public abstract void stop();

    public abstract void refuelingCar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && fullName.equals(driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }


}
