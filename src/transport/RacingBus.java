package transport;

import java.util.Objects;

public class RacingBus extends Transport implements Competing {
    public enum Capacyty {
        EXTRA_SMALL("до 10 мест"),
        SMALL("до 25 мест"),
        MEDIUM("40-50 мест"),
        LARGE("60-80 мест"),
        EXTRA_LARGE("100-120 мест");

        String capacyty;

        Capacyty(String capacyty) {
            if (capacyty == null || capacyty.isBlank()) {
                this.capacyty = "данных по авто недостаточно";

            } else {
                this.capacyty = capacyty;
            }

        }

        public String getCapacyty() {
            return capacyty;
        }

        public void setCapacyty(String capacyty) {
            this.capacyty = capacyty;
        }

        @Override
        public String toString() {
            return capacyty;
        }
    }


    Capacyty capacyty;

    public RacingBus(float engineVolume, String brand, String model, Capacyty capacyty) {
        super(engineVolume, model, brand);
        this.capacyty = capacyty;
    }


    @Override

    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил поездку");
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заехал на пит-стоп");
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
                + getEngineVolume() + " вместимость, " + capacyty + ".");

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

