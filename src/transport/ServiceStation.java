package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private String title;

    public ServiceStation(String title) {
        this.title = title;
    }

    private Queue<T> cars = new LinkedList<>();

    public  void addCarsQueue(T car) {
        cars.offer(car);
    }

    public void technicalInspectionCar() {
        T car = cars.poll();
        if (car instanceof RacingBus) {
            System.out.println(car + " автобусы не проходят диагностику ");
            technicalInspectionCar();
        } else if (car != null) {
            System.out.println("Проводиться техосмотр " + car);
            technicalInspectionCar();
        } else {
            System.out.println("В очереди на обсуживании никого нет");
        }
    }
}
