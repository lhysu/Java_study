public class Main05_while2 {
    public static void main(String[] args) {
        System.out.println("hello");

        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i==5)break;
        }
        //주의: 상단의 무한반복문내부에 break문이 없을 경우
        //하단의 코딩은 컴파일 오류 발생
        System.out.println("end main...");
    }//end main
}//end class
