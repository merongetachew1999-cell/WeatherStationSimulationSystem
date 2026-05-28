public class Anemometer extends Sensor {

    private double maxWindSpeed;
    private String windCategory;

    public Anemometer(String sensorId, String location) {
        super(sensorId, location, "km/h");
        this.maxWindSpeed = 0.0;
        this.windCategory = "Calm";
    }

    @Override
    public double measure() {
        double raw = Math.random() * 80;
        double rounded = Math.round(raw * 10.0) / 10.0;
        updateCategory(rounded);
        return rounded;
    }

    private void updateCategory(double speed) {
        if (speed < 1) {
            windCategory = "Calm";
        } else if (speed < 20) {
            windCategory = "Light breeze";
        } else if (speed < 50) {
            windCategory = "Moderate wind";
        } else {
            windCategory = "Strong wind";
        }

        if (speed > maxWindSpeed) {
            maxWindSpeed = speed;
        }
    }

    public String getWindCategory() { return windCategory; }
    public double getMaxWindSpeed() { return maxWindSpeed; }

    @Override
    public void report() {
        super.report();
        System.out.println("  Category: " + windCategory);
    }
}