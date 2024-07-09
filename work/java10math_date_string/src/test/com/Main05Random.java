package test.com;


import java.util.Arrays;
import java.util.Random;

public class Main05Random {
    public static void main(String[] args) {
        System.out.println("hello");

        Random r =new Random();
        System.out.println(r.nextInt());        //4byte 정수 범위 내에서
        System.out.println(r.nextInt(5));        //0~4 범위 내에서
        System.out.println(r.nextDouble());        //난수 발생
        System.out.println(r.nextDouble(100));        //0~99 난수

        //java css javascript html jsp spring web을 문자배열에 넣으세요
        String str = "java css javascript html jsp spring web";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println(getRandomString(arr));
        //함수를 call할 때 함수에 static을 붙이거나 객체를 생성해서 호출해야 함.

        //주사위 3개를 랜덤하게 굴려서 나온 수의 합을 리턴하는 함수를 만들어 출력하세요

        System.out.println(RandomDice());

        //로또 번호 추첨기 1-45 중에서 6개의 수 출력(중복되도 상관 없음)
        //6개의 정수를 배열로 리턴받는 메소드 구현하기
        System.out.println(Arrays.toString(Lotto()));

    }//end main
    //랜덤 함수를 이용해서 배열에 들었는 문자열을 뽑고 출력하는 함수로 구현
    public static String getRandomString(String[] arr){
        System.out.println("getRandomString()...");

        Random r =new Random();
        String str = arr[r.nextInt(arr.length)];
        return str;
    }

    public static int RandomDice(){
        System.out.println("RandomDice()...");
        Random r = new Random();
        int r1 = r.nextInt(6)+1;
        int r2 = r.nextInt(6)+1;
        int r3 = r.nextInt(6)+1;
        System.out.println("r1:"+r1+" r2:"+r2+" r3: "+r3);
        return r1+r2+r3;

    }

    public static int[] Lotto(){
        int[] lotto = new int[6];
        Random r = new Random();

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45)+1;


        }
        Arrays.sort(lotto);
        return lotto;

    }


}//end class
