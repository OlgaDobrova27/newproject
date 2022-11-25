package Sponsor;

import java.util.Objects;

public class Sponsor {
    private String name;

    private int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void sponsorTheRace(){
        System.out.println("Спонсор " + getName() +  " проспонсировал заезд на " + getAmount());
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Спонсоры:" +  name + " " + ", сумма" + amount;
    }
}
