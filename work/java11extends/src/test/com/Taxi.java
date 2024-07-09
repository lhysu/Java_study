package test.com;

public class Taxi {
    String area;
    int taxi_fare;

    public Taxi(){
        area ="seoul";
        taxi_fare = 4000;
    }

    public Taxi(String area, int taxi_fare) {
        this.area = area;
        this.taxi_fare = taxi_fare;
    }

    public void stop(){
        System.out.println("stop()...");
    }
}
