package Weather.WantedWeatherData;

import Interface.DisplayElement;
import Interface.Observer.Observer;
import Interface.Subject.Subject;


public class CurrentConditionDisplay implements Observer, DisplayElement{
    Subject subject;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update() {
        displayContent();
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying the weather information");
    }
}
