package WS1.Observables;

import WS1.Enuns.Trend;
import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Observers.Observer;

public class WeatherMonitoringSystem {

    Sensor tempSensor;
    Sensor pressSensor;
    PressureTrendSensor pressTrendSensor;

    private static WeatherMonitoringSystem instance = null;

    protected WeatherMonitoringSystem() {
        System.out.println(this.getClass().getSimpleName() + " was created");

        Nimbus1Clock.theInstance();
        pressSensor = new Nimbus1PressureSensor("Pressure", 1100);
        tempSensor = new Nimbus1TemperatureSensor("Temperature", 700);
        pressTrendSensor = new PressureTrendSensor(pressSensor);
    }

    public void addTemperatureObserver(Observer<Integer> observer) {
        tempSensor.addObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes " + tempSensor.getClass().getSimpleName());
    }

    public void addPressureObserver(Observer<Integer> observer) {
        pressSensor.addObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes " + pressSensor.getClass().getSimpleName());
    }

    public void addPressureTrendObserver(Observer<Trend> observer) {
        pressTrendSensor.addObserver(observer);
        System.out.println(observer.getClass().getSimpleName() + " observes " + pressTrendSensor.getClass().getSimpleName());
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null)
            instance = new WeatherMonitoringSystem();

        return instance;
    }


}
