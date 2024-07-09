package test.com;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main03String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("hello");

        String txt = "abcdefg";
        System.out.println(txt);

        //문자열의 길이
        System.out.println("legnth(): "+txt.length());

        //문자열에서 한글자씩 뽑기
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }

        //문자열을 문자배열 char[]로 변환
        char[] cs = txt.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }

        //문자열비교
        System.out.println(txt.equals("abcdefg"));  //대소문자 구분
        System.out.println(txt.equalsIgnoreCase("aBCdefg"));  //대소문자 구분안함

        System.out.println(txt.compareTo("abcdefg"));   //0을 반환하면 같은 문자열, 대소문자 구분
        System.out.println(txt.compareToIgnoreCase("abcdefg"));   //0을 반환하면 같은 문자열, 대소문자 구분 안함

        //문자열에서 찾고자하는 단어의 위치(포지션, 인덱스)를 반환, 처음찾아지는 위치를 반환
        txt = "abcabcabc";
        System.out.println(txt.indexOf("a"));   //처음 찾아지는 위치를 반환
        System.out.println(txt.indexOf("bc"));
        System.out.println(txt.indexOf("z"));       //없으면 -1 반환
        System.out.println(txt.lastIndexOf("a"));//마지막 찾아지는 위치를 반환
        System.out.println(txt.lastIndexOf("bc"));
        System.out.println(txt.lastIndexOf("z"));       //없으면 -1 반환

        //시작하는 문자열 검증 - 참거짓 반환
        System.out.println(txt.startsWith("ab"));
        //끝나는 문자열 검증
        System.out.println(txt.endsWith("bc"));

        txt = "무궁화 꽃이 피었습니다.";
        System.out.println(txt.length());

        //문자열 추출
        System.out.println(txt.substring(4));   //명시한인덱스부터 끝까지 추출
        System.out.println(txt.substring(4,5));   //시작인덱스부터 끝인덱스 전까지 추출

        //"꽃"이라는 글자부터 "습"이라는 글자까지 추출
        System.out.println(txt.substring(txt.indexOf("꽃"),txt.indexOf("습")+1));

        //문자열 결합
        txt = "오징어게임";
        System.out.println(txt + "문어게임");
        System.out.println(txt.concat("문어게임"));

        txt = "A";
        System.out.println(txt.hashCode());
        txt = "AA";
        System.out.println(txt.hashCode());

        //문자열 치환
        txt = "java javascript 1234 html css";
        System.out.println(txt.replace("java","JAVA"));
        //첫번째 발견되는 문자열 치환
        System.out.println(txt.replaceFirst("java","JAVA"));
        //정수형식의 문자열을 정규표현식으로 찾아서 치환
        System.out.println(txt.replaceAll("\\d+","????"));

        //구분자가 있는 문자열을 배열로 반환
        String[] arr = txt.split(" ");
        System.out.println(Arrays.toString(arr));

        txt = "java:html:css";
        System.out.println(Arrays.toString((txt.split(":"))));

        //문자열에서 찾고자하는 문자열의 유무를 반환(boolean)
        System.out.println(txt.contains("css"));

        //문자열을 바이트배열로 변환
        txt = "abcdABCD";
        byte[] bs = txt.getBytes("utf-8");
        System.out.println(Arrays.toString(bs));

        //대소문자 변환
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //문자열 뒤집기
        System.out.println(new StringBuffer(txt).reverse());
        System.out.println(new StringBuffer(txt).reverse().toString());

        //숫자모양 문자열을 숫자타입으로 변환
        System.out.println(Integer.parseInt("10")+10);
        System.out.println(Double.parseDouble("10.0")+10);

        //정수 >> 문자열
        int x = 10;         //기본타입
        System.out.println(String.valueOf(x));

        Integer y = 20;     //객체타입
        System.out.println(y.toString());

        //정수 >> 문자열(2진수, 8진수, 10진수, 16진수...)
        int sum = 26;
        System.out.println(Integer.toString(sum));              //10진수
        System.out.println(Integer.toString(sum,2));      //2진수
        System.out.println(Integer.toString(sum,8));      //8진수
        System.out.println(Integer.toString(sum,16));      //16진수
        System.out.println(Integer.toString(sum,32));      //32진수



    }//end main
}//end class
