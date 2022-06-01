package WS1.Observers;

import WS1.Enuns.Trend;

public class LogPressTrendObserver implements Observer<Trend> {

    private Log itsLog;

    public LogPressTrendObserver(Log itsLog) {
        this.itsLog = itsLog;
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    @Override
    public void update(Trend data) {
        itsLog.displayPressureTrend(data);
    }
}
