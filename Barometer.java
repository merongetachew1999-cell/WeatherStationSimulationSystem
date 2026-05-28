public class Barometer extends Sensor {

    private double minPressure;
    private double maxPressure;

    public Barometer(String sensorId, String location) {
        super(sensorId, location, "hPa");
        this.minPressure = 870.0;
        this.maxPressure = 1084.0;
    }

    @Override
    public double measure() {
        double raw = 980 + Math.random() * 60;
        return Math.round(raw * 10.0) / 10.0;
    }

    public void setRange(double min, double max) {
        if (min < max) {
            this.minPressure = min;
            this.maxPressure = max;
        }
    }

    public double getMinPressure() { return minPressure; }
    public double getMaxPressure() { return maxPressure; }
}