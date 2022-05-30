package WS1.Observables;

public abstract class Sensor {
    private int lastReading;
    private int interval;
    private String type;
    public Sensor(String type,int interval){
        this.type=type;
        this.interval=interval;
    }
    public void check(){}
    abstract protected int read();
}
