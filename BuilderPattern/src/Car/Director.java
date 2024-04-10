package Car;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti").id(101).model("BUGATTI Chiron").color("Black");
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini").id(102).model("Lamborghini Chiron").color("Yellow");
    }
}
