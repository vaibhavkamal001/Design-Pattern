package AirTraffic;

import java.util.ArrayList;
import java.util.List;

public class ATCSystem implements AirTrafficControl {
    private List<Aircraft> aircrafts;

    public ATCSystem() {
        this.aircrafts = new ArrayList<>();
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void sendWarning(Aircraft aircraft, String message) {
        for (Aircraft a : aircrafts) {
            if (a != aircraft) {
                a.receiveWarning(message);
            }
        }
    }
}