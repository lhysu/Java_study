package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("hello");

        //예외처리(try~catch)와 예외전가(throws)
        //call한 쪽에서 예외처리
        try{
            test01();

        }catch(Exception ex){
            System.out.println("catch....");
        }
        System.out.println("==================");

        test02();


        System.out.println("end main...");
    }//end main

    private static void test02() {
        BufferedReader br = null;
        InputStreamReader isr = null;
        InputStream is = null;
        try {
            System.out.println(10/0);       //에러 발생해서 catch 문으로 넘어감
            is = System.in;
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String name = br.readLine();
            System.out.println("name:"+name);
        } catch (Exception e) {
            System.out.println("Exception catch...");
        }finally{
            //마지막에 만들어진 것부터 close

            //is, br, isr이 초기화 되지 않은 상태(null)에서 close >> 에러
            /*try { br.close(); } catch (IOException e) { }
            try { isr.close(); } catch (IOException e) { }
            try { is.close(); } catch (IOException e) { }*/

            //분기 처리로 에러 방지
            if(br!=null)try { br.close(); } catch (IOException e) { }
            if(isr!=null)try { isr.close(); } catch (IOException e) { }
            if(is!=null)try { is.close(); } catch (IOException e) { }



        }

    }

    private static void test01() throws ArithmeticException {

        System.out.println(10/0);       //여기서 예외처리를 하지 않고 떠넘김
        System.out.println(Integer.parseInt("a011"));

    }


}//end class
