package Weather.WantedWeatherData;

import Interface.DisplayElement;
import Interface.Observer.Observer;
import Interface.Subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    Subject subject;
    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying the weather forecast");
    }

    @Override
    public void update() {
        displayContent();
    }
}
