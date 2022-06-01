package WS1.Nimbus1;

import WS1.Observables.Sensor;

import java.util.Random;

public class Ninbus1PressureSensor extends Sensor {
    private Random rnd;

    public Ninbus1PressureSensor(String type) {
        super(type, 1100);
    }

    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(950,1050);
    }
}
