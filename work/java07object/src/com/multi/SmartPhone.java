package com.multi;

public class SmartPhone {
    String model;
    int price;
    double weight;
    String version;

    public SmartPhone(){
        System.out.println("SmartPhone()...");
        model = "Galaxy";
        price = 100;
        weight = 50;
        version = "S23";

    }

    public SmartPhone(String model, int price, double weight, String version){
        System.out.println("SmartPhone(model, price, weight, version)...");
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.version = version;
    }

}
//소스코드 줄 정리: Ctrl + shift + Alt + L
