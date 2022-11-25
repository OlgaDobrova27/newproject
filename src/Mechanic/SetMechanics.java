package Mechanic;

import java.util.HashSet;
import java.util.Set;

public class SetMechanics {
    private Set<Mechanic<?>> mechanics = new HashSet<>();

    public SetMechanics() {
    }

    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }

    public void getInfoSetMechanic(){
        for (Mechanic mechanic:
                mechanics) {
            System.out.println(mechanic);
        }
    }
    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }
}
