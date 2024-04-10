import Command.CommandImpl.LightOnCommand;
import Command.Receiver.Light;

public class Main  {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Light livingRoomLight = new Light();
        livingRoomLight.setName("Living Room");

        Light GarageLight = new Light();
        GarageLight.setName("Garage ");

        Light ToiletLight = new Light();
        ToiletLight.setName("Toilet ");

        LightOnCommand lightOnCommandForLivingRoom = new LightOnCommand(livingRoomLight);
        LightOnCommand lightOnCommandForGarage = new LightOnCommand(GarageLight);
        LightOnCommand lightOnCommandForToilet = new LightOnCommand(ToiletLight);

        LightOnCommand lightOffCommandForLivingRoom = new LightOnCommand(livingRoomLight);
        LightOnCommand lightOffCommandForGarage = new LightOnCommand(GarageLight);
        LightOnCommand lightOffCommandForToilet = new LightOnCommand(ToiletLight);

        remote.setCommand(2,lightOnCommandForLivingRoom,lightOffCommandForLivingRoom);
        remote.setCommand(1,lightOnCommandForGarage,lightOffCommandForGarage);
        remote.setCommand(0,lightOnCommandForToilet,lightOffCommandForToilet);

        remote.onButtonWasPushed(0);
    }
}