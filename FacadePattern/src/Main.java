import Device.DVDPlayer;
import Device.Projector;
import Device.Screen;
import Device.SoundSystem;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer,soundSystem,projector,screen);

        homeTheaterFacade.watchMovie("3 Idiot");
        soundSystem.setVolume(11);
        homeTheaterFacade.endMovie();

    }
}