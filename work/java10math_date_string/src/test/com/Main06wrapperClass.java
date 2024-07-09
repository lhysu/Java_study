package test.com;




public class Main06wrapperClass {
    public static void main(String[] args) {
        System.out.println("hello");


        //기본자료타입(프리미티브타입)에 대한 객체로 갖는 클래스들..
        System.out.println(Integer.MIN_VALUE);

        //10진수 >> 2진수
        System.out.println(Integer.toString(15,2));
        System.out.println(Integer.toBinaryString(15));

        //10진수 >> 8진수
        System.out.println(Integer.toString(15,8));
        System.out.println(Integer.toOctalString(15));

        //10진수 >> 16진수
        System.out.println(Integer.toString(15,16));
        System.out.println(Integer.toHexString(15));

        System.out.println(Integer.parseInt("100"));

        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);//true

        //Integer 타입에 정수가 할당되었을 때 주의할 점
        //1byte 범위를 벗어나면 equals로 비교해줘야 한다.****

        a=300;
        b=300;
        System.out.println(a==b);//false
        System.out.println(a.equals(b));//true




    }//end main


}//end class
