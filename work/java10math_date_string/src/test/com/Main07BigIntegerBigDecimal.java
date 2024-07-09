package test.com;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Main07BigIntegerBigDecimal {
    public static void main(String[] args) {
        System.out.println("hello");

        //int 연산 후 결과값이 int max 값을 초과하면 자동캐스팅이 된다.
        int money = 2100000000;
        int ea = 200000000;
        System.out.println(money + ea);     //범위를 넘어가서 음수가 됌
        System.out.println(money - ea);
        System.out.println(money * ea);
        System.out.println(money / ea);
        System.out.println(money % ea);

        System.out.println("=======================");

        //BigInteger 클래스 타입을 사용하면 자동캐스팅 없이 연산 가능
        //대신, 사용데이터는 문자열이어야 한다.
        //산술연산 사용불가 >> 메소드로 처리
        BigInteger bmoney = new BigInteger("2100000000");
        BigInteger bea = new BigInteger("200000000");
        System.out.println(bmoney.add(bea));
        System.out.println(bmoney.subtract(bea));
        System.out.println(bmoney.multiply(bea));
        System.out.println(bmoney.divide(bea));
        System.out.println(bmoney.remainder(bea));

        System.out.println("========================");

        //BigInteger.valueOf() 함수 사용시 문자열이 아닌 정수 사용 가능
        BigInteger big1 = BigInteger.valueOf(9123456789012345678L);
        System.out.println(big1.multiply(bea));


        //큰소수문자열 처리
        BigDecimal bigDec1 = new BigDecimal("-3.141592");
        BigDecimal bigDec2 = new BigDecimal("-3.141592");

        System.out.println(bigDec1.add(bigDec2));
        System.out.println(bigDec1.subtract(bigDec2));
        System.out.println(bigDec1.multiply(bigDec2));
        System.out.println(bigDec1.divide(bigDec2));
        System.out.println(bigDec1.remainder(bigDec2));
        System.out.println("==========================");


        BigDecimal bigDec3 = BigDecimal.valueOf(1234.5678);
        System.out.println(bigDec3.multiply(bigDec3));

    }//end main


}//end class
