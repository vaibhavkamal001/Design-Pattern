package Weather.WeatherData;

import Interface.Observer.Observer;
import Interface.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Observer Added "+ observer.toString());
    }

    @Override
    public void notifyObserver() {
        for (Observer value : observers) {
            value.update();
            System.out.println("Observer notified "+ value.toString());
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        int indexOF = observers.indexOf(observer);
        if(indexOF!=-1){
            observers.remove(indexOF);
            System.out.println("Observer removed "+observer.toString());
        }
    }

    public void updateAppeared(){
        notifyObserver();
    }
}
