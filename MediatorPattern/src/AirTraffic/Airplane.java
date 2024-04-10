package AirTraffic;

public class Airplane extends Aircraft {
    public Airplane(AirTrafficControl atc, String callSign) {
        super(atc, callSign);
    }

    @Override
    public void send(String message) {
        System.out.println(callSign + " sends message: " + message);
        atc.sendWarning(this, message);
    }

    @Override
    public void receiveWarning(String message) {
        System.out.println(callSign + " receives warning: " + message);
    }
}