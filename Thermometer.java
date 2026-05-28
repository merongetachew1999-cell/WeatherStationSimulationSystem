public class Thermometer extends Sensor {

    private double minTemp;
    private double maxTemp;

    public Thermometer(String sensorId, String location) {
        super(sensorId, location, "°C");
        this.minTemp = -89.2;
        this.maxTemp = 56.7;
    }

    @Override
    public double measure() {
        double raw = -10 + Math.random() * 50;
        return Math.round(raw * 10.0) / 10.0;
    }

    public void setRange(double min, double max) {
        if (min < max) {
            this.minTemp = min;
            this.maxTemp = max;
        }
    }

    public double getMinTemp() { return minTemp; }
    public double getMaxTemp() { return maxTemp; }
}
