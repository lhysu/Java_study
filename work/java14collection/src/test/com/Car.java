package test.com;

import java.util.Objects;

public class Car {
    String model = "BMW";

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }



    //Set에서 주소가 아닌 속성값으로 비교하게 해줌
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }
}
