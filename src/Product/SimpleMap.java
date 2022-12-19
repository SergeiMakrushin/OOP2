package Product;

import java.util.HashMap;
import java.util.Objects;


public class SimpleMap {
    public static HashMap<String, Integer> simpleMap = new HashMap<>();
    private String title;
    private Integer number;

    public SimpleMap(String title, Integer number) {
        this.title = title;
        this.number = number;
    }

    public static void print() {
        simpleMap.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));
    }

    public static HashMap<String, Integer> getSimpleMap() {
        return simpleMap;
    }

    public static void setSimpleMap(SimpleMap r) {
        if (simpleMap.containsKey(r.getTitle()) || simpleMap.containsValue(r.getNumber())) {
            throw new RuntimeException("такая запись уже есть");
        } else {
            simpleMap.put(r.getTitle(), r.getNumber());
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static void addSimpleMap(String a, Integer c) {
        simpleMap.put(a, c);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleMap map = (SimpleMap) o;
        return Objects.equals(title, map.title) && Objects.equals(number, map.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, number);
    }
}
