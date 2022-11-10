package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxMovementSpeed, String fuel) {
        super(brand, model, productionYear, productionCountry, color, maxMovementSpeed, fuel);

    }




    public  void startMoving() {

    }
    public  void endMoving () {

    }
    @Override
    public String toString() {
        return "Автобус " + super.getBrand() +
                ", модель " + super.getModel() +
                ", год выпуска " + super.getProductionYear() +
                ", страна производства " + super.getProductionCountry() +
                ", цвет " + super.getColor() +
                ", максимальная скорость " + super.getMaxMovementSpeed() +
                " км/ч." + ", вид топлива: " + super.getFuel();

    }
}
