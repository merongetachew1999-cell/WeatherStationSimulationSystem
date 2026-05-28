public abstract class Sensor {

    private String sensorId;
    private String location;
    protected String unit;

    public Sensor(String sensorId, String location, String unit) {
        this.sensorId = sensorId;
        this.location = location;
        this.unit = unit;
    }

    public String getSensorId() { return sensorId; }
    public String getLocation()  { return location; }
    public String getUnit()      { return unit; }

    public void setSensorId(String sensorId) {
        if (sensorId != null && !sensorId.isEmpty()) {
            this.sensorId = sensorId;
        }
    }

    public abstract double measure();

    public void report() {
        System.out.println("[" + sensorId + "] " + getClass().getSimpleName()
            + " at " + location + ": " + measure() + " " + unit);
    }

    public void report(boolean verbose) {
        report();
        if (verbose) {
            System.out.println("  Unit: " + unit + " | ID: " + sensorId);
        }
    }
}