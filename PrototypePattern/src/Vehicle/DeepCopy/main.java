package Vehicle.DeepCopy;


public class main {
    public static void main(String[] args) {
        Car car = new Car();
        GpsSystem nasaGpsSystem = new GpsSystem();
        nasaGpsSystem.setName("NASA Gps");

        GpsSystem isroGpsSystem = new GpsSystem();
        isroGpsSystem.setName("ISRO Gps");

        car.setBrand("Maruti");
        car.setModel("600");
        car.setColor("White");
        car.setId(101);
        car.setGpsSystem(nasaGpsSystem);

        System.out.println(car);

        Car car1 = (Car) car.clone();
        car1.setColor("Blue");

        car1.getGpsSystem().setName("NASA GPS 2.0");

        System.out.println(car1);
        System.out.println(car);


    }
}
