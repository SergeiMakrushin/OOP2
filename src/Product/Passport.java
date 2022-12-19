package Product;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public class Passport {
    private int passportNumber;
    private String surname;
    private String name;
    private String middleName;
    private String dateBirth;

    public String getDateBirth() {
        return dateBirth;
    }

    public static List<Passport> passports = new LinkedList<Passport>();

    public static List<Passport> getPassports() {
        return passports;
    }

    public Passport(int passportNumber, String surname, String name, String middleName, String dateBirth) {
        setPassportNumber(passportNumber);
        setSurname(surname);
        setName(name);
        setMiddleName(middleName);
        setDateBirth(dateBirth);

    }

    public static void addPassport(Passport obj) {
        for (int i = 0; i < passports.size(); i++) {
            if (passports.get(i).getPassportNumber() == obj.getPassportNumber()) {
                passports.add(i, obj);
                break;
            }
        }
        passports.add(obj);
    }


    public static void printPassports() {
        for (int i = 0; i < passports.size(); i++) {
            System.out.println(passports.get(i));
        }
    }

    public static Passport getPassportByPassportNumber(int passportNumber) {
        for (int i = 0; i < passports.size(); i++) {
            if (passports.get(i).getPassportNumber() == passportNumber) {
                return passports.get(i);
            }
        }
        return null;
    }


    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        if (passportNumber < 000001 || passportNumber > 999999) {
            throw new RuntimeException("неверный номер паспорта");
        } else {
            this.passportNumber = passportNumber;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isBlank()) {
            throw new RuntimeException("неверно введена фамилия");
        } else {
            this.surname = surname;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("неверно введено имя");
        } else {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        if (middleName == null || !middleName.matches("А-Яа-я")) {
            this.middleName = middleName;
        } else {
            throw new RuntimeException("неверно введено отчество");
        }
    }


    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }

    public void setDateBirth(String dateBirth) {
        if (dateBirth.length() != 10) {
        }
        if (dateBirth.matches("0-9[.]")) {
            throw new RuntimeException("неверный формат даты");
        } else {
        }
        this.dateBirth = dateBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber && surname.equals(passport.surname) && name.equals(passport.name) && Objects.equals(middleName, passport.middleName) && dateBirth.equals(passport.dateBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, surname, name, middleName, dateBirth);
    }
}
