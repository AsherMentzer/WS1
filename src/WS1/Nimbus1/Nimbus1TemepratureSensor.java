package WS1.Nimbus1;

import WS1.Observables.AlarmClock;
import WS1.Observables.Sensor;
import WS1.Observables.SensorAlarmListener;

import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor {
    private Random rnd;

    public Nimbus1TemepratureSensor(String type) {
        super(type, 700);
    }

    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(40);
    }
}
