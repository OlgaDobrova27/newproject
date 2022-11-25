package Transport;

public class Truck extends Transport implements Competing {
    public enum LoadCapacity {N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");
        private String description;

        LoadCapacity(String description) {
            if (description == null){
                System.out.println("Недостаточно информации!");
                return;
            }
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double volume, LoadCapacity loadCapacity) {
        super(brand, model, volume);
        if (loadCapacity == null){
            System.out.println("Недостаточно информации!");
            return;
        }
        this.loadCapacity = loadCapacity;
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
        return Math.random() > 0.6;
    }

    @Override
    public void fixCar() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public void doPitStop() {
        System.out.println("Заправка грузовика " + getBrand() + " топливом, смена шин, быстрый ремонт и проверка технического состояния машины");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга у грузовика " + getBrand() + " - ");

    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + " - ");
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", load capacity " + loadCapacity;
    }
}
