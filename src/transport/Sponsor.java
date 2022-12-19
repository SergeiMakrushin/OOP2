package transport;

public class Sponsor {
    private String name;
    private int sumSupport;


    public Sponsor(String name, int sumSupport) {
        this.name = name;
        this.sumSupport = sumSupport;
    }

    public String getName() {
        return name;
    }

    public int getSumSupport() {
        return sumSupport;
    }

    public void setSumSupport() {
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", sumSupport=" + sumSupport +
                '}';
    }
}
