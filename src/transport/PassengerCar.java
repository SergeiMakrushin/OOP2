package transport;

import java.util.Objects;

public class PassengerCar extends Transport implements Competing {

    public PassengerCar(float engineVolume, String brand, String model) {
        super(engineVolume, model, brand);

    }

    @Override

    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " заехал на пит-стоп");
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
    public void endMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил поездку");
    }

    @Override
    public void Print() {
        super.Print();
    }

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
