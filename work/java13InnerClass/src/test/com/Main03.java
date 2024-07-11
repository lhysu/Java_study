package test.com;

public class Main03 {
    //전역영역에서 클래스 선언 가능
    Car c = new Car() {
        @Override
        public void drive() {
            System.out.println("drive()...1");
        }
    };


    public static void main(String[] args) {
        System.out.println("hello");


        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...1");
            }
        };
        car.drive();

        test(car);

        test(new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...2");
            }
        });


        test2().drive();


    }//end main

    public static void test(Car car){
        car.drive();
    }

    public static Car test2(){
        return new Car() {
            @Override
            public void drive() {
                System.out.println("drive()...3");
            }
        };
    }

}//end class
