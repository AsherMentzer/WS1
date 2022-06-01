package WS1.Observables;

import WS1.Enuns.Trend;
import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer<Integer> {
    private int lastReading1 = 0;
    private int lastReading2 = 0;
    private int lastReading3 = 0;
    private Trend pressureState = Trend.STABLE;
    private Trend lastState= Trend.STABLE;

    public PressureTrendSensor(Sensor pressSensor){
        System.out.println(this.getClass().getSimpleName() + " was created");

        pressSensor.addObserver(this);

        System.out.println(this.getClass().getSimpleName() + " observes " + pressSensor.getClass().getSimpleName());
    }

    public Trend calc() {
        if (lastReading3 < lastReading2 && lastReading2 < lastReading1) {
            return Trend.RISING;
        }
        if (lastReading3 > lastReading2 && lastReading2 > lastReading1)
            return Trend.FALLING;

        return Trend.STABLE;
    }

    public void check() {
        if (lastState != pressureState) {
            notifyObserver(pressureState);
            lastState = pressureState;
        }
    }


    @Override
    public void update(Integer data) {
        lastReading3 = lastReading2;
        lastReading2 = lastReading1;
        lastReading1 = data;
        pressureState = calc();
        check();
    }
}
