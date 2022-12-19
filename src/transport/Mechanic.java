package transport;

public class Mechanic<T extends Transport> {
    private String fullName;
    private String company;
    public T transport;

    public Mechanic(String fullName, String company, T transport) {
        this.fullName = fullName;
        this.company = company;
        this.transport = transport;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public T getTransport() {
        return transport;
    }

    public void performMaintenance() {
        System.out.println("Механник " + fullName + " проводит техническое обслуживание " + transport);
    }

    public void fixCar() {
        System.out.println("Механник " + fullName + " ремонтирует " + transport);
    }

    @Override

    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", transport=" + transport +
                '}';
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }
}
