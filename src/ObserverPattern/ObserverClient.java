package ObserverPattern;

/**
 *
 * */
public class ObserverClient {
    public void sendThink(){
        WeatherReport weatherReport = new WeatherReport();
        Person p1 = new Person();
        p1.setName("Peter");
        Person p2 = new Person();
        p2.setName("Jordon");
        Person p3 = new Person();
        p3.setName("Aki");
        weatherReport.add(p1);
        weatherReport.add(p2);
        weatherReport.add(p3);
        weatherReport.notifyWeather("rain",18);
        weatherReport.notifyWeather("wind",25);
        weatherReport.notifyWeather("sunny",10);
    }

    public static void main(String[] args) {
        ObserverClient o = new ObserverClient();
        o.sendThink();
    }
}
