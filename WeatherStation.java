import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private String stationName;
    private List<Sensor> sensors;

    public WeatherStation(String stationName) {
        this.stationName = stationName;
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor s) {
        sensors.add(s);
    }

    public void runCycle() {
        System.out.println("=== Station: " + stationName + " ===");
        for (Sensor s : sensors) {
            s.report();
        }
        System.out.println();
    }

    public void runCycle(boolean verbose) {
        System.out.println("=== Station: " + stationName + " [verbose] ===");
        for (Sensor s : sensors) {
            s.report(verbose);
        }
        System.out.println();
    }

    public int getSensorCount() { return sensors.size(); }
}