package Transport;

import java.util.Objects;
import Driver.Driver;
import Mechanic.Mechanic;
import Sponsor.Sponsor;

public abstract class Transport {
    private String brand;
    private String model;
    private double volume;

    public Transport(String brand, String model, double volume) {
        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
            return;
        }
        this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
            return;
        }
        this.model = model;
        if (volume < 0){
            this.volume = Math.abs(volume);
            return;
        }
        this.volume = volume;

    }

    public abstract void start();

    public abstract void finish();

    public abstract boolean passDiagnostics();

    public abstract void fixCar();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public String toString() {
        return "Transport " +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ' ';
    }


}

