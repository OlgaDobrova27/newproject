package Transport;

public class Bus extends Transport implements Competing {
    public enum Capacity {particularlySmall("до 10 мест"),
        small("до 25"),
        average("40–50"),
        large("60–80"),
        especiallyLarge("100–120 мест");

        private String description;

        Capacity(String description) {
            if (description == null) {
                System.out.println("Недостаточно информации!");
                return;
            }
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
    private Capacity capacity;

    public Bus(String brand, String model, double volume, Capacity capacity) {
        super(brand, model, volume);
        if (capacity == null){
            System.out.println("Недостаточно информации!");
            return;
        }
        this.capacity = capacity;
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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void fixCar() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " починен!");
    }

    @Override
    public void doPitStop() {
        System.out.println("Заправка автобуса " + getBrand() + " топливом, смена шин, быстрый ремонт и проверка технического состояния машины");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга у автобуса " + getBrand() + "- ");

    }

    @Override
    public void doMaxSpeed() {
        System.out.println("Максимальная скорость у автобуса " + getBrand() +" - ");
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity " + capacity;
    }
}
