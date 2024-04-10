package Vehicle.ShallowCopy;

import Vehicle.DeepCopy.GpsSystem;
import Vehicle.Vehicle;

public class Car implements Vehicle {
    private int id;
    private String brand;
    private String model;
    private String color;

    private GpsSystem gpsSystem;


    public Car() {
    }

    public GpsSystem getGpsSystem() {
        return gpsSystem;
    }

    public void setGpsSystem(GpsSystem gpsSystem) {
        this.gpsSystem = gpsSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", gpsSystem=" + gpsSystem +
                '}';
    }

    private Car(Car car) {
        this.id = car.id;
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.gpsSystem = car.gpsSystem;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
