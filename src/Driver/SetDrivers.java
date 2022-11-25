package Driver;

import java.util.HashSet;
import java.util.Set;

public class SetDrivers {
    private Set<Driver<?>> drivers = new HashSet<>();

    public SetDrivers() {
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void getInfoSetDriver(){
        for (Driver driver:
                drivers) {
            System.out.println(driver);
        }
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }
}