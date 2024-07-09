package test.com;


public class Main04Stringbuffer {
    public static void main(String[] args) {
        System.out.println("hello");

        //대용량 문자열 처리 객체
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();     //둘중 뭘 쓰든 상관 없음

        //문자열 추가
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        sb.append("hello");
        System.out.println(sb.toString());  //가장 효율이 좋음

        String str = "";
        str += "hello";
        str += "hello";
        str += "hello";
        str += "hello";
        System.out.println(str);    //가장 효율이 떨어짐

        String str2 = "";
        str2 = str2.concat("hello").concat("hello").concat("hello").concat("hello");
        System.out.println(str2);

        //프로세스 경과 시간 체크하기
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 200000; i++) {
            //str += "hello";       //43초
            sb.append("hello");     //0.009초
        }
        //System.out.println(str.length());
        System.out.println(sb.length());

        System.out.println(System.currentTimeMillis()-startTime);

        //문자열 뒤집기
        String txt = "abcdef";



    }//end main
}//end class
