package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Ninbus1PressureSensor extends Sensor {
    private Random rnd;

    public Ninbus1PressureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    protected int read() {
        return 0;
    }
}
