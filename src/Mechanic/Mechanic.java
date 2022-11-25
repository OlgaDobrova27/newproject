package Mechanic;

import java.util.Objects;
import Transport.Transport;


public class Mechanic<T extends Transport> {
    private String name;
    private String surname;
    private String company;


    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean passDiagnostics(T t){
        return t.passDiagnostics();
    }

    public void fixCar(T t){
        t.fixCar();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(surname, mechanic.surname) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }

    @Override
    public String toString() {
        return "Механики " + name + " " + surname + '\'' + ", из " + company;
    }
}

