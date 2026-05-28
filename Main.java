public class Main {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation("Addis Ababa Central");

        Sensor t = new Thermometer("T-01", "Roof");
        Sensor b = new Barometer("B-01", "Ground Floor");
        Sensor a = new Anemometer("A-01", "Tower");
        Sensor h = new Hygrometer("H-01", "Garden");

        station.addSensor(t);
        station.addSensor(b);
        station.addSensor(a);
        station.addSensor(h);

        station.runCycle();
        station.runCycle(true);

        System.out.println("Total sensors: " + station.getSensorCount());
    }
}
