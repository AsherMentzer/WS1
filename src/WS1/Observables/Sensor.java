package WS1.Observables;

public abstract class Sensor extends Observable{
    private int lastReading;
    private int interval;
    private String type;

    public String getType() {
        return type;
    }

    public Sensor(String type, int interval) {
        this.type = type;
        this.interval = interval;

        System.out.println(this.getClass().getSimpleName() + " was created");
        AlarmClock.theInstance().register(interval, new SensorAlarmListener(this));
        System.out.println(this.getClass().getSimpleName() + " registered to clock");
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
