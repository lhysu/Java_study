package test.com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main02Date {
    public static void main(String[] args) {
        System.out.println("hello");

        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                //hh: 12시 기준,  HH: 24시 기준

        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss.SSS초");
        System.out.println(sdf.format(d));

        //java.sql.Date sd = new java.sql.Date(0);  //최초시간
        java.sql.Date sd = new java.sql.Date(System.currentTimeMillis());   //현재 연월일
        System.out.println(sd);

        Timestamp ts = new Timestamp(0);        //최초 연월일, 시간
        System.out.println(ts);
        ts = new Timestamp(System.currentTimeMillis()); //현재 연월일, 시간
        System.out.println(ts);


        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR));        //2024 년
        System.out.println(gc.get(Calendar.MONTH));       //0-11 월
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));//일
        System.out.println(gc.get(Calendar.HOUR));        //시
        System.out.println(gc.get(Calendar.MINUTE));      //분
        System.out.println(gc.get(Calendar.SECOND));      //초
        System.out.println(gc.get(Calendar.MILLISECOND)); //밀리초

        System.out.println("========================");

        gc = new GregorianCalendar(2222,12,22,2,2,22);
        System.out.println(gc);
        System.out.println(gc.get(Calendar.YEAR));        //2024 년
        System.out.println(gc.get(Calendar.MONTH));       //0-11 월
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));//일
        System.out.println(gc.get(Calendar.HOUR));        //시
        System.out.println(gc.get(Calendar.MINUTE));      //분
        System.out.println(gc.get(Calendar.SECOND));      //초
        System.out.println(gc.get(Calendar.MILLISECOND)); //밀리초



    }//end main
}//end class
