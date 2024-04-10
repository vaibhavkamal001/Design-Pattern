package Vehicle.DeepCopy;

public class GpsSystem {
    private String name;

    public GpsSystem(){

    }

    @Override
    public String toString() {
        return "GpsSystem{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GpsSystem(GpsSystem gpsSystem){
        this.name = gpsSystem.name;
    }

    public GpsSystem clone(){
        return new GpsSystem(this);
    }
}
