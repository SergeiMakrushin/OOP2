package transport;

public class Train extends Transport {

    private int priceTrip;
    private int timeTrip;
    private String nameDepartureStation;
    private String finalStop;
    private int numberOfWagons;


    public Train(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed,
                 String nameDepartureStation, String finalStop, int priceTrip, int numberOfWagons, String fuel) {
        super(brand, model, productionYear, productionCountry, maxMovementSpeed, fuel);
        setPriceTrip(priceTrip);
        setNameDepartureStation(nameDepartureStation);
        setFinalStop(finalStop);
        setNumberOfWagons(numberOfWagons);

    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = Math.abs(priceTrip);
    }


    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        if (nameDepartureStation == null || nameDepartureStation.isBlank()) {
            this.nameDepartureStation = "Название станции отсутствует";
        } else {
            this.nameDepartureStation = nameDepartureStation;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isBlank()) {
            this.finalStop = "Название станции отсутствует";
        } else {
            this.finalStop = finalStop;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = Math.abs(numberOfWagons);
    }

    @Override


    public void startMoving() {

    }

    public void endMoving() {

    }


    @Override
    public String toString() {
        return "Поезд " + super.getBrand() +
                ", модель " + super.getModel() +
                " , " + super.getProductionYear() +
                " год выпуска " + super.getProductionCountry() +
                ", скорость движения " + super.getMaxMovementSpeed() +
                " км/ч, отходит от " + nameDepartureStation +
                " и следует до станции " + finalStop +
                ". Цена поездки - " + priceTrip +
                ", в поезде " + numberOfWagons +
                " вагонов, вид топлива:" + super.getFuel();
    }

}
