public class Main05_while3 {
    public static void main(String[] args) {
        System.out.println("hello");
        // 문자열 비교 시 사용하는 함수(메소드): equals()
        System.out.println("kim"=="kim");
        System.out.println("kim"==new String("kim"));
        System.out.println("kim".equals("kim"));
        System.out.println("kim".equals(new String("kim")));

        String x = "y";
        int i = 0;
        while(!x.equals("x")){
            System.out.println(x);
            x="x";

        }
        //주의: 상단의 무한반복문내부에 break문이 없을 경우
        //하단의 코딩은 컴파일 오류 발생
        System.out.println("end main...");
    }//end main
}//end class
