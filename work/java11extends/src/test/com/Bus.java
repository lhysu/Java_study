package test.com;

public class Bus {
    int count;
    int bus_fare;

    public Bus(){
        count = 1;
        bus_fare = 1300;

    }

    public Bus(int bus_fare, int count) {
        this.bus_fare = bus_fare;
        this.count = count;
    }

    public void open(){
        System.out.println("open()...");
    }
}
