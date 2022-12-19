package Product;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class NewMap {
    private static Map<Integer, String> valores = new TreeMap<>();

    private Integer number;
    private String title;

    public NewMap(Integer number, String title) {
        this.number = number;
        this.title = title;
    }

    public static void setValores(NewMap newMap) {
        valores.put(newMap.getNumber(), newMap.getTitle());
    }

    public static void Print() {
        valores.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));
    }

    public Map<Integer, String> getValores() {
        return valores;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewMap newMap = (NewMap) o;
        return Objects.equals(number, newMap.number) && Objects.equals(title, newMap.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title);
    }

    @Override
    public String toString() {
        return "NewMap{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }
}
