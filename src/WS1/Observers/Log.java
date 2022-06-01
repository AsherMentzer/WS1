package WS1.Observers;

import WS1.Enuns.Trend;
import WS1.Observables.WeatherMonitoringSystem;

public class Log {

    public void displayPressure(int data){
        System.out.println("Log: pressure = "+ data +" millibars");}
    public void displayPressureTrend(Trend data){
        System.out.println("Log: pressure trend = " + data);
    }

    public Log(WeatherMonitoringSystem weatherMonitoringSystem) {
        System.out.println(this.getClass().getSimpleName() + " was created");
        weatherMonitoringSystem.addPressureObserver(new LogPressObserver(this));
        weatherMonitoringSystem.addPressureTrendObserver(new LogPressTrendObserver(this));
    }
}
