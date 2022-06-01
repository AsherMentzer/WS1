package WS1.Observables;

public abstract class Sensor extends Observable{
    private int lastReading;
    private int interval;
    private String type;
    public Sensor(String type,int interval){
        this.type=type;
        this.interval=interval;
        AlarmClock.theInstance().register(interval,new SensorAlarmListener(this));
    }
    public void check(){
        int current=read();
        if(lastReading !=current){
            notifyObserver(current);
            lastReading=current;
        }
    }
    abstract protected int read();
}
