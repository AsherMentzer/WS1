package WS1.Observers;

import WS1.Enuns.Trend;

public class MSPressObserver implements Observer<Integer>{
    private MonitoringScreen itsMonitoringScreen;

    public MSPressObserver(MonitoringScreen itsMonitoringScreen) {
        this.itsMonitoringScreen = itsMonitoringScreen;
        System.out.println(this.getClass().getSimpleName() + " was created");
    }

    @Override
    public void update(Integer data) {
        itsMonitoringScreen.displayPressure(data);
    }
}
