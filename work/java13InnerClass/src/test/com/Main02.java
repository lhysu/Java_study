package test.com;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("hello");

        //1.익명내부클래스 - 변수할당가능, 함수인자전달, 리턴문에 할당
        //Mother
        Mother m = new Mother() {
            @Override
            public void play() {
                System.out.println("play()...1");
            }
        };
        m.play();
        test(m);

        test(new Mother() {
            @Override
            public void play() {
                System.out.println("play()...2");
            }
        });

        Mother m2 = test2();
        m2.play();


    }//end main

   public static void test(Mother m){
        m.play();
   }

   public static Mother test2(){
        return new Mother() {
            @Override
            public void play() {
                System.out.println("play()...3");
            }
        };
   }


}//end class
