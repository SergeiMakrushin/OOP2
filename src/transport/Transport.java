package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;

    private String fuel;

    private String color;

    private int maxMovementSpeed;
    private float engineVolume;
    public static HashSet<Transport> cars;

    public static HashSet<Transport> getCars() {
        return cars;
    }

    private Set<Sponsor> sponsors = new HashSet<>();

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    private Set<Mechanic> mechanics = new HashSet<>();

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    private Set<Driver> drivers = new HashSet<>();

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public void addDrivers(Driver driver) {

        drivers.add(driver);
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }







    public Transport(float engineVolume, String model, String brand) {
        setBrand(brand);
        setModel(model);

        setEngineVolume(engineVolume);
         cars=new HashSet<>();
    }


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, float engineVolume, String fuel) {
        setBrand(brand);

        setModel(model);

        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = Math.abs(productionYear);
        }

        if (fuel == null || fuel.isBlank()) {
            this.fuel = "не указано";
        } else {
            this.fuel = fuel;
        }
        setColor(color);

        setEngineVolume(engineVolume);
    }


    public Transport(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed, String fuel) {
        setMaxMovementSpeed(maxMovementSpeed);
        setBrand(brand);


        setModel(model);


        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = Math.abs(productionYear);
        }

        if (fuel == null || fuel.isBlank()) {
            this.fuel = "не указано";
        } else {
            this.fuel = fuel;
        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String fuel) {
        setMaxMovementSpeed(maxMovementSpeed);
        setBrand(brand);


        setModel(model);


        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = Math.abs(productionYear);
        }

        if (fuel == null || fuel.isBlank()) {
            this.fuel = "не указано";
        } else {
            this.fuel = fuel;
        }
        setColor(color);
    }


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {

        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed >= 0) {
            this.maxMovementSpeed = maxMovementSpeed;
        } else {
            this.maxMovementSpeed = Math.abs(maxMovementSpeed);
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (Float.compare(engineVolume, 0) == 0) {

            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public abstract void startMoving();

    public abstract void endMoving();

    public void Print() {
        System.out.println("Брэнд " + getBrand()
                + ", модель " + getModel()
                + ", объём двигателя "
                + getEngineVolume() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}


