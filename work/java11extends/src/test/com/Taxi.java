package test.com;

public class Taxi extends Car {
    String area = "A";
    int taxi_fare = 3400;
    int price = 4000;

    public Taxi(){
        System.out.println("Taxi()...");
    }

    public void stop(){
        System.out.println("stop()...");
        System.out.println(model);
        System.out.println(price);      //this.price
        System.out.println(super.price);
        System.out.println(area);
        System.out.println(taxi_fare);
    }

    @Override
    public void start() {
        System.out.println("Taxi start()...");
    }
}
