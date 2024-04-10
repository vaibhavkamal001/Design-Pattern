package AirTraffic;

public abstract class Aircraft {
    protected AirTrafficControl atc;
    protected String callSign;

    public Aircraft(AirTrafficControl atc, String callSign) {
        this.atc = atc;
        this.callSign = callSign;
    }

    public abstract void send(String message);

    public abstract void receiveWarning(String message);
}