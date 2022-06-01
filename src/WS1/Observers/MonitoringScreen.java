package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {

    public void displayPressure(int data){
        System.out.println("MonitoringScreen: pressure = " + data + " millibars");
    }
    public void displayTemperature(int data){
        System.out.println("MonitoringScreen: temperature = "+ data +" Celsius");
    }

    public MonitoringScreen(WeatherMonitoringSystem weatherMonitoringSystem) {

        System.out.println(this.getClass().getSimpleName() + " was created");
        weatherMonitoringSystem.addTemperatureObserver(new MSTempObserver(this));
        weatherMonitoringSystem.addPressureObserver(new MSPressObserver(this));

    }
}
