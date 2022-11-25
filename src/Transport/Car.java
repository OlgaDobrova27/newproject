package Transport;

import Transport.Competing;
import Transport.Transport;

public class Car extends Transport implements Competing {
    public enum BodyType {Sedan,
        Hatchback,
        Coupe,
        StationWagon,
        SUV,
        Crossover,
        PickupTruck,
        Van,
        Minivan;
    }
    private BodyType bodyType;
    public Car(String brand, String model, double volume, BodyType bodyType) {
        super(brand, model, volume);
        if (bodyType == null){
            System.out.println("Данных по автомобилю не достаточно!");
            return;
        }
        this.bodyType = bodyType;
    }



    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("Нажать на педаль сцепления, завести двигатель, включить первую передачу, снять с ручного тормоза, нажать педаль газа, отпустить сцепление.");

    }

    @Override
    public void finish() {
        System.out.println("Выжимаем педаль тормоза и педаль сцепления до полной остановки, включаем нейтральную передачу, ставим на ручной тормоз, отпускаем педалиб выключаем двигатель.");
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void fixCar() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена!");
    }


    @Override
    public void doPitStop() {
        System.out.println("Заправка автомобиля " + getBrand() + " топливом, смена шин, быстрый ремонт и проверка технического состояния машины");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга у автомобиля " + getBrand() + " - ");

    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Максимальная скорость у автомобиля " + getBrand() + " - ");
    }

    @Override
    public String toString() {
        return super.toString() + ", body type= " + bodyType;
    }
}
