package test.com;

public class Bus extends Car{
    int count;
    int bus_fare;
    String model = "0000";  //super가 가지고 있는 전역변수를 재초기화

    public Bus(){
        //super();        //상속을 받으면 자동으로 생성(눈에 안보임) - Car()의 생성자 호출
        System.out.println("Bus()...");

    }

    public void open(){
        System.out.println("open()...");
        System.out.println(count);
        System.out.println(price);
        System.out.println(bus_fare);
        System.out.println(this.model);
        System.out.println(super.model);

       //같은 이름의 자원이 있을 경우 this(가까운 곳)부터 인식


        //상속을 받으면 객체를 따로 생성하지 않고도
        //상속해준 객체의 자원을 클래스 내부에서 사용 가능
    }
    //super 클래스의 메소드 재정의 - 오버라이딩
    @Override
    public void start(){
        System.out.println("Bus start()...");
    }       //car에 있는 것보다 범위가 좁아지면 안됌.
}
