package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {
    private Random rnd;

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
    }

    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(40);
    }
}
