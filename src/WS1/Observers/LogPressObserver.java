package WS1.Observers;

public class LogPressObserver implements Observer<Integer>{
    private Log itsLog;

    public LogPressObserver(Log itsLog) {
        this.itsLog = itsLog;
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    @Override
    public void update(Integer data) {
        itsLog.displayPressure(data);
    }
}
