package test.com;

public class Car {
    String model;
    int price;

    public Car(){
        model = "hh";
        price = 100;
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }


    public void start(){
        System.out.println("start()...");
    }
}
