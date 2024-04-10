package Car;

public class CarBuilder implements Builder{
    private int id;
    private String brand;
    private String model;
    private String color;

    @Override
    public Builder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(this.id,this.brand,this.model,this.color);
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
