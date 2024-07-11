package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        p.sleep();

        System.out.println("========Man========");

        //1.Man이 Person을 상속받아서 구현(전역변수재초기화, 오버라이딩)
        Man man = new Man();
        System.out.println(man.name);
        System.out.println(man.age);
        System.out.println(man.eye);
        System.out.println(man.money);
        man.sleep();
        man.eat();

        System.out.println("====================");


        //2.다형성 객체생성(Person 객체생성(Man, 익명내부클래스)

        Person p2 = new Man();
        System.out.println(p2.name);
        System.out.println(p2.age);
        p2.sleep();

        System.out.println("====================");

        Person p3 = new Person(){
          String aa = "aaa";
          public void run(){
              System.out.println("Anonymous...run()");
          }

            @Override
            public void sleep() {
                System.out.println("Anonymous...sleep()");
                run();
            }
        };
        p3.sleep();

        System.out.println("=======Student========");

        //3.Student가 Person을 상속받아서 구현(전역변수재초기화, 오버라이딩)
        Student st = new Student();
        System.out.println(st.name);
        System.out.println(st.age);
        st.sleep();
        st.study();

        System.out.println("=====================");


        //4.다형성 객체생성(Person 객체생성(Student, 익명내부클래스)
        Person p4 = new Student();
        System.out.println(p4.name);
        System.out.println(p4.age);
        p4.sleep();

        Person p5 = new Person(){
          String bb = "bb";
          public void walk(){
              System.out.println("Anonymous...walk()");
          }
        };
        p5.sleep();



    }//end main
}//end class
