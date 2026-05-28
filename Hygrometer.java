public class Hygrometer extends Sensor {

    private double humidity;
    private boolean highHumidityAlert;

    public Hygrometer(String sensorId, String location) {
        super(sensorId, location, "%RH");
        this.humidity = 0.0;
        this.highHumidityAlert = false;
    }

    @Override
    public double measure() {
        humidity = Math.round((30 + Math.random() * 60) * 10.0) / 10.0;
        highHumidityAlert = humidity > 80.0;
        return humidity;
    }

    public boolean isHighHumidityAlert() { return highHumidityAlert; }

    public String getComfortLevel() {
        if (humidity < 30) return "Dry";
        if (humidity < 60) return "Comfortable";
        return "Humid";
    }

    @Override
    public void report() {
        super.report();
        System.out.println("  Comfort: " + getComfortLevel());
        if (highHumidityAlert) {
            System.out.println(" High humidity alert!");
        }
    }
}