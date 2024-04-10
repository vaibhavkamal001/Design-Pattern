package Command.Receiver;

public class Light {
    public String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void on(){
        System.out.println(getName()+" Light is On.");
    }
    public void off(){
        System.out.println(getName()+" Light is off.");
    }
}
