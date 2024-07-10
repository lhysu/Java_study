package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //자동차 - 모델명, 가격 : 출발기능
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();
        System.out.println("==================");

        //버스 - 카운트, 버스요금 : 문열기
        Bus bus = new Bus();
        System.out.println(bus.count);
        System.out.println(bus.bus_fare);
        bus.open();

        //자동차를 상속받고 난 이후에는 Car의 자원(멤버) 사용 가능
        System.out.println(bus.model);
        System.out.println(bus.price);
        bus.start();

        //Car와 Bus가 상속관계인 경우 다형성을 이용한 객체생성 가능
        //다형성 - 부모타입 변수 초기화시 자식타입의 생성자로 객체생성가능
        //      - 단, 자원사용 제한(부모자원만 사용 가능)
        Car car2 = new Bus();
        System.out.println(car2.price);
        System.out.println(car2.model);
        car2.start();
        System.out.println("=================");

        //자동상속: extends라는 예약어 없고 클래스 이름도 없이 상속 관계가 성립
        //다형성 + 내부클래스
        Car car3 = new Car(){
            //이름없는 클래스영역, Car 클래스를 자동 상속
            String status;

            public void sleep(){
                System.out.println("sleep()...");
                System.out.println(status); //내부에선 사용 가능
                System.out.println(model);
                System.out.println(price);
            }
            @Override
            public void start(){
                System.out.println("Anonymous start()...");
                sleep();
            }
        };
        //System.out.println(car3.status);      //error - car3는 Car의 자원만 사용 가능
        System.out.println(car3.model);
        System.out.println(car3.price);

        System.out.println("=========Taxi=========");

        //택시 - 분야, 택시요금 : 정지기능
        Taxi taxi = new Taxi();
        System.out.println(taxi.area);
        System.out.println(taxi.taxi_fare);
        taxi.stop();

        System.out.println("====================");

        //Taxi가 Car 상속받고 자원 출력하기
        System.out.println(taxi.model);
        System.out.println(taxi.price);
        taxi.start();

        System.out.println("====================");

        //다형성 객체 상속 및 출력하기
        Car car4 = new Taxi();
        System.out.println(car4.model);
        System.out.println(car4.price);
        car4.start();

        System.out.println("=====================");
        Car car5 = new Car(){
            int level;
            public void move(){
                System.out.println("move()...");
                System.out.println(level);
                System.out.println(price);
                System.out.println(model);
            }
            @Override
            public void start(){
                System.out.println("Anonymous start()...");
                move();
            }
        };

        System.out.println(car5.price);
        System.out.println(car5.model);
        car5.start();       //재정의된것으로 호출


    }//end main
}//end class

//class간에는 단일 상속(하나만 상속받을 수 있음)
//인터페이스는 다중상속 가능
