package WS1.Observables;

import WS1.Observables.AlarmClockRecord;
import WS1.Observables.AlarmListener;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {System.out.println(this.getClass().getSimpleName() + " was created");}
    public static AlarmClock theInstance()
    {
        if(null==instance) {
            instance = new AlarmClock();
        }
        return instance;
    }

    protected void tic(){
        for (AlarmClockRecord alarmRecord:itsAlarmClockRecords) {
            int remaningTime=alarmRecord.getRemainingTime()- this.CLOCK_INTERVAL_MILLIS;
            if(remaningTime<=0){
                alarmRecord.itsAlarmListener.wakeup();
                alarmRecord.setRemainingTime(alarmRecord.getInterval());
            }
            else{
                alarmRecord.setRemainingTime(remaningTime);
            }
        }
    }

    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval,pal));
    }
}

