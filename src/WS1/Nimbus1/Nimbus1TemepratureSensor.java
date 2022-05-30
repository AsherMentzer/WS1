package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor {
    private Random rnd;

    public Nimbus1TemepratureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    protected int read() {
        return 0;
    }
}
