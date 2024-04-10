package Vehicle.ShallowCopy;

public class GpsSystem {
    private String name;
    

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

}
