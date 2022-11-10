package transport;

import java.util.Objects;

public class Truck extends Transport implements Competing {


    public Truck(float engineVolume, String brand, String model) {
        super(engineVolume, model, brand);

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
        System.out.println("лучшее время круга " + getBrand() + " " + getModel() + d+" мин.");
    }

    @Override
    public void maximumSpeed(int b) {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + b + " км/ч.");
    }

    @Override
    public void Print() {
        super.Print();
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
