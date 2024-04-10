import Device.DVDPlayer;
import Device.Projector;
import Device.Screen;
import Device.SoundSystem;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, SoundSystem soundSystem, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.pullDown();
        projector.on();
        projector.setInput(dvdPlayer);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        soundSystem.on();
        soundSystem.setVolume(10);
        soundSystem.setSurroundSound();
    }

    public void endMovie() {
        System.out.println("Shutting down the movie...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.pullUp();
    }
}