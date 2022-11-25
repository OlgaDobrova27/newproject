package Transport;

import java.util.HashSet;
import java.util.Set;

public class SetTransports {
    private Set<Transport> transports = new HashSet<>();

    public SetTransports() {
    }

    public void addTransport(Transport transport){
        transports.add(transport);
    }
    public void getInfoSetTransport(){
        for (Transport transport:
                transports) {
            System.out.println(transport);
        }
    }

    public Set<Transport> getTransports() {
        return transports;
    }
}
