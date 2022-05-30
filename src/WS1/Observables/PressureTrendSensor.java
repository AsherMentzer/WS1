package WS1.Observables;

import WS1.Enuns.Trend;

public class PressureTrendSensor {
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    public Trend pressureState;
    public Trend lastState;

    public PressureTrendSensor(int lastReading1) {
        this.lastReading1 = lastReading1;
    }
    public Trend calc(){
        return Trend.FALLING;
    }
    public void check(){}

    public void update(int data){

    }
}
