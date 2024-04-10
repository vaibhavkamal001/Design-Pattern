import Car.CarBuilder;
import Car.Director;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        director.buildBugatti(carBuilder);

        System.out.println(carBuilder);

        director.buildLambo(carBuilder);
        carBuilder.build();

        System.out.println(carBuilder);
    }
}