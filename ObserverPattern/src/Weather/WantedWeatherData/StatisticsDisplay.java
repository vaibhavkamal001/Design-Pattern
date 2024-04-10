package Weather.WantedWeatherData;

import Interface.DisplayElement;
import Interface.Observer.Observer;
import Interface.Subject.Subject;

public class StatisticsDisplay implements Observer,DisplayElement {
    Subject subject;
    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying the weather Statistics");
    }

    @Override
    public void update() {
        displayContent();
    }
}
