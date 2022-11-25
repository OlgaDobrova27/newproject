import Driver.DriverCategoryB;
import Driver.DriverCategoryC;
import Driver.DriverCategoryD;
import Driver.SetDrivers;
import Mechanic.Mechanic;
import ServiceStation.ServiceStation;
import Sponsor.Sponsor;
import Sponsor.SetSponsors;
import Transport.Transport;
import Transport.Bus;
import Transport.Car;
import Transport.Truck;
import Transport.SetTransports;
import Mechanic.SetMechanics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;






public class Main {
        public static void main(String[] args) {
            Sponsor tinkoff = new Sponsor("Тинькофф", 250000);
            Sponsor redBull = new Sponsor("Red Bull", 400000);

            Mechanic<Transport> shmelev = new Mechanic("Семен", "Шмелев", "Infinity");
            Mechanic<Truck> popov = new Mechanic("Артем", "Попов", "Buz");

            Car audi = new Car("Audi", "A8", 3.0, null);
            Car lada = new Car("Lada", "Grande", 1.7, Car.BodyType.Minivan);
            Car bmw = new Car("BMW", "Z8", 3.0, Car.BodyType.Coupe);
            Truck toyota = new Truck("Toyota", "F45", 3.0, Truck.LoadCapacity.N2);
            Truck mers = new Truck("Mercedes", "W32", 2.5, Truck.LoadCapacity.N3);
            Truck chevrolet = new Truck("Chevrolet", "M5", 2.7, Truck.LoadCapacity.N2);
            Bus mercedes = new Bus("Mercedes", "M45", 2.9, null);
            Bus wv = new Bus("WV", "AM21", 3.2, Bus.Capacity.large);
            Bus opel = new Bus("Opel", "S8", 2.9, Bus.Capacity.particularlySmall);

            passDiagnostics(audi, lada, bmw,
                    toyota, mers, chevrolet,
                    mercedes, wv, opel);

            DriverCategoryB ivan = new DriverCategoryB("Ivan", "B", 7, lada);
            DriverCategoryC bob = new DriverCategoryC("Bob", "C", 14, toyota);
            DriverCategoryD maxim = new DriverCategoryD("Maxim", "D", 3, wv);


            SetDrivers setDrivers = new SetDrivers();
            setDrivers.addDriver(ivan);
            setDrivers.addDriver(ivan);
            setDrivers.addDriver(maxim);
            setDrivers.addDriver(maxim);
            setDrivers.addDriver(ivan);
            setDrivers.addDriver(bob);
            setDrivers.getInfoSetDriver();

            SetMechanics setMechanics = new SetMechanics();
            setMechanics.addMechanic(shmelev);
            setMechanics.addMechanic(popov);
            setMechanics.getInfoSetMechanic();

            SetSponsors setSponsors = new SetSponsors();
            setSponsors.addSponsor(tinkoff);
            setSponsors.addSponsor(redBull);
            setSponsors.addSponsor(redBull);
            setSponsors.addSponsor(redBull);
            setSponsors.getInfoSetSponsor();

            SetTransports setTransports = new SetTransports();
            setTransports.addTransport(lada);
            setTransports.addTransport(toyota);
            setTransports.addTransport(bmw);
            setTransports.addTransport(bmw);
            setTransports.addTransport(mercedes);
            setTransports.getInfoSetTransport();

            ServiceStation ss = new ServiceStation();
            ss.addAuto(lada);
            ss.addAuto(toyota);
            ss.diagnostics();
            ss.diagnostics();


        }



    private static void passDiagnostics(Transport... transports){
        for (Transport transport : transports) {
            diagnosticsTransport(transport);
        }

    }

    private static void diagnosticsTransport(Transport transport){
        try {
            if(!transport.passDiagnostics()){
                throw  new RuntimeException(transport.getClass() + " " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

