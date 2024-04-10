package Vehicle.ShallowCopy;

import Vehicle.Vehicle;

public class Bus implements Vehicle {
    private int id;
    private String brand;
    private String model;
    private String color;


    public Bus(){}

    private Bus(Bus bus){
        this.id = bus.id;
        this.brand = bus.brand;
        this.model = bus.model;
        this.color = bus.color;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
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

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
