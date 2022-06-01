package WS1.Observables;

import WS1.Enuns.Trend;
import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer<Integer> {
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    public Trend pressureState;
    public Trend lastState= Trend.STABLE;

    public PressureTrendSensor(int lastReading1) {
        this.lastReading1 = lastReading1;
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
        Trend current = calc();
        if (lastState != current) {
            notifyObserver(current);
            lastState = current;
        }
    }


    @Override
    public void update(Integer data) {
        lastReading3 = lastReading2;
        lastReading2 = lastReading1;
        lastReading1 = data;
        check();
    }
}
