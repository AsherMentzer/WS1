package WS1.Observers;

public class MSTempObserver implements Observer<Integer> {

    private MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen itsMonitoringScreen) {
        this.itsMonitoringScreen = itsMonitoringScreen;
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    @Override
    public void update(Integer data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
