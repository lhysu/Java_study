package test.com;


import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //상속관계를 표현하는 제네릭
        //상속관계의 객체가 필요하다.
        //Car <--- Bus <--- BigBus
        //Car <--- Taxi <--- BigTaxi

        //하위의 클래스는 상위 클래스 타입이다.

        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Bus());
        cars.add(new BigBus());
        cars.add(new Taxi());
        cars.add(new BigTaxi());
        System.out.println(cars.size());
        System.out.println(cars);

        System.out.println("===============================");

        List<Bus> cars2 = new ArrayList<>();
        //cars2.add(new Car());     //error
        cars2.add(new Bus());
        cars2.add(new BigBus());
        //cars2.add(new Taxi());    //error
        //cars2.add(new BigTaxi()); //error
        System.out.println(cars.size());
        System.out.println(cars);

        System.out.println("===============================");

        List<Taxi> cars3 = new ArrayList<>();
        //cars3.add(new Car());
        //cars3.add(new Bus());
        //cars3.add(new BigBus());
        cars3.add(new Taxi());
        cars3.add(new BigTaxi());
        System.out.println(cars.size());
        System.out.println(cars);

        System.out.println("===============================");

        List<BigBus> cars4 = new ArrayList<>();
        //cars4.add(new Car());
        //cars4.add(new Bus());
        cars4.add(new BigBus());
        //cars4.add(new Taxi());
        //cars4.add(new BigTaxi());
        System.out.println(cars.size());
        System.out.println(cars);

        System.out.println("===============================");
        List<BigTaxi> cars5 = new ArrayList<>();
        //cars5.add(new Car());
        //cars5.add(new Bus());
        //cars5.add(new BigBus());
        //cars5.add((BigTaxi) new Taxi());    //캐스팅을 하면 컴파일 오류는 나지 않지만 실행오류가 난다.
        cars5.add(new BigTaxi());
        System.out.println(cars.size());
        System.out.println(cars);

    }//end main
}//end class
