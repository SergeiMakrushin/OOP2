package Product;

import java.util.HashMap;
import java.util.Objects;

public class TelephoneDirectory {
    private static HashMap<String, String> listSubscribers = new HashMap<>();
    private String fullname;
    private String telepfoneNumber;


    public static void print() {
        listSubscribers.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));
    }

    public TelephoneDirectory(String fullname, String telepfoneNumber) {
        this.fullname = fullname;
        this.telepfoneNumber = telepfoneNumber;
    }

    public static HashMap<String, String> getListSubscribers() {
        return listSubscribers;
    }

    public static void setListSubscribers(TelephoneDirectory telephoneDirectory) {
        listSubscribers.put(telephoneDirectory.getFullname(), telephoneDirectory.getTelepfoneNumber());
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String follname) {
        this.fullname = follname;
    }

    public String getTelepfoneNumber() {
        return telepfoneNumber;
    }

    public void setTelepfoneNumber(String telepfoneNumber) {
        this.telepfoneNumber = telepfoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneDirectory that = (TelephoneDirectory) o;
        return Objects.equals(fullname, that.fullname) && Objects.equals(telepfoneNumber, that.telepfoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, telepfoneNumber);
    }
}
