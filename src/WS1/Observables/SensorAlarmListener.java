package WS1.Observables;

public class SensorAlarmListener implements AlarmListener{

    Sensor itsSensor;

    public SensorAlarmListener(Sensor itsSensor) {
        this.itsSensor = itsSensor;
    }

    @Override
    public void wakeup() {
        itsSensor.check();
    }
}
