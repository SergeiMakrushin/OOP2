package transport;

import java.util.Objects;

public class Truck extends Transport implements Competing {
    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");


        String loadCapacity;

        LoadCapacity(String loadCapacity) {
            if (loadCapacity == null || loadCapacity.isBlank()) {
                this.loadCapacity = "данных по авто недостаточно";

            } else {
                this.loadCapacity = loadCapacity;
            }
        }

        public String getLoadCapacity() {
            return loadCapacity;
        }

        public void setLoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        @Override
        public String toString() {
            return loadCapacity;
        }
    }


    LoadCapacity loadCapacity;

    public Truck(float engineVolume, String brand, String model, LoadCapacity loadCapacity) {
        super(engineVolume, model, brand);
        this.loadCapacity = loadCapacity;
    }

    @Override

    public void startMoving() {
        System.out.println("Гузовик " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Гузовик " + getBrand() + " " + getModel() + " закончил поездку");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestLapTime(double d) {
        System.out.println("лучшее время круга " + getBrand() + " " + getModel() + d + " мин.");
    }

    @Override
    public void maximumSpeed(int b) {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + b + " км/ч.");
    }

    @Override
    public void Print() {
        System.out.println("Брэнд " + getBrand()
                + ", модель " + getModel()
                + ", объём двигателя "
                + getEngineVolume() + loadCapacity + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.getEngineVolume(), getEngineVolume()) == 0
                && getBrand().equals(transport.getBrand())
                && getModel().equals(transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume());
    }
}
