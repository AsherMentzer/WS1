package WS1.Observables;

public class AlarmClockRecord {
    private int interval;
    private int remainingTime;
    AlarmListener itsAlarmListener;

    public AlarmClockRecord(int interval,AlarmListener alarmListener) {
        remainingTime = this.interval = interval;
        this.itsAlarmListener=alarmListener;

        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    public int getInterval() {
        return interval;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public AlarmListener getItsAlarmListener() {
        return itsAlarmListener;
    }
}
